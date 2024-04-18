/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.BrandCompany.Procurer;

import java.awt.CardLayout;
import javax.swing.JPanel;
import model.BrandCompany.ProcurerProfile;
import model.Business.BrandEnterprise;
import model.Business.Business;

/**
 *
 * @author qiaohui
 */
public class ProcurerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    JPanel procurerWorkArea;
    Business b;
    ProcurerProfile procurer;
    BrandEnterprise brandCompany;
    
    public ProcurerWorkAreaJPanel(Business b,ProcurerProfile procurer,JPanel procurerWorkArea,BrandEnterprise brandCompany) {
        this.procurerWorkArea=procurerWorkArea;
        this.b=b;
        this.procurer=procurer;
        this.brandCompany=brandCompany;
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
        ManageOrder = new javax.swing.JButton();
        CreateNewOrder = new javax.swing.JButton();
        WorkArea = new javax.swing.JPanel();

        ManageOrder.setText("Manage Order");
        ManageOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageOrderActionPerformed(evt);
            }
        });

        CreateNewOrder.setText("Create New Order");
        CreateNewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateNewOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MemuLayout = new javax.swing.GroupLayout(Memu);
        Memu.setLayout(MemuLayout);
        MemuLayout.setHorizontalGroup(
            MemuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MemuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MemuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ManageOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CreateNewOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MemuLayout.setVerticalGroup(
            MemuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MemuLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(ManageOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CreateNewOrder)
                .addContainerGap(503, Short.MAX_VALUE))
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

    private void ManageOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageOrderActionPerformed
        // TODO add your handling code here:
        ManageOrderJPanel mo=new ManageOrderJPanel(b,procurer,WorkArea,brandCompany);
        WorkArea.add("ManagerOrder",mo);
        CardLayout layout=(CardLayout)WorkArea.getLayout();
        layout.next(WorkArea);
    }//GEN-LAST:event_ManageOrderActionPerformed

    private void CreateNewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateNewOrderActionPerformed
        // TODO add your handling code here:
        CreatNewOrderJPanel cno=new CreatNewOrderJPanel(b,procurer,procurerWorkArea);
        WorkArea.add("Create New Order",cno);
        CardLayout layout=(CardLayout)WorkArea.getLayout();
        layout.next(WorkArea);
    }//GEN-LAST:event_CreateNewOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateNewOrder;
    private javax.swing.JButton ManageOrder;
    private javax.swing.JPanel Memu;
    private javax.swing.JPanel WorkArea;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
