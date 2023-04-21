/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WorkRequest;

import Business.Customer.Customer;
import Business.Organization.Organization;
import Business.Platform;
import Order.Order;
import UserAccount.UserAccount;

/**
 *
 * @author emi
 */
public class AirTicketWorkRequest extends WorkRequest{
    Boolean needFood = false;
    
    public AirTicketWorkRequest(Order o, Customer c, UserAccount sender,Platform platform) {
        super(o, c, sender,platform);
        this.receiverOrg = platform.getAirlineOrg();
        this.receiverOrg.getWorkQueue().addWorkRequest(this);
    }

    public Boolean getNeedFood() {
        return needFood;
    }

    public void setNeedFood(Boolean needFood) {
        this.needFood = needFood;
    }
    
    
    
}
