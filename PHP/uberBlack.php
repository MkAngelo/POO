<?php
class UberBlack extends Car{
    public $typeCarAccepted;
    public $seatsMaterial;

    public function __construct($license, $driver, $typeCarAccepted,$seatsMaterial){
        parent::_construct($license,$driver);
        $this->typeCarAccepted =   $typeCarAccepted;
        $this->seatsMaterial = $seatsMaterial;
    }
}
?>