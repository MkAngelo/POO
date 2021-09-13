<?php
require_once('Payment.php');
class Card extends Payment{
    public $m;

    public function __construct($name,$type,$m){
        parent::__construct($name,$type);
        $this->m = $m;
    }
}
?>