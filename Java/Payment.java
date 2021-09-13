class Payment{
    Integer id;
    Integer monto;

    public Payment(Integer monto) {
        this.monto = monto;
    }

    void printDataPay(){
        System.out.println("Monto: " + monto);
    }
}