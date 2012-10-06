
package pointofsales;

public class HalfOffDiscount implements IDiscountStrategy{
    private double discountRate = .5;
    
    @Override
    public double getDiscount(double prodPrice, int prodQty) {
        return (prodPrice * prodQty) * discountRate;
    }    
}
