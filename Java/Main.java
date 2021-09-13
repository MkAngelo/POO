class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        UberX uberx = new UberX("AMQ123", new Account("Andres Herrera", "AMQ123"),"chevrolet","sonic");
        //uberx.passegenger = 4;
        uberx.setPassenger(4);
        uberx.printDataCar();
        //System.out.println("Car License:" + car.license);
        
        // Car car2 = new Car("QWE567", new Account("Pedro Salazar", "PS09876"));
        // car2.passegenger = 3;
        // car2.printDataCar();
        //System.out.println("Car license: " + car2.license);

        // UberBlack carro = new UberBlack("HOJ0928", Account("Eliot","Eloj09"), "Chevrolet", "Piel");
        // //carro.passegenger = 5;
        // carro.printDataCar();

        UberVan uberVan = new UberVan("FGH345", new Account("Andres Herrera", "AND123"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();

        Paypal pago = new Paypal(4000, "example@gmail.com");
        pago.printDataPay();

        Card tarjeta = new Card(3200,"Banorte","098762");
        tarjeta.printDataPay();

        Cash dinero = new Cash(50,"Peso Mexicano");
        dinero.printDataPay();
    }
}
