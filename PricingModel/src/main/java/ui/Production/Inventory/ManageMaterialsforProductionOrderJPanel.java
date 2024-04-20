/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Production.Inventory;

import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Business.Business;
import model.Production.InventoryManagerProfile;
import model.Production.ProductionMode;
import model.Production.ProductionOrder;
import model.Production.ProductionOrderDirectory;

/**
 *
 * @author administratorzi
 */
public class ManageMaterialsforProductionOrderJPanel extends javax.swing.JPanel {

    javax.swing.JPanel cardSequencePanel;
    Business business;
    InventoryManagerProfile inventoryManagerprofile;
    String selectedMaterialStatus;
    ProductionOrderDirectory lastedOrderDirecotry= populatedAllBrandCompanyOrder();
    BrandCompany 
    /**
     * Creates new form ManageMaterialOrderJPanel
     */
    public ManageMaterialsforProductionOrderJPanel(JPanel cardSequencePanel, Business business,InventoryManagerProfile inventoryManagerprofile) {
        initComponents();
        this.business = business;
        this.cardSequencePanel = cardSequencePanel;
        this.inventoryManagerprofile = inventoryManagerprofile;
        populateMaterialStatusCombo();
        selectedMaterialStatus = "all production orders";
        refreshTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblMaterialInformation = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cmbMaterialStatus = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        tblMaterialInformation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Production Order ID", "Material Name", "Material Price", "Quantity", "Material Status", "Inventory Address", "Delivered Time"
            }
        ));
        jScrollPane2.setViewportView(tblMaterialInformation);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Manage Materials for Production Order");

        cmbMaterialStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMaterialStatusActionPerformed(evt);
            }
        });

        jLabel2.setText("Material State: Material Order Not Placed/Material Order in Production/Material Order Delivered(when material delivered, the production order will automatically start producing)");

        jButton1.setText("Purchase Marerials");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Production Order Material Information");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1028, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cmbMaterialStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabel1)))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(cmbMaterialStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(45, 45, 45)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(361, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbMaterialStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMaterialStatusActionPerformed
        // TODO add your handling code here:
        if (cmbMaterialStatus.getSelectedItem() == null) return;
        selectedMaterialStatus = (String) cmbMaterialStatus.getSelectedItem();
        refreshTable();
    }//GEN-LAST:event_cmbMaterialStatusActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbMaterialStatus;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblMaterialInformation;
    // End of variables declaration//GEN-END:variables

    private void populateMaterialStatusCombo() {
        cmbMaterialStatus.removeAllItems();
        cmbMaterialStatus.addItem("all production orders");
        cmbMaterialStatus.addItem("material not arrived");
        cmbMaterialStatus.addItem("material arrived");
        
    }

    private void refreshTable() {
        int rc = tblMaterialInformation.getRowCount();
        int i;
        for (i = rc - 1; i >= 0; i--) {
            ((DefaultTableModel) tblMaterialInformation.getModel()).removeRow(i);
        }

        ProductionOrderDirectory pod = inventoryManagerprofile.getInventoryOrganization().getProductionEnterprise().getProductionOrderDirectory();
        
        
 
        if (selectedMaterialStatus.equals("all production orders")){
            for (ProductionOrder productionOrder : pod.getProductionOrderList()) {
              Object[] row = new Object[7];
              row[0] = productionOrder;
              row[1] = productionOrder.getOrder().getRawMaterial();
              row[2] = productionOrder.getOrder().getRawMaterial().getPrice();
              row[3] = productionOrder.getOrder().getQuantity();
              row[4] = productionOrder.getRawMaterialOrder().getDeliverStatus();
              row[5] = productionOrder.getRawMaterialOrder().getDeliverStatus();
              row[6] = productionOrder.getRawMaterialOrder().getDeliveryDate();    
              ((DefaultTableModel) tblMaterialInformation.getModel()).addRow(row);
            }
        }
        
        if(selectedMaterialStatus.equals("material not arrived")){
            for (ProductionOrder productionOrder : pod.getProductionOrderList()) {
                if(productionOrder.getRawMaterialOrder().getDeliverStatus().equals("Not delivered")){
                    Object[] row = new Object[7];
                    row[0] = productionOrder;
                    row[1] = productionOrder.getOrder().getRawMaterial();
                    row[2] = productionOrder.getOrder().getRawMaterial().getPrice();
                    row[3] = productionOrder.getOrder().getQuantity();
                    row[4] = productionOrder.getRawMaterialOrder().getDeliverStatus();
                    row[5] = productionOrder.getRawMaterialOrder().getDeliverStatus();
                    row[6] = productionOrder.getRawMaterialOrder().getDeliveryDate();   }
                    ((DefaultTableModel) tblMaterialInformation.getModel()).addRow(row);
            }
            
        }
        
        if(selectedMaterialStatus.equals("material arrived")){
            for (ProductionOrder productionOrder : pod.getProductionOrderList()) {
                if(!productionOrder.getRawMaterialOrder().getDeliverStatus().equals("Not delivered")){
                    Object[] row = new Object[7];
                    row[0] = productionOrder;
                    row[1] = productionOrder.getOrder().getRawMaterial();
                    row[2] = productionOrder.getOrder().getRawMaterial().getPrice();
                    row[3] = productionOrder.getOrder().getQuantity();
                    row[4] = productionOrder.getRawMaterialOrder().getDeliverStatus();
                    row[5] = productionOrder.getRawMaterialOrder().getDeliverStatus();
                    row[6] = productionOrder.getRawMaterialOrder().getDeliveryDate();   
                    ((DefaultTableModel) tblMaterialInformation.getModel()).addRow(row);}
            }
            
        }
        
    }

    private ProductionOrderDirectory populatedAllBrandCompanyOrder() {
        ProductionOrderDirectory pod = inventoryManagerprofile.getInventoryOrganization().getProductionEnterprise().getProductionOrderDirectory();
        for(Object bc:business.getEnterpriseDirectory().getBrandEnterpriseList()){
            for(Order order:(BrandCompany)bc.get){
            
            
            }
            
            
            
        }}
        
}

