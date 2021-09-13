from car import Car
from account import Account
from UberX import UberX
from UberPool import UberPool
from UberBlack import UberBlack
from UberVan import UberVan


if __name__ == "__main__":
    print("\n--------------------------\nEn UBER hacemos cosas geniales para ti <3\n\n")
    print("Cuentas de conductores:\n")
    car = Car("AMS234", Account("Andres Herrera", "ANDA876"))
    #print(vars(car))
    print(vars(car.driver))

    otro_car = Car("JKS0982",Account("Jose Molina","AFJ0873"))
    #print(vars(otro_car))
    print(vars(otro_car.driver))
    print("------------------------------------\n")
    print("Vehiculos:\n")
    
    # uberx = UberX("ADL098",Account("Jose Molina", "AFJ0873"),"Nissan","Sentra")
    # print(vars(uberx))
    uberPool = UberPool("JO0987",Account("Jose Molina", "AFJ0873"),"Toyota","High")
    print(vars(uberPool))