function Payment(type,user){
    this.id;
    this.type = type;
    this.user = user;
}

Payment.prototype.printDataPay = function(){
    console.log(this.user.name)
    console.log(this.type)
}
