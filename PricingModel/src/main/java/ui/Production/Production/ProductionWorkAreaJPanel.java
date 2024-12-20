/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Production.Production;

import ui.Production.Inventory.*;
import ui.BrandCompany.Procurer.*;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import model.BrandCompany.ProcurerProfile;
import model.Business.BrandEnterprise;
import model.Business.Business;
import model.Production.InventoryManagerProfile;
import model.Production.ProductionManagerProfile;
import ui.LoginJPanel;

/**
 *
 * @author administorzi
 */
public class ProductionWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    javax.swing.JPanel mainWorkArea;
    Business business;
    ProductionManagerProfile productionManagerProfile;
    BrandEnterprise brandEnterprise;
    
   public ProductionWorkAreaJPanel(Business b, JPanel mainWorkArea,ProductionManagerProfile imp,BrandEnterprise brandEnterprise) {
        business = b;
        this.mainWorkArea = mainWorkArea;
        this.productionManagerProfile = imp;
        this.brandEnterprise=brandEnterprise;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        Memu = new javax.swing.JPanel();
        btnManageProductionLine = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        btnManageProductionMode = new javax.swing.JButton();
        WorkArea = new javax.swing.JPanel();

        btnManageProductionLine.setText("Manage Production");
        btnManageProductionLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageProductionLineActionPerformed(evt);
            }
        });

        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        btnManageProductionMode.setText("Manage Mode");
        btnManageProductionMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageProductionModeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MemuLayout = new javax.swing.GroupLayout(Memu);
        Memu.setLayout(MemuLayout);
        MemuLayout.setHorizontalGroup(
            MemuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MemuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MemuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MemuLayout.createSequentialGroup()
                        .addGroup(MemuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnManageProductionLine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnManageProductionMode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        MemuLayout.setVerticalGroup(
            MemuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MemuLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(btnManageProductionLine, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnManageProductionMode, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 251, Short.MAX_VALUE)
                .addComponent(btnLogOut)
                .addGap(226, 226, 226))
        );

        jSplitPane1.setLeftComponent(Memu);

        WorkArea.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(WorkArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageProductionLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageProductionLineActionPerformed
        // TODO add your handling code here:
       ManageProductionLineJPanel mmpojp = new ManageProductionLineJPanel(WorkArea, business, productionManagerProfile);
        WorkArea.add("ManageProductionLineJPanel", mmpojp);
        CardLayout layout = (CardLayout) WorkArea.getLayout();
        layout.next(WorkArea);
    }//GEN-LAST:event_btnManageProductionLineActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        mainWorkArea.remove(this);
        Component[] componentArray = mainWorkArea.getComponents();
        Component component = componentArray[componentArray.length - 1];
        LoginJPanel loginPanel = (LoginJPanel) component;
        loginPanel.populateEnterpriseTypeCombo();
        loginPanel.populateCompanyNameCombo();
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.previous(mainWorkArea);
        
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnManageProductionModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageProductionModeActionPerformed
        // TODO add your handling code here:
        ManageProductionModeJPanel mpojp = new ManageProductionModeJPanel(WorkArea, business, productionManagerProfile);
        WorkArea.add("ManageProductionModeJPanel", mpojp);
        CardLayout layout = (CardLayout) WorkArea.getLayout();
        layout.next(WorkArea);
    }//GEN-LAST:event_btnManageProductionModeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Memu;
    private javax.swing.JPanel WorkArea;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnManageProductionLine;
    private javax.swing.JButton btnManageProductionMode;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
