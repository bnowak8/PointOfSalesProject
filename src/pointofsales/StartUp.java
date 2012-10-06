
package pointofsales;

public class StartUp {

    public static void main(String[] args) {

        CashRegister register = new CashRegister();
        
        register.startSale("1");
        register.enterItem("1", 2);
        register.enterItem("2", 2);
        register.printReceipt();
    } 
}
