/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.DesignerRole;

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import model.Business.BrandEnterprise;
import model.Business.Business;
import model.Business.DesignEnterprise;
import model.DesignEnterprise.DesignerProfile;
import ui.LoginJPanel;

/**
 *
 * @author tianlyu
 */
public class DesignerWorkAreaJPanel extends javax.swing.JPanel {
    
    javax.swing.JPanel CardSequencePanel;
    Business business;
    DesignerProfile designer;
    DesignEnterprise designEnterprise;
    BrandEnterprise brandCompany;

    /**
     * Creates new form ManageRequirementsTask1JPanel
     */
    public DesignerWorkAreaJPanel(Business b, JPanel clp,DesignerProfile designerProfile,DesignEnterprise designEnterprise,BrandEnterprise brandCompany) {
        business = b;
        this.brandCompany=brandCompany;
        this.CardSequencePanel = clp;
        designer = designerProfile;
        this.designEnterprise = designEnterprise;
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

        Back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ManageRequirementsTaskButton = new javax.swing.JButton();
        CheckPerformanceButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(236, 244, 251));

        Back.setText("<< Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Designer Work Area");

        ManageRequirementsTaskButton.setBackground(new java.awt.Color(102, 153, 255));
        ManageRequirementsTaskButton.setForeground(new java.awt.Color(255, 255, 255));
        ManageRequirementsTaskButton.setText("Manage Requirements Task");
        ManageRequirementsTaskButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ManageRequirementsTaskButton.setMaximumSize(new java.awt.Dimension(200, 40));
        ManageRequirementsTaskButton.setMinimumSize(new java.awt.Dimension(20, 20));
        ManageRequirementsTaskButton.setPreferredSize(new java.awt.Dimension(240, 25));
        ManageRequirementsTaskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageRequirementsTaskButtonActionPerformed(evt);
            }
        });

        CheckPerformanceButton.setBackground(new java.awt.Color(102, 153, 255));
        CheckPerformanceButton.setForeground(new java.awt.Color(255, 255, 255));
        CheckPerformanceButton.setText("Check Performance");
        CheckPerformanceButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CheckPerformanceButton.setMaximumSize(new java.awt.Dimension(200, 40));
        CheckPerformanceButton.setMinimumSize(new java.awt.Dimension(20, 20));
        CheckPerformanceButton.setPreferredSize(new java.awt.Dimension(240, 25));
        CheckPerformanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckPerformanceButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ManageRequirementsTaskButton, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CheckPerformanceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(268, 268, 268))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Back)
                .addGap(51, 51, 51)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(ManageRequirementsTaskButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(CheckPerformanceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(322, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        CardSequencePanel.remove(this);
        Component[] componentArray = CardSequencePanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        LoginJPanel loginPanel = (LoginJPanel) component;
        loginPanel.populateEnterpriseTypeCombo();
        loginPanel.populateCompanyNameCombo();
        CardLayout layout = (CardLayout) CardSequencePanel.getLayout();
        layout.previous(CardSequencePanel);
                
//                CardSequencePanel.remove(this);
//                ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

    }//GEN-LAST:event_BackActionPerformed

    private void ManageRequirementsTaskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageRequirementsTaskButtonActionPerformed
//         TODO add your handling code here:
        ManageRequirementsTaskJPanel aos = new ManageRequirementsTaskJPanel(business, CardSequencePanel,  designer,  designEnterprise,brandCompany);
        CardSequencePanel.add("Manage Requirements Task", aos);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_ManageRequirementsTaskButtonActionPerformed

    private void CheckPerformanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckPerformanceButtonActionPerformed
        // TODO add your handling code here:
        CheckPerformanceJPanel aos = new CheckPerformanceJPanel(business, CardSequencePanel,designer,designEnterprise);
        CardSequencePanel.add("Check Performance", aos);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_CheckPerformanceButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton CheckPerformanceButton;
    private javax.swing.JButton ManageRequirementsTaskButton;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
