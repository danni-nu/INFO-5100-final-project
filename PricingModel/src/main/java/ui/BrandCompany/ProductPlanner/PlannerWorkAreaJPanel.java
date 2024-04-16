/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.BrandCompany.ProductPlanner;

import java.awt.CardLayout;
import javax.swing.JPanel;
import model.BrandCompany.PlannerProfile;
import model.Business.Business;

/**
 *
 * @author qiaohui
 */
public class PlannerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form delivererWorkAreaJPanel
     */
    JPanel WorkArea;
    Business business;
    PlannerProfile requirementPlanner;
    public PlannerWorkAreaJPanel(Business business,PlannerProfile requirementPlanner, JPanel PlannerWorkArea) {
        this.PlannerWorkArea=PlannerWorkArea;
        this.requirementPlanner=requirementPlanner;
        this.business=business;
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
        jPanel1 = new javax.swing.JPanel();
        RequirementManage = new javax.swing.JButton();
        NewRequirement = new javax.swing.JButton();
        PlannerWorkArea = new javax.swing.JPanel();

        RequirementManage.setText("Requirement Manage");
        RequirementManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequirementManageActionPerformed(evt);
            }
        });

        NewRequirement.setText("New Requirement ");
        NewRequirement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewRequirementActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(NewRequirement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RequirementManage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(RequirementManage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NewRequirement)
                .addContainerGap(400, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        PlannerWorkArea.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(PlannerWorkArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RequirementManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequirementManageActionPerformed
        // TODO add your handling code here:
        RequirementManagementJPanel aos = new RequirementManagementJPanel(business,requirementPlanner, PlannerWorkArea);
        PlannerWorkArea.add("Requirement Management", aos);
        CardLayout layout =(CardLayout)PlannerWorkArea.getLayout();
        layout.next(PlannerWorkArea); 
    }//GEN-LAST:event_RequirementManageActionPerformed

    private void NewRequirementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewRequirementActionPerformed
        // TODO add your handling code here:
        NewRequirementJPanel aos = new NewRequirementJPanel(business,requirementPlanner, PlannerWorkArea);
        PlannerWorkArea.add("Requirement Management", aos);
        CardLayout layout =(CardLayout)PlannerWorkArea.getLayout();
        layout.next(PlannerWorkArea);
    }//GEN-LAST:event_NewRequirementActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NewRequirement;
    private javax.swing.JPanel PlannerWorkArea;
    private javax.swing.JButton RequirementManage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
