 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.DesignerRole;

import java.awt.CardLayout;
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
    private JPanel userProcessContainer;
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
        
        
        
        HashMap<DesignerProfile, List<Requirement>> designerToRequirement = RequirementAssignmentDirectory.getDesignerToRequirement();
        List<Requirement> requirementsOfDesigner = designerToRequirement.get(designerProfile);
        if(requirementsOfDesigner != null){
           populateRequirmentTable(); 
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbltask = new javax.swing.JTable();
        Back = new javax.swing.JButton();
        AddjButton = new javax.swing.JButton();
        removejButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        AddSolutionjButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSchedule = new javax.swing.JTable();
        removejButton1 = new javax.swing.JButton();

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
                "Requirement ID", "Raw Material", "Production Mode", "Color", "Style", "Deadline", "Status"
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

        AddjButton.setText("Add Requirement To My Schedule");
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

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("My New Requirements To Schedule");

        AddSolutionjButton.setText("Add solution");
        AddSolutionjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSolutionjButtonActionPerformed(evt);
            }
        });

        tblSchedule.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        tblSchedule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Requirement ID", "Raw Material", "Production Mode", "Color", "Style", "Deadline", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblSchedule);

        removejButton1.setText("Get the New Staus");
        removejButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removejButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(removejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AddSolutionjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(removejButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 892, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 892, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 58, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AddjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(removejButton1))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddSolutionjButton)
                    .addComponent(removejButton))
                .addGap(86, 86, 86))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        Requirement r =  (Requirement)tbltask.getValueAt(row, 0); 
        
        //check can not chose the same one requirment
        if(RequirementAssignmentDirectory.getRequirementToRequirementAssignment().containsKey(r)){
            JOptionPane.showMessageDialog(null, "Already exist in your schedule!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }else{
            RequirementAssignmentDirectory.assignRequirementToDesginer(designerProfile, r);
            populateRequirmentTable(); 
            System.out.println(RequirementAssignmentDirectory.getDesignerToRequirement());
            JOptionPane.showMessageDialog(null, "Requirement Added to Schedule Successfully!!", "Info", JOptionPane.INFORMATION_MESSAGE);            
        }
        
//        HashMap<DesignerProfile, List<Requirement>> hashMap = RequirementAssignmentDirectory.getDesignerToRequirement();
//        
//        if(hashMap.get(designerProfile) != null){
//            List<Requirement> requirements = hashMap.get(designerProfile);
//            for(Requirement re : requirements){
//            if(re == r){
//                JOptionPane.showMessageDialog(null, "Already exist in your schedule!!", "Warning", JOptionPane.WARNING_MESSAGE);
//            }else{
//                //assignRequirement To Desginer
//                RequirementAssignmentDirectory.assignRequirementToDesginer(designerProfile, r);
//                populateRequirmentTable(); 
//                System.out.println(RequirementAssignmentDirectory.getDesignerToRequirement());
//                JOptionPane.showMessageDialog(null, "Requirement Added to Schedule Successfully!!", "Info", JOptionPane.INFORMATION_MESSAGE);
//                
//            }
//        }
//            
//        }else{
//            RequirementAssignmentDirectory.assignRequirementToDesginer(designerProfile, r);
//            populateRequirmentTable(); 
//            System.out.println(RequirementAssignmentDirectory.getDesignerToRequirement());
//            JOptionPane.showMessageDialog(null, "Requirement Added to Schedule Successfully!!", "Info", JOptionPane.INFORMATION_MESSAGE);
//            
//        }
        
        
        
        
        
        
        
                          
    }//GEN-LAST:event_AddjButtonActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        CardSequencePanel.remove(this);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_BackActionPerformed

    private void AddSolutionjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSolutionjButtonActionPerformed
        // TODO add your handling code here:
        int row = tblSchedule.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        //chose one requirement
        Requirement r =  (Requirement)tblSchedule.getValueAt(row, 0); 
        
        UploadDesignSolutionJPanel upds = new UploadDesignSolutionJPanel(CardSequencePanel, r,business,designerProfile,designEnterprise);
        CardSequencePanel.add("UploadDesignSolutionJPanel", upds);
        CardLayout layout = (CardLayout) CardSequencePanel.getLayout();
        layout.next(CardSequencePanel);
        
    }//GEN-LAST:event_AddSolutionjButtonActionPerformed

    private void removejButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removejButton1ActionPerformed
        // TODO add your handling code here:
        populateRequirmentTable();
    }//GEN-LAST:event_removejButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddSolutionjButton;
    private javax.swing.JButton AddjButton;
    private javax.swing.JButton Back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton removejButton;
    private javax.swing.JButton removejButton1;
    private javax.swing.JTable tblSchedule;
    private javax.swing.JTable tbltask;
    // End of variables declaration//GEN-END:variables

    private void populateCartTable() {
        DefaultTableModel model = (DefaultTableModel) tbltask.getModel();
        model.setRowCount(0);
        HashMap<Requirement, RequirementAssignment>  hashMap = RequirementAssignmentDirectory.getRequirementToRequirementAssignment();
        for (Requirement r : brandCompany.getProductPlanningOrganization().getRequirementDirectory().getRequirementsDirectory()) {
            Object row[] = new Object[7];
            row[0] = r;
            row[1] = r.getRowMaterial();
            row[2] = r.getProductionMode();
            row[3] = r.getColor();
            row[4] = r.getStyle();
            row[5] = r.getDeadline();
            
            //check if has the RequirementAssignment: inistial is null
            if(hashMap.get(r) == null){
                row[6] = "Not assigned";
            }else{
                row[6] = hashMap.get(r).getStatus();
            }
            
            
            model.addRow(row);
        }
    }
    
    //designer own 
    private void populateRequirmentTable() {
        DefaultTableModel model = (DefaultTableModel) tblSchedule.getModel();
        model.setRowCount(0);    
        //get the designerToRequirement HashMap
        HashMap<DesignerProfile, List<Requirement>> designerToRequirement = RequirementAssignmentDirectory.getDesignerToRequirement();
        List<Requirement> requirementsOfDesigner = designerToRequirement.get(designerProfile);
        
        HashMap<Requirement, RequirementAssignment>  hashMap2 = RequirementAssignmentDirectory.getRequirementToRequirementAssignment();
        
        for (Requirement r : requirementsOfDesigner) {
       
            Object row[] = new Object[7];
            row[0] = r;
            row[1] = r.getRowMaterial();
            row[2] = r.getProductionMode();
            row[3] = r.getColor();
            row[4] = r.getStyle();
            row[5] = r.getDeadline();           
            row[6] = hashMap2.get(r).getStatus();
            model.addRow(row);
            
        }
        
    }
}
