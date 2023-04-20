/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.CustomerWorkArea;

import Business.Customer.Customer;
import Business.Organization.Organization;
import Business.Platform;
import Business.Product.FlightTicketProduct;
import Business.Product.Product;
import Order.Order;
import UserAccount.UserAccount;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emi
 */
public class PlanATripJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BookFlightJPanel
     */
    Platform platform;
    UserAccount ua;
    JPanel container;
    DefaultTableModel resultTable;
    Organization org;
    Customer cus;
    FlightTicketProduct flightSelected;
    public PlanATripJPanel(JPanel container, Platform platform, UserAccount ua) {
        initComponents();
        this.platform = platform; 
        this.container = container;
        this.ua = ua;
        this.org = this.platform.getAirlineOrg();
        this.resultTable = (DefaultTableModel) flights.getModel();
        this.cus = this.platform.getCustomerDirectory().findCustomerById(ua.getAccountId());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        desCity = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        flights = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        bookBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        desCity1 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1100, 800));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Time to leave?");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));
        add(desCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 140, -1));

        jLabel3.setText("Trip Details");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        searchBtn.setText("Plan My Trip");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 110, -1));

        flights.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Destination", "Departure Date", "Flight ID", "Flight Price", "Hotel ID", "Hotel Price", "Attraction Ticket", "Attraction Price", "Indurance Price"
            }
        ));
        jScrollPane2.setViewportView(flights);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 940, 100));

        jLabel6.setText("Total Budget");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, 20));

        jTextField4.setEditable(false);
        add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 105, -1));

        bookBtn.setText("Book My Trip");
        bookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookBtnActionPerformed(evt);
            }
        });
        add(bookBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/planATrip_128px.png"))); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 30, 138, 136));

        jCheckBox1.setText("   Get partial insurance coverage for my trip");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        jCheckBox2.setText("   Get tourist attraction ticket for my trip");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        jCheckBox3.setText("   Get full insurance coverage for my trip");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        jButton1.setText("Confirm Budget");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, -1, -1));

        jLabel4.setText("Where will you departure from?");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));
        add(desCity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 140, -1));
        add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 140, -1));

        jLabel10.setText("Destination in mind?");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        resultTable.setRowCount(0);
        
        ArrayList<Product> searchResult = new ArrayList<Product>();
        
        String dep = depCity.getText();
        String des = desCity.getText();
        Date date = depDate.getDate();
        
        for (Product flight: this.org.getProductCatalog().getProducts()){
            FlightTicketProduct f = (FlightTicketProduct) flight.getProductDetails();
            if (f.getDepartureCity().equalsIgnoreCase(dep) && f.getDestinationCity().equalsIgnoreCase(des) 
                    && f.getDepartureDate().toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate().
                            equals(date.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate())
                    ){
                searchResult.add(flight);
            }
        }
        
        if(searchResult.size()>0){
            for (Product flightFound: searchResult){
                FlightTicketProduct f = (FlightTicketProduct) flightFound.getProductDetails();
                Object[] row = new Object[9];
                row[0] = f;
                row[1] = f.getAirline();
                row[2] = f.getDepartureCity();
                row[3] = f.getDestinationCity();
                row[4] = new SimpleDateFormat("yyyy-MM-dd").format(f.getDepartureDate());
                row[5] = f.getDepartureTime();
                row[6] = f.getFlightDuration();
                row[7] = (f.getNonStop())? "Yes": "No";
                row[8] = f.getPrice();
                resultTable.addRow(row);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Oops...no flight found");
        }    

    }//GEN-LAST:event_searchBtnActionPerformed

    private void bookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookBtnActionPerformed
        // TODO add your handling code here:
        //create order for customer and add to customer's order list
        Order o = this.cus.getCustomerOrderCatalog().createOrder(cus);
        //link product with the order
        o.newOrderItem(this.flightSelected);
        //add the order to org's order list
        this.org.getOrderCatalog().getOrders().add(o);
        JOptionPane.showMessageDialog(null, "Successfully booked");
    }//GEN-LAST:event_bookBtnActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookBtn;
    private javax.swing.JTextField desCity;
    private javax.swing.JTextField desCity1;
    private javax.swing.JTable flights;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton searchBtn;
    // End of variables declaration//GEN-END:variables
}
