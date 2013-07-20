<?
define('WSURL', 'http://127.0.0.1/CWSDLGeneratorDocument/syncService.php?wsdl');
$client = new SoapClient(WSURL, array('trace' => 1));

// object
$obj = new stdClass();
$obj->Array2X = new stdClass();
$obj->Array2X->items = array('HELLO', 'WORLD');
$result = $client->getHelloWorld($obj);
print_r($result->return);
print "<br />";

// array
$result = $client->getHelloWorld2($obj->Array2X->items);
print_r($result->return);
print "<br />";

// string with SESSION
$obj = new stdClass();
$obj->login = '111';
$obj->pass = '222';
$result = $client->auth($obj);
print_r($result->return);
print "<br />";

// string
$obj = new stdClass();
$obj->obj = '111';
$obj->obj2 = '222';
$result = $client->getTest($obj);
print_r($result->return);
print "<br />";
//print_r($client);

