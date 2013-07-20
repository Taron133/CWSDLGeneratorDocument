<?

/**
 * Class Array2X
 * @package Array2X
 * @soap
 */
class Array2X {
    /**
     * @var string items {minOccurs=0, maxOccurs=unbounded}
     * @soap
     */
    public $items;
}

/**
 * @package Sync
 * @soap
 */
class Sync {
    /**
     * @var string $no
     * @soap
     */
    public $no;

    /**
     * auth doc
     * @param string $login
     * @param string $pass
     *
     * @return bool
     * @soap
     */
    public function auth($login, $pass) {
        global $_SESSION;
        $_SESSION['login'] = $login;
        $_SESSION['pass'] = $pass;
        return true;
    }

    /**
     * exitAuth doc
     * @return bool
     * @soap
     */
    public function exitAuth() {
        global $_SESSION;
        $_SESSION['login'] = '';
        $_SESSION['pass'] = '';
        return true;
    }

    /**
     * getHelloWorld doc
     * @param Array2X $Array2X
     *
     * @return string
     * @soap
     */
    public function getHelloWorld($Array2X) {
        return $Array2X->items[0].' '.$Array2X->items[1];
    }

    /**
     * getHelloWorld2 doc
     * @param string $arr {minOccurs=0, maxOccurs=unbounded}
     *
     * @return string
     * @soap
     */
    public function getHelloWorld2($arr) {
        return $arr[0].' '.$arr[1];
    }

    /**
     * @param string $obj
     * @param string $obj2
     *
     * @return string
     * @soap
     */
    public function getTest($obj, $obj2) {
        return $obj.'_'.$obj2;
    }
}

/**
 * SyncSoapServer class
 */
class SyncSoapServer extends SoapServer {
    public function __construct($wsdl, array $options = null) {
        parent::SoapServer($wsdl, $options);
    }
    public function fault ($code, $string, $actor = null, $details = null, $name = null) {
        throw new SoapFault($code, $string, $actor, $details, $name);
    }
}

class Sync_LiteralDocumentProxy {
    public function __call($methodName, $args) {
        $soapClass = new Sync();
        $arr = $args[0];
        if (is_object($arr)) $arr = get_object_vars($arr);

        $result = call_user_func_array(array($soapClass, $methodName), $arr);
        return array('return' => $result);
    }
}