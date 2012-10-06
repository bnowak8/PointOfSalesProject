
package pointofsales;

public class Product {
    private String name, prodId;
    private double price;
    private int prodQty = 0;
    private IDiscountStrategy discount;

    
    public Product (String name,String prodId, double price, IDiscountStrategy discount){
        this.prodId = prodId;
        this.name = name;
        this.price = price;
        this.discount = discount;
    }



    public String getName() {
        return name;
    }

    public String getProdId() {
        return prodId;
    }

    public double getPrice() {
        return price;
    }
    
    public void setProdQty(int prodQty) {
        this.prodQty = prodQty;
    }
    
    public double getDiscountAmt(){
        return discount.getDiscount(price, prodQty);
    }
}
