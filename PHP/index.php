<?php
require_once("Car.php");
require_once("uberX.php");
require_once("uberPool.php");
require_once("Account.php"); 
require_once("uberVan.php");  
require_once("uberBlack.php");
require_once("Payment.php");
require_once("paypal.php");
require_once("Card.php");            //TRAEMOS LAS CLASES QUE HICIMOS

$uberX = new uberX("ART234",new Account("Angres Herrera","AND456"),"Chevrolet","Spark");        //CREAMOS UN NUEVO OBJETO
$uberX->printDataCar();

$uberPool = new UberPool("DLC281",new Account("Marco Garcia","CDM234"),"Nissan","Actitude");
$uberPool->printDataCar();

$uberVan = new UberVan("JOL098",new Account("Guillermo Martinez","GM09876"),"Mazda","Piel");
$uberVan->printDataCar();

$uberBlack = new UberBlack("PIR09862",new Account("Eduardo Fonseca","JOI0987"),"Audi","Piel");
$uberBlack->printDataCar();

$card = new Card("Jose Quiroz","CARD","5000");
$card->printDataPay();

$paypal = new Paypal("Miguel Sanchez","Paypal","miguel@gmail.com");
$paypal->printDataPay();

$cash = new Paypal("Felipe Regio","Cash","3000");
$cash->printDataPay();
?>