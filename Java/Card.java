class Card extends Payment{
    String bank;
    String number;

    public Card(Integer monto, String bank, String number){
        super(monto);
        this.bank = bank;
        this.number = number;
    }
}