class Paypal extends Payment{
    String email;

    public Paypal(Integer monto, String email){
        super(monto);
        this.email = email;
    }
}
