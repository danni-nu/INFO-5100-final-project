/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.RawMaterialRole;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.BrandCompany.Order;
import model.Business.BrandEnterprise;
import model.Business.Business;
import model.Business.RawMaterialEnterprise;
import model.RawMaterialEnterprise.RawMaterialManageOrganization;
import model.RawMaterialEnterprise.RawMaterialManager;
import model.RawMaterialEnterprise.RawMaterialOrder;
import model.RawMaterialEnterprise.RawMaterialOrderDirectory;

/**
 *
 * @author tianlyu
 */
public class ManageMaterialOrderJPanel extends javax.swing.JPanel {


    javax.swing.JPanel CardSequencePanel;
    Business business;
    RawMaterialEnterprise rawMaterialEnterprise;
    RawMaterialManager rawMaterialManager;
    BrandEnterprise brandEnterprise;
 


    /**
     * Creates new form ManageRequirementsTask1JPanel
     */

    public ManageMaterialOrderJPanel(Business business, JPanel CardSequencePanel, RawMaterialEnterprise rawMaterialEnterprise, RawMaterialManager rawMaterialManager,BrandEnterprise brandEnterprise) {
        
        this.business = business;
        this.CardSequencePanel = CardSequencePanel;
        this.rawMaterialEnterprise = rawMaterialEnterprise;
        this.brandEnterprise=brandEnterprise;
        this.rawMaterialManager = rawMaterialManager;
        initComponents();
        populateTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblorder = new javax.swing.JTable();
        addButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(236, 244, 251));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Manage Material Order");

        Back.setText("<< Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Order list");

        tblorder.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        tblorder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Material Order ID", "Marerial Order Name", "Price", "Marerial Order Status", "Delivery Date", "Delivery Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblorder);

        addButton.setText("Add Delivery Order");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 891, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(265, 265, 265)))
                        .addGap(51, 51, 51))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Back)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addButton)
                .addContainerGap(143, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        CardSequencePanel.remove(this);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_BackActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        int row = tblorder.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        //chose one order
        RawMaterialOrder rmrOrder =  (RawMaterialOrder)tblorder.getValueAt(row, 0); 
        
        DeliveryOrderJPanel dojp = new DeliveryOrderJPanel(business,CardSequencePanel,rawMaterialEnterprise,rawMaterialManager,rmrOrder);
        CardSequencePanel.add("UploadDesignSolutionJPanel", dojp);
        CardLayout layout = (CardLayout) CardSequencePanel.getLayout();
        layout.next(CardSequencePanel);
    }//GEN-LAST:event_addButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton addButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblorder;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblorder.getModel();
        model.setRowCount(0);
        //RawMaterialOrderDirectory rawMaterialOrderDirectory=rawMaterialEnterprise.getRawMaterialManageOrganization().getRawMaterialOrderDirectory();
        RawMaterialOrderDirectory rawMaterialOrderDirectory=initialBrandCompanyOrder();
        for (RawMaterialOrder roMaterialOrder : rawMaterialOrderDirectory.getRawMaterialOrderDirectory()) {
            Object row[] = new Object[6];
            row[0] = roMaterialOrder;
            row[1] = roMaterialOrder.getRawMaterial();
            row[2] = roMaterialOrder.getMaterialPrice();
//            row[3] = roMaterialOrder.getDeliverStatus();
            row[4] = roMaterialOrder.getDeliveryNumber();
            row[5] = roMaterialOrder.getDeliveryDate();
            model.addRow(row);
        }
        
    }

    private RawMaterialOrderDirectory initialBrandCompanyOrder() {
        RawMaterialManageOrganization RWO=rawMaterialEnterprise.getRawMaterialManageOrganization();
        RawMaterialOrderDirectory rawMaterialOrderDirectory=RWO.getRawMaterialOrderDirectory();
        for(Order order:brandEnterprise.getProcurementOrganization().getOrderDirectory().getOrderDirectory()){
            rawMaterialOrderDirectory.addARelatedOrder(order);
        }
        return rawMaterialOrderDirectory;
    }
}
