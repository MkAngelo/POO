<?php
require_once('Payment.php');
class Paypal extends Payment{
    public $email;

    public function __construct($name,$type,$email){
        parent::__construct($name,$type);
        $this->email = $email;
    }
}
?>