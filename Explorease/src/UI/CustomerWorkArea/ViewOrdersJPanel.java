/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.CustomerWorkArea;

import Business.Customer.Customer;
import Business.Organization.Organization;
import Business.Platform;
import Business.Product.FlightTicketProduct;
import Order.Order;
import Order.OrderItem;
import UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emi
 */
public class ViewOrdersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewOrdersJPanel
     */
    
    Platform platform;
    UserAccount ua;
    JPanel container;
    DefaultTableModel ordersTable;
    Organization org;
    Customer cus;
    public ViewOrdersJPanel(JPanel container, Platform platform, UserAccount ua) {
        initComponents();
        this.platform = platform; 
        this.container = container;
        this.ua = ua;
        this.org = this.platform.getAirlineOrg();
        this.ordersTable = (DefaultTableModel) orders.getModel();
        this.cus = this.platform.getCustomerDirectory().findCustomerById(ua.getAccountId());
        
        populateOrders();
    }
    
    public void populateOrders(){
        ordersTable.setRowCount(0);
        ArrayList<Order> allOrders = this.cus.getCustomerOrderCatalog().getOrders();
        if(allOrders.size()>0){
            for (Order o: allOrders){
                Object[] row = new Object[5];
                row[0] = o.getOrderId();
                row[1] = o.getOrderitems().get(0).getSelectedproduct(); //same product to different order items inside one order
                row[2] = (o.getOrderWorkQueue().getWorkQueue().get(0).getReceiverOrg() == this.platform.getAirlineOrg())? o.getFlightOrderPriceWithFood():o.getOrderTotal();
                row[3] = o.getOrderWorkQueue().getWorkQueue().get(0).getStatus(); //main work request's processing status
                row[4] = o.getOrderApproved()?"Booked":"Not Booked"; //final order status
                ordersTable.addRow(row);
                
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        orders = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1100, 800));

        orders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Product ID", "Total Price", "Processing Status", "Order Status"
            }
        ));
        jScrollPane1.setViewportView(orders);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/order_128px.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable orders;
    // End of variables declaration//GEN-END:variables
}
