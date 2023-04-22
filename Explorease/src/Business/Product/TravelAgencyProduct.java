/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Product;

import java.util.ArrayList;

/**
 *
 * @author forumkaria
 */
public
        class TravelAgencyProduct extends Product {
    
    String service;
    static int ctr =1;
    int tripBudget;
    // Constructor
    public TravelAgencyProduct(String service, int price) {
        
        super("TRAVEL_AGENCY_SERVICE_"+String.valueOf(ctr),price);
        ctr+=1;
        this.service= service;
    }
    
    // Override abstract method to get product details
    @Override
    public TravelAgencyProduct getProductDetails() {
        return this;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

//    public ArrayList<Product> getTripDetails() {
//        return tripDetails;
//    }
//
//    public void addToTripDetails(Product p) {
//        this.tripDetails.add(p);
//    }

    public int getTripBudget() {
        return tripBudget;
//edit calculate total trip budget
    }

    public void setTripBudget(int tripBudget) {
        this.tripBudget = tripBudget;
    }
    
    
    
    
    
   
}
