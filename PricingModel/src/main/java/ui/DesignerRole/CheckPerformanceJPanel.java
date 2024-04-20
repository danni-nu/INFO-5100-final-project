/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.DesignerRole;

import java.util.HashMap;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.BrandCompany.Requirement;
import model.Business.Business;
import model.Business.DesignEnterprise;
import model.DesignEnterprise.DesignerProfile;
import model.DesignEnterprise.RequirementAssignmentDirectory;

/**
 *
 * @author tianlyu
 */
public class CheckPerformanceJPanel extends javax.swing.JPanel {
    
    javax.swing.JPanel CardSequencePanel;
    Business business;
    DesignerProfile designerProfile;
    DesignEnterprise designEnterprise;

    /**
     * Creates new form UploadDesignSolutionJPanel
     */
    

    public CheckPerformanceJPanel(Business b, JPanel clp,DesignerProfile designerProfile,DesignEnterprise designEnterprise) {
        business = b;
        this.CardSequencePanel = clp;
        this.designerProfile = designerProfile;
        this.designEnterprise = designEnterprise;
        initComponents();
        populateFeedbackTable();
        
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
        Back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPerformance = new javax.swing.JTable();

        setBackground(new java.awt.Color(236, 244, 251));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Check Performance");

        Back.setText("<< Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("My Requirements Task Performance");

        tblPerformance.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        tblPerformance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Requirement ID", "Raw Material", "Production Mode", "Color", "Style", "Deadline", "Evaluation", "Feedback"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblPerformance);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 936, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(316, 316, 316))
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 851, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Back)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        CardSequencePanel.remove(this);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_BackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblPerformance;
    // End of variables declaration//GEN-END:variables

    private void populateFeedbackTable() {
        DefaultTableModel model = (DefaultTableModel) tblPerformance.getModel();
        model.setRowCount(0); 
        HashMap<DesignerProfile, List<Requirement>> designerToRequirement = RequirementAssignmentDirectory.getDesignerToRequirement();
        List<Requirement> requirementsOfDesigner = designerToRequirement.get(designerProfile);
        
        for (Requirement r : requirementsOfDesigner) {
       
            Object row[] = new Object[8];
            row[0] = r;
            row[1] = r.getRowMaterial();
            row[2] = r.getProductionMode();
            row[3] = r.getColor();
            row[4] = r.getStyle();
            row[5] = r.getDeadline();
            row[6] = r.getEvaluation();
            row[7] = r.getRequirementFeedback();
            model.addRow(row);
            
        }
    }
}
