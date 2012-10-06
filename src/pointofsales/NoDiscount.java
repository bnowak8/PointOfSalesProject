
package pointofsales;


public class NoDiscount implements IDiscountStrategy{
    private double discountRate = .00;
    @Override
    public double getDiscount(double prodPrice, int prodQty) {
        return (prodPrice * prodQty) * discountRate;
    }
}
