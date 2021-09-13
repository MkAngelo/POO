<?php
require_once('account.php');
class Car{
    public $id;
    public $license;
    public $driver;
    public $passenger;

    public function _construct($license, $driver){
        $this->license = $license;
        $this->driver = $driver;
    }

    public function printDataCar(){
        echo"license: $this->license, Driver: {$this->driver->name}, document: {$this->driver->document}";
    }
}
?>