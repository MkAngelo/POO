class UberPool extends Car{//iniciacion de la clase
    String brand;
    String model;

    public UberPool(String license, Account driver, String brand, String model){//constructor
        super(license, driver);//representa los metodos de la super clase
        this.brand = brand;//metodos de la clase hija
        this.model = model;//metodos de la clase hija
    }
}