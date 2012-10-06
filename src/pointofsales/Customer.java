/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsales;

/**
 *
 * @author mashit
 */
public class Customer {
    private String name, custID;
    
    public Customer(String name, String custId){
        this.name = name;
        this.custID = custId;
    }

    public String getName() {
        return name;
    }

    public String getCustID() {
        return custID;
    }    
}
