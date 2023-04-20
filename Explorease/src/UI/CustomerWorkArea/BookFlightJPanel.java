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
import WorkRequest.WorkRequest;
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
public class BookFlightJPanel extends javax.swing.JPanel {

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
    public BookFlightJPanel(JPanel container, Platform platform, UserAccount ua) {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        desCity = new javax.swing.JTextField();
        depCity = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        flights = new javax.swing.JTable();
        selectBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        bookBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        nonStop = new javax.swing.JCheckBox();
        tripTypeCombo = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        depDate = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1100, 800));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Departure City");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jLabel2.setText("Destination City");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));
        add(desCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 113, -1));
        add(depCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 113, -1));

        jLabel3.setText("Date");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, -1, -1));

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 140, -1, -1));

        flights.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Flight ID", "Airline", "Departure City", "Destination City", "Departure Date", "Departure TIme", "Flight Duration", "Non Stop", "Price"
            }
        ));
        jScrollPane2.setViewportView(flights);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 880, 420));

        selectBtn.setText("Select");
        selectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBtnActionPerformed(evt);
            }
        });
        add(selectBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 230, -1, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/aircraft_16px.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 36, 23));

        jLabel5.setText("Flight Selected");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 690, -1, 20));

        jTextField3.setEditable(false);
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 690, 105, -1));

        jLabel6.setText("Total Price");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 690, 70, 20));

        jTextField4.setEditable(false);
        add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 690, 80, -1));

        bookBtn.setText("Book");
        bookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookBtnActionPerformed(evt);
            }
        });
        add(bookBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 690, -1, -1));

        jLabel7.setText("From");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 690, 35, 20));

        jTextField5.setEditable(false);
        add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 690, 105, -1));

        jLabel8.setText("To");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 690, 20, 20));

        jTextField6.setEditable(false);
        add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 690, 105, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/airplane_128px.png"))); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 30, 138, 136));

        nonStop.setText("Non-stop");
        add(nonStop, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, 90, -1));

        tripTypeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "One-way", "Round-trip" }));
        add(tripTypeCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 130, -1));

        jCheckBox1.setText("Order in-flight meal");
        add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 690, -1, -1));
        add(depDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, -1, -1));
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
            if(!nonStop.isSelected()){
                if (f.getDepartureCity().equalsIgnoreCase(dep) && f.getDestinationCity().equalsIgnoreCase(des) && f.getDepartureDate().toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate().equals(date.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate())){
                    searchResult.add(flight);
                }
            }else{
                if (f.getDepartureCity().equalsIgnoreCase(dep) && f.getDestinationCity().equalsIgnoreCase(des) && f.getDepartureDate().toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate().equals(date.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate())
                        && f.getNonStop()){
                    searchResult.add(flight);
                }
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

    private void selectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = flights.getSelectedRow();
        this.flightSelected = (FlightTicketProduct) resultTable.getValueAt(selectedRow, 0);
        jTextField3.setText(flightSelected.getProductId());
        jTextField5.setText(flightSelected.getDepartureCity());
        jTextField6.setText(flightSelected.getDestinationCity());
        jTextField4.setText(String.valueOf((tripTypeCombo.getSelectedItem().equals("One-way"))? flightSelected.getPrice():flightSelected.getPrice()*2));
    }//GEN-LAST:event_selectBtnActionPerformed

    private void bookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookBtnActionPerformed
        // TODO add your handling code here:
        //create order for customer and add to customer's order list
        Order o = this.cus.getCustomerOrderCatalog().createOrder(cus);
        //link product with the order
        if (tripTypeCombo.getSelectedItem().equals("One-way")){
            o.newOrderItem(this.flightSelected);
        }else {
            //just to get the total price right for the order
            o.newOrderItem(this.flightSelected);
            o.newOrderItem(this.flightSelected);
        }
        WorkRequest workReq = new WorkRequest(o,this.cus, this.cus.getUserAccount(), this.org);
        this.org.getWorkQueue().addWorkRequest(workReq);
      
        //add the order to org's order list
        this.org.getOrderCatalog().getOrders().add(o);
        JOptionPane.showMessageDialog(null, "Booking request sent");
    }//GEN-LAST:event_bookBtnActionPerformed
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookBtn;
    private javax.swing.JTextField depCity;
    private com.toedter.calendar.JDateChooser depDate;
    private javax.swing.JTextField desCity;
    private javax.swing.JTable flights;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JCheckBox nonStop;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton selectBtn;
    private javax.swing.JComboBox<String> tripTypeCombo;
    // End of variables declaration//GEN-END:variables
}
