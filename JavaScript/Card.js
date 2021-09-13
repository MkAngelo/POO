class Card extends Payment{
    constructor(id,number,cvv,fv,bank){
        super(id)
        this.number = number;
        this.fv = fv;
        this.cvv = cvv;
        this.bank = bank;
    }
}

