import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car{                                    //iniciacion de la clase
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    private Integer passenger;

    public UberVan(String license, Account driver){
        super(license, driver);
    }

    public UberVan(String license, Account driver,
    Map<String, Map<String,Integer>> typeCarAccepted,
    ArrayList<String> seatsMaterial){                           //constructor
        super(license, driver);  
        this.typeCarAccepted = typeCarAccepted;      //representa los metodos de la super clase
        this.seatsMaterial = seatsMaterial;  
    }

    @Override   //POLIMORFISMO
    public void setPassenger(Integer passenger) {
        if(passenger == 6){
            this.passenger = passenger;
        }else{
            System.out.println("NECESITAS ASIGNAR 6 PASAJEROS");
        }
        super.setPassenger(passenger);
    }
}