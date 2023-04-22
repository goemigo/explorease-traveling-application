/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.EnterpriseAdminWorkArea;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import UI.SystemAdminWorkArea.*;
import Business.Platform;
import Person.Person;
import Roles.AirlineAgentRole;
import Roles.AttractionOfficerRole;
import Roles.FoodServiceSupplierRole;
import Roles.HotelManagerRole;
import Roles.InsuranceAdvisorRole;
import Roles.TravelAgentRole;
import UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emi
 */
public class ManageOrganizationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrganizationJPanel
     */
    Platform platform;
    UserAccount ua;
    JPanel container;
    Enterprise en;
    DefaultTableModel tableModel;

    
    public ManageOrganizationJPanel(JPanel container, Platform platform, UserAccount ua) {
        initComponents();
        this.setVisible(true);
        
        this.platform = platform; 
        this.container = container;
        this.ua = ua;
        this.en= this.platform.findEnterpriseByUseraccount(this.ua.getUsername(), this.ua.getPassword());
        this.tableModel = (DefaultTableModel) jTable.getModel();
        populateDropdown();
        populateTable();
    }
    
    public void populateDropdown(){
       
        if(this.en!=null){
            for(Organization o : en.getOrganizationDirectory().getOrganizationList()){
                jComboBox1.addItem(o.getClass().getSimpleName());
            }
        }
    }
    
    public void populateTable(){
        tableModel.setRowCount(0);
      
        for(Organization o: this.en.getOrganizationDirectory().getOrganizationList()){
            if(o.getUserAccountDirectory().getUseraccountList().size()>0){
                for(UserAccount orgUA: o.getUserAccountDirectory().getUseraccountList()){
                
                    Object[] row = new Object[4];
                    row[0] = this.en.getClass().getSimpleName();
                    row[1] = o.getClass().getSimpleName();
                    row[2] = orgUA.getUsername();
                    row[3] = orgUA.getPassword();
    
                    tableModel.addRow(row);
            }
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        deleteOrgnBtn = new javax.swing.JButton();
        username = new javax.swing.JTextField();
        updatePass = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        managerName = new javax.swing.JTextField();
        addOrgnManagerBtn = new javax.swing.JButton();
        password = new javax.swing.JTextField();
        updateOrgnManagerBtn = new javax.swing.JButton();
        deleteOrgManager = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Organization Name:");

        jLabel2.setText("Name:");

        jLabel3.setText("Username:");

        jLabel4.setText("Password:");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Ent Name", "Org Name", "Username", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable);

        deleteOrgnBtn.setText("DELETE ORGANIZATION");
        deleteOrgnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteOrgnBtnActionPerformed(evt);
            }
        });

        jLabel6.setText("Update Password:");

        addOrgnManagerBtn.setText("ADD EMPLOYEE");
        addOrgnManagerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrgnManagerBtnActionPerformed(evt);
            }
        });

        updateOrgnManagerBtn.setText("UPDATE PASSWORD");
        updateOrgnManagerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateOrgnManagerBtnActionPerformed(evt);
            }
        });

        deleteOrgManager.setText("DELETE EMPLOYEE");
        deleteOrgManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteOrgManagerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addOrgnManagerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updatePass, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(managerName, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(updateOrgnManagerBtn)
                                .addGap(173, 173, 173))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(deleteOrgManager, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteOrgnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(85, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(managerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(updatePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(updateOrgnManagerBtn)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(addOrgnManagerBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteOrgManager)
                        .addGap(72, 72, 72)
                        .addComponent(deleteOrgnBtn)
                        .addGap(104, 104, 104)))
                .addGap(115, 115, 115))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deleteOrgnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteOrgnBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable.getSelectedRow();
        String orgName = (String) jTable.getValueAt(selectedRow, 1);
        Organization o = this.en.getOrganizationDirectory().findOrganizationByType(orgName);
        this.en.getOrganizationDirectory().getOrganizationList().remove(o);
        
        populateTable();
        
    }//GEN-LAST:event_deleteOrgnBtnActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void addOrgnManagerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrgnManagerBtnActionPerformed
        // TODO add your handling code here:
        Organization orgSelected  = this.en.getOrganizationDirectory().findOrganizationByType((String) jComboBox1.getSelectedItem());
        String user = username.getText();
        String pass = password.getText();
        UserAccount userCreated;
        if(orgSelected == this.platform.getAirlineOrg()){
            userCreated = this.platform.getAirlineOrg().getUserAccountDirectory().createUserAccount(user, pass, new AirlineAgentRole());
        }else if(orgSelected == this.platform.getHotelOrg()){
            userCreated = this.platform.getHotelOrg().getUserAccountDirectory().createUserAccount(user, pass, new HotelManagerRole());
        }else if(orgSelected == this.platform.getFoodServiceOrg()){
            userCreated = this.platform.getFoodServiceOrg().getUserAccountDirectory().createUserAccount(user, pass, new FoodServiceSupplierRole());
        }else if(orgSelected == this.platform.getInsuranceOrg()){
            userCreated = this.platform.getInsuranceOrg().getUserAccountDirectory().createUserAccount(user, pass, new InsuranceAdvisorRole());
        }else if(orgSelected == this.platform.getTravelAgencyOrg()){
            userCreated = this.platform.getTravelAgencyOrg().getUserAccountDirectory().createUserAccount(user, pass, new TravelAgentRole());
        }else {
            userCreated = this.platform.getAttractionOrg().getUserAccountDirectory().createUserAccount(user, pass, new AttractionOfficerRole());
        }
        
        Person orgManagerPerson = this.platform.getPersonDirectory().createPerson(userCreated.getAccountId(), managerName.getText());
        
        populateTable();
        
        
    }//GEN-LAST:event_addOrgnManagerBtnActionPerformed

    private void updateOrgnManagerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateOrgnManagerBtnActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = jTable.getSelectedRow();
        
        String orgName = (String) jTable.getValueAt(selectedRow, 1);
        String username = (String) jTable.getValueAt(selectedRow, 2);
        
        Organization o = this.en.getOrganizationDirectory().findOrganizationByType(orgName);
        UserAccount uaSelected = o.getUserAccountDirectory().findByUserName(username);
        uaSelected.setPassword(updatePass.getText());
        
        populateTable();
        
        
    }//GEN-LAST:event_updateOrgnManagerBtnActionPerformed

    private void deleteOrgManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteOrgManagerActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = jTable.getSelectedRow();
        
        String orgName = (String) jTable.getValueAt(selectedRow, 1);
        String username = (String) jTable.getValueAt(selectedRow, 2);
        
        Organization o = this.en.getOrganizationDirectory().findOrganizationByType(orgName);
        UserAccount uaSelected = o.getUserAccountDirectory().findByUserName(username);
        o.getUserAccountDirectory().getUseraccountList().remove(uaSelected);
        
        populateTable();
        
    }//GEN-LAST:event_deleteOrgManagerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addOrgnManagerBtn;
    private javax.swing.JButton deleteOrgManager;
    private javax.swing.JButton deleteOrgnBtn;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField managerName;
    private javax.swing.JTextField password;
    private javax.swing.JButton updateOrgnManagerBtn;
    private javax.swing.JTextField updatePass;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
