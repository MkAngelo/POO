var car = new Car("AW432",new Account("Andres Herrera","AH01901"))
car.passenger = 4;
car.printDataCar();

var car = new Car("GJ092",new Account("Jorge Garcia","JG8972"))
car.passenger = 4;
car.printDataCar();

var uberX = new UberX("AS987",new Account("Andres Figueroa","AF0l09"),"Chevrolet","Spark")
uberX.passenger = 4;
uberX.printDataCar();

var uberpool = new UberPool("ER098",new Account("Alan Valentino","AV0989"), "Nissan", "Altima")
uberpool.passenger = 4;
uberpool.printDataCar();

var uberBlack = new UberBlack("OP0231",new Account("Jaime Torres","JT0987"), "Audi", "Piel")
uberBlack.passenger = 6;
uberBlack.printDataCar();

var uberVan = new UberVan("RE2089",new Account("Juan Martinez","JM1029"), "Mazda", "Piel")
uberVan.passenger = 8;
uberVan.printDataCar();

var card = new Payment(new Card("TARJERA","0009","098","2020","Banamex"),new Account("Jose Martinez","JM0987"))
card.printDataPay();

var paypal = new Payment(new Paypal("PayPal","alain09@gmail.com"),new Account("Alain Juanico", "AJ1230"))
paypal.printDataPay();