<?php
require_once('Payment.php');
class Cash extends Payment{
    public $monto;

    public function __construct($name,$type,$monto){
        parent::__construct($name,$type);
        $this->monto = $monto;
    }
}
?>