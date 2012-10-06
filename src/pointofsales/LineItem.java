
package pointofsales;

public class LineItem {
    private Product product;
    private int prodQty;
    
    public LineItem(Product product, int prodQty){
        this.product = product;
        this.prodQty = prodQty;
    }
    
    public double getTotalBeforeDiscount(){
                
        return product.getPrice() * prodQty;
    }

    public Product getProduct() {
        return product;
    }

    public int getProdQty() {
        product.setProdQty(prodQty);
        return prodQty;
    }

    
}
