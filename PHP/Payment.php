<?php
require_once('Account.php');
class Payment{
    public $id;
    public $name;

    public function __construct($name,$type){
        $this->name = $name;
        $this->type = $type;
    }

    public function printDataPay(){
        echo" NAME: $this->name, Type: $this->type";
    }
}
?>