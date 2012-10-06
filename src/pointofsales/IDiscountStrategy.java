
package pointofsales;

public interface IDiscountStrategy {
    public double getDiscount(double prodPrice, int prodQty);
}
