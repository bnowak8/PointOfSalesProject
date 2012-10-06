
package pointofsales;

public class CashRegister {
    private IDiscountStrategy noDiscount = new NoDiscount();
    private IDiscountStrategy halfOffDiscount = new HalfOffDiscount();
    Receipt receipt;
    Customer[] customers = {
        new Customer("John Walker", "0"),
        new Customer("Liz Runner","1"),
        new Customer("Randy Marsh","2"),
        new Customer("Stan Lee", "3")
    };
    
    Product[] products = {
        new Product("Hammer","0",9.99, noDiscount ),
        new Product("Saw","1",5.00, halfOffDiscount),
        new Product("Screwdriver","2",2.99, noDiscount),
        new Product("Wrench","3",6.99, halfOffDiscount)
    
    };
    
    public void startSale(String custId){

        Customer customer = null;
        for (Customer c: customers){
            if(custId.equals(c.getCustID())){
                customer = c;
            }
        }
        if (customer != null){
        receipt = new Receipt(customer);            
        }
    }
    public void enterItem(String prodId, int prodQty){
        Product product = null;
        for (Product p : products){
            if(prodId.equals(p.getProdId())){
                product = p;
            }
        }
            if (product != null){
                receipt.addItem(product, prodQty);
                }
    }
    
    public void printReceipt(){
        receipt.printReceipt();
    }
    
}
