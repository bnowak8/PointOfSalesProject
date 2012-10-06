
package pointofsales;

import java.text.NumberFormat;


public class Receipt {
    private String pattern = "%-5s%-15s%-5s%-7s%-7s%-7s\n";
    private NumberFormat nf = NumberFormat.getCurrencyInstance();
    private Customer customer;
    private LineItem[] lineItems = new LineItem[0];
    private int amtItems;

    
    public Receipt(Customer customer){
        this.customer = customer;
    }
    
    public void addItem(Product product, int prodQty){

        amtItems++;        
        
        LineItem item = new LineItem(product, prodQty);
        
        populateLineItems(item);
    }
    
    public void populateLineItems(LineItem item){
        LineItem[] tempItemArray = new LineItem[amtItems];
        System.arraycopy(lineItems, 0, tempItemArray, 0, lineItems.length);
        tempItemArray[lineItems.length] = item;
        lineItems = tempItemArray;
    }
    
    public double calcTotal(){
        double total = 0.0;
        for(LineItem item : lineItems){
            total += item.getTotalBeforeDiscount();
        }
        return total;
    }
    
    public double calcTotalDiscount(){
        double total = 0.0;
        for(LineItem item : lineItems){
            total += item.getProduct().getDiscountAmt();
        }
        return total;
    }
    
    public void printReceipt(){
        System.out.println("Customer: " + customer.getName() + "\n" + 
                "Customer Id: " + customer.getCustID() + 
                "\n\nProducts:" + "\n===============================================");
        System.out.printf(pattern,"Id","Name","Qty","Price","Total","Discount");
        
        for(LineItem item : lineItems){
            System.out.printf(pattern,item.getProduct().getProdId(), item.getProduct().getName(), item.getProdQty(), nf.format(item.getProduct().getPrice()) ,nf.format(item.getTotalBeforeDiscount()),nf.format(item.getProduct().getDiscountAmt()));
        }
        System.out.println("===============================================");
        System.out.printf(pattern, "","","","Total Discount",nf.format(calcTotalDiscount()), "");
        System.out.printf(pattern, "","","","","Total",nf.format(calcTotal()-calcTotalDiscount()));
    }    
}
