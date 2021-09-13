class Cash extends Payment{
    String moneda;

    public Cash(Integer monto, String moneda){
        super(monto);
        this.moneda = moneda;
    }
}
