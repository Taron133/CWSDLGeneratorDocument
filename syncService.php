<?
include_once('Sync.php');
include_once('CWSDLGeneratorDocument.php');

$wsdl = 'wsSync.wsdl';
$wsdl_http = 'http://127.0.0.1/CWSDLGeneratorDocument/syncService.php';
$classService = 'Sync';
if (/*'GET' == $_SERVER['HTTP_METHOD'] ||*/ 'GET' == $_SERVER['REQUEST_METHOD']) {
    if (isset($_GET['makedoc'])) { //docs
        $wgen = new CWsdlGeneratorDocument();
        $wgen->generateWsdl($classService, $wsdl_http);
        exit();
    }
	//if (!file_exists($wsdl))
	{
		$wgen = new CWsdlGeneratorDocument();
        $wgen->namespace = $wsdl_http;
		file_put_contents($wsdl, $wgen->generateWsdl($classService, $wsdl_http));
	}

	//header('Content-type: application/xml');
    print file_get_contents($wsdl);
} else {
	/* NT auth
    if (!isset($_SERVER["REMOTE_USER"]) || $_SERVER["REMOTE_USER"] == '') {
        header('HTTP/1.1 401 Unauthorized');
        header('WWW-Authenticate: Negotiate');
        header('WWW-Authenticate: NTLM', false);
        exit;
    }
	*/

    try {
        $server = new SoapServer($wsdl);
        $server->setClass($classService.'_LiteralDocumentProxy'); // for parameters in function and good result
        $server->setPersistence(SOAP_PERSISTENCE_SESSION); // for session support
        $server->handle();
    } catch (SoapFault $exc) {
        echo $exc->getTraceAsString();
    }
}

