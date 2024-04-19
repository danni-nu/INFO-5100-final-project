/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.DesignerRole;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel; 
import javax.swing.table.DefaultTableModel;
import model.BrandCompany.Order;
import model.BrandCompany.Requirement;
import model.BrandCompany.RequirementsDirectory;
import model.Business.BrandEnterprise;
import model.Business.Business;
import model.Business.DesignEnterprise;
import model.DesignEnterprise.DesignerProfile;
import model.DesignEnterprise.RequirementAssignment;
import model.DesignEnterprise.RequirementAssignmentDirectory;

/**
 *
 * @author tianlyu
 */
public class ManageRequirementsTaskJPanel extends javax.swing.JPanel {
    
    javax.swing.JPanel CardSequencePanel;
    Business business;
    DesignerProfile designerProfile;
    DesignEnterprise designEnterprise;
    BrandEnterprise brandCompany;
    /**
     * Creates new form DesignerWorkAreaJPanel
     */
    public ManageRequirementsTaskJPanel(Business b, JPanel clp,DesignerProfile designer,DesignEnterprise designEnterprise,BrandEnterprise e) {
        business = b;
        this.brandCompany= e;
        this.designerProfile = designer;
        this.designEnterprise = designEnterprise;
        this.CardSequencePanel = clp;
        initComponents();
        
        populateCartTable();
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbltask = new javax.swing.JTable();
        Back = new javax.swing.JButton();
        AddjButton = new javax.swing.JButton();
        removejButton = new javax.swing.JButton();
        viewjButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSchedule = new javax.swing.JTable();
        AddSolutionjButton = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(236, 244, 251));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Manage Requirements Task");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Task ScheduleList");

        tbltask.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        tbltask.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Requirement ID", "Raw Material", "Production Mode", "Color", "Style", "Deadline", "Evaluation"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbltask);

        Back.setText("<< Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        AddjButton.setText("Add Requirement");
        AddjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddjButtonActionPerformed(evt);
            }
        });

        removejButton.setText("Remove");
        removejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removejButtonActionPerformed(evt);
            }
        });

        viewjButton.setText("View Details");
        viewjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewjButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("My New Requirements To Schedule");

        tblSchedule.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        tblSchedule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Requirement ID", "Raw Material", "Production Mode", "Color", "Style", "Deadline", "Evaluation"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblSchedule);

        AddSolutionjButton.setText("Add solution");
        AddSolutionjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSolutionjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(removejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddSolutionjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(viewjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 115, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Back)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewjButton)
                    .addComponent(AddjButton))
                .addGap(47, 47, 47)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddSolutionjButton)
                    .addComponent(removejButton))
                .addContainerGap(127, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void removejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removejButtonActionPerformed
        // TODO add your handling code here:

        int row = tbltask.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        //chose the specific Requirement
        Requirement re =  (Requirement)tbltask.getValueAt(row, 0);

        //get the RequirementAssignmentDirectoty
        RequirementAssignmentDirectory requirementAssignmentDirectory = designEnterprise.getDesignOrganization().getRequirementAssignmentDirectory();
        
        //remove Requirement from Desginer
        requirementAssignmentDirectory.removeRequirementFromDesigner(designerProfile, re);


        populateRequirmentTable();
    }//GEN-LAST:event_removejButtonActionPerformed

    private void AddjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddjButtonActionPerformed
        // TODO add your handling code here:
        int row = tbltask.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        //chose the specific Requirement
        String requirementID =  (String)tbltask.getValueAt(row, 0);
        ArrayList<Requirement> requirements= brandCompany.getProductPlanningOrganization().getRequirementDirectory().getRequirementsDirectory();
        
        for(Requirement r: requirements){
            if(r.getRequirementID() == requirementID){
                //get the RequirementAssignmentDirectoty
                RequirementAssignmentDirectory requirementAssignmentDirectory = designEnterprise.getDesignOrganization().getRequirementAssignmentDirectory();
                //assignRequirement To Desginer
                requirementAssignmentDirectory.assignRequirementToDesginer(designerProfile, r);
                JOptionPane.showMessageDialog(null, "Requirement Added to Schedule Successfully!!", "Info", JOptionPane.INFORMATION_MESSAGE);
                populateRequirmentTable();
            }
        }
     
    }//GEN-LAST:event_AddjButtonActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        CardSequencePanel.remove(this);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_BackActionPerformed

    private void viewjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewjButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewjButtonActionPerformed

    private void AddSolutionjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSolutionjButtonActionPerformed
        // TODO add your handling code here:
        int row = tblSchedule.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        tblSchedule.getValueAt(row, 0);
        
    }//GEN-LAST:event_AddSolutionjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddSolutionjButton;
    private javax.swing.JButton AddjButton;
    private javax.swing.JButton Back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton removejButton;
    private javax.swing.JTable tblSchedule;
    private javax.swing.JTable tbltask;
    private javax.swing.JButton viewjButton;
    // End of variables declaration//GEN-END:variables

    private void populateCartTable() {
        DefaultTableModel model = (DefaultTableModel) tbltask.getModel();
        model.setRowCount(0);
        for (Requirement r : brandCompany.getProductPlanningOrganization().getRequirementDirectory().getRequirementsDirectory()) {
            Object row[] = new Object[7];
            row[0] = r.getRequirementID();
            row[1] = r.getRowMaterial();
            row[2] = r.getProductionMode();
            row[3] = r.getColor();
            row[4] = r.getStyle();
            row[5] = r.getDeadline();
            row[6] = r.getEvaluation();
            model.addRow(row);
        }
    }
    
    //designer own 
    private void populateRequirmentTable() {
        DefaultTableModel model = (DefaultTableModel) tblSchedule.getModel();
        model.setRowCount(0);    
        //get the designerToRequirement HashMap
        HashMap<DesignerProfile, List<Requirement>> designerToRequirement = designEnterprise.getDesignOrganization().getRequirementAssignmentDirectory().getDesignerToRequirement();
        List<Requirement> requirementOfDesigner = designerToRequirement.get(designerProfile);
        
        for (Requirement r : requirementOfDesigner) {
       
            Object row[] = new Object[7];
            row[0] = r.getRequirementID();
            row[1] = r.getRowMaterial();
            row[2] = r.getProductionMode();
            row[3] = r.getColor();
            row[4] = r.getStyle();
            row[5] = r.getDeadline();
            row[6] = r.getEvaluation();
        }
        
    }
}
