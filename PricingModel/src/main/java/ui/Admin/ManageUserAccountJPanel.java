/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Admin;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.BrandCompany.Requirement;
import model.Business.Business;
import model.Personnel.AdminProfile;
import model.UserAccountManagement.UserAccount;

/**
 *
 * @author qiaohui
 */
public class ManageUserAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserAccountJPanel
     */
    JPanel mainWorkArea;
    Business business;
    AdminProfile adminProfile;
    
    
    
    public ManageUserAccountJPanel(Business business, JPanel mainWorkArea, AdminProfile adminProfile) {
        this.mainWorkArea = mainWorkArea;
        this.business = business;
        this.adminProfile = adminProfile;
        initComponents();
        populatePersonDirectoryTable();
        //populateAccountDirectoryTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAccountTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        AddButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        tblAccountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Account", "Role", "PersonName", "Company"
            }
        ));
        jScrollPane1.setViewportView(tblAccountTable);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setText("Manage Account");

        AddButton.setText("Add Account");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        DeleteButton.setText("Delete Account");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        btnBack.setText(">>Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(DeleteButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 944, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(421, 421, 421)
                        .addComponent(jLabel1)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnBack)
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddButton)
                    .addComponent(DeleteButton))
                .addContainerGap(234, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        mainWorkArea.remove(this);
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.previous(mainWorkArea);
    }//GEN-LAST:event_btnBackActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
        int row = tblAccountTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        //chose the specific UserAccount
        UserAccount ua =  (UserAccount)tblAccountTable.getValueAt(row, 0);
        business.getUserAccountDirectory().getUseraccountlist().remove(ua);

        JOptionPane.showMessageDialog(null, "Remove UserAccount Successfully!!", "Info", JOptionPane.INFORMATION_MESSAGE);                    
        populatePersonDirectoryTable();
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:
        AddAccountJPanel aos = new AddAccountJPanel(business, mainWorkArea,adminProfile);
        mainWorkArea.add("Add Users", aos);
        ((java.awt.CardLayout) mainWorkArea.getLayout()).next(mainWorkArea);
        
        
    }//GEN-LAST:event_AddButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblAccountTable;
    // End of variables declaration//GEN-END:variables

    public void populatePersonDirectoryTable() {
        DefaultTableModel model=(DefaultTableModel)tblAccountTable.getModel();
        model.setRowCount(0);
        for(UserAccount account:business.getUserAccountDirectory().getUseraccountlist()){
            Object row[] = new Object[4];
            row[0] = account;
            row[1] = account.getRole();
            row[2] = account.getPersonName();
            row[3] = account.getCompanyName();
            model.addRow(row);

            }
    }
    
}
