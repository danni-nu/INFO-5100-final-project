/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Production.Inventory;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.BrandCompany.Order;
import model.Business.BrandEnterprise;
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
    BrandEnterprise brandCompany;
    //ProductionOrderDirectory pod;
    ProductionOrder selectedProdutionOrder = null;
    /**
     * Creates new form ManageMaterialOrderJPanel
     */

    public ManageMaterialsforProductionOrderJPanel(JPanel WorkArea, Business business, InventoryManagerProfile inventoryManagerProfile, BrandEnterprise brandCompany) {
        initComponents();
        this.business = business;
        this.cardSequencePanel = WorkArea;
        this.inventoryManagerprofile = inventoryManagerProfile;
       this.brandCompany=brandCompany;
        //this.pod=pod;
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
        btnAddAddress = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnPutIntoProduction = new javax.swing.JButton();

        tblMaterialInformation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Material", "Material Price", "Quantity", "Material Status", "Warehouse Address", "Delivered Time", "Production Status"
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

        btnAddAddress.setText("Place Material Order for Production");
        btnAddAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAddressActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Production Order Material Information");

        btnPutIntoProduction.setText("Put into Production Line");
        btnPutIntoProduction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPutIntoProductionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cmbMaterialStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnPutIntoProduction, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(377, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbMaterialStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAddAddress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPutIntoProduction)
                .addContainerGap(332, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbMaterialStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMaterialStatusActionPerformed
        // TODO add your handling code here:
        if (cmbMaterialStatus.getSelectedItem() == null) return;
        selectedMaterialStatus = (String) cmbMaterialStatus.getSelectedItem();
        refreshTable();
    }//GEN-LAST:event_cmbMaterialStatusActionPerformed

    private void btnAddAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAddressActionPerformed
        // TODO add your handling code here:
        //if (selectedProdutionOrder == null) {
            //JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
        //} 
        int size = tblMaterialInformation.getRowCount();
        int selectedrow = tblMaterialInformation.getSelectionModel().getLeadSelectionIndex();

        if (selectedrow < 0 || selectedrow > size - 1) {
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        selectedProdutionOrder = ((ProductionOrder) tblMaterialInformation.getValueAt(selectedrow, 0));

        PlaceMaterialOrderJPanel mmpojp = new PlaceMaterialOrderJPanel(selectedProdutionOrder,cardSequencePanel);
        cardSequencePanel.add("PurchaseMaterialsforProductionOrderJPanel", mmpojp);
        CardLayout layout = (CardLayout) cardSequencePanel.getLayout();
        layout.next(cardSequencePanel);
    }//GEN-LAST:event_btnAddAddressActionPerformed

    private void btnPutIntoProductionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPutIntoProductionActionPerformed
        // TODO add your handling code here:
       //if (selectedProdutionOrder == null) {
            //JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
        //} 
        int size = tblMaterialInformation.getRowCount();
        int selectedrow = tblMaterialInformation.getSelectionModel().getLeadSelectionIndex();

        if (selectedrow < 0 || selectedrow > size - 1) {
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        selectedProdutionOrder = ((ProductionOrder) tblMaterialInformation.getValueAt(selectedrow, 0));
        if(!selectedProdutionOrder.getRawMaterialOrder().getDeliverStatus().equals("Delivered"))
        {
            JOptionPane.showMessageDialog(null, "No Material for Production!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        selectedProdutionOrder.setProductionOrderStatus("in producing");
        JOptionPane.showMessageDialog(null, "Put into production line successfully!!", "Info", JOptionPane.INFORMATION_MESSAGE);
        refreshTable();
    }//GEN-LAST:event_btnPutIntoProductionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAddress;
    private javax.swing.JButton btnPutIntoProduction;
    private javax.swing.JComboBox<String> cmbMaterialStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblMaterialInformation;
    // End of variables declaration//GEN-END:variables

    private void populateMaterialStatusCombo() {
        cmbMaterialStatus.removeAllItems();
        cmbMaterialStatus.addItem("all production orders");
         cmbMaterialStatus.addItem("material order not placed");
        cmbMaterialStatus.addItem("material not arrived");
        cmbMaterialStatus.addItem("material arrived");
        
    }

    public void refreshTable() {
        int rc = tblMaterialInformation.getRowCount();
        int i;
        for (i = rc - 1; i >= 0; i--) {
            ((DefaultTableModel) tblMaterialInformation.getModel()).removeRow(i);
        }
        ProductionOrderDirectory pod = inventoryManagerprofile.getInventoryOrganization().getProductionEnterprise().getProductionOrderDirectory();
        if (selectedMaterialStatus.equals("all production orders")){
            for (ProductionOrder productionOrder : pod.getProductionOrderList()) {
              Object[] row = new Object[8];
              row[0] = productionOrder;
              row[1] = productionOrder.getOrder().getRawMaterial();
              row[2] = productionOrder.getOrder().getRawMaterial().getPrice();
              row[3] = productionOrder.getOrder().getQuantity();
              row[4] = productionOrder.getRawMaterialOrder().getDeliverStatus();
              row[5] = productionOrder.getRawMaterialOrder().getDeliveryaddress();
              row[6] = productionOrder.getRawMaterialOrder().getDeliveryDate(); 
              row[7]= productionOrder.getProductionOrderStatus();
              //row[8]= productionOrder.getProductionMode();
              ((DefaultTableModel) tblMaterialInformation.getModel()).addRow(row);
            }
        }
        
         if(selectedMaterialStatus.equals("material order not placed")){
            for (ProductionOrder productionOrder : pod.getProductionOrderList()) {
                if(productionOrder.getRawMaterialOrder().getDeliverStatus().equals("Material Order Unplaced")){
                    Object[] row = new Object[8];
                    row[0] = productionOrder;
                    row[1] = productionOrder.getOrder().getRawMaterial();
                    row[2] = productionOrder.getOrder().getRawMaterial().getPrice();
                    row[3] = productionOrder.getOrder().getQuantity();
                    row[4] = productionOrder.getRawMaterialOrder().getDeliverStatus();
                    row[5] = productionOrder.getRawMaterialOrder().getDeliveryaddress();
                    row[6] = productionOrder.getRawMaterialOrder().getDeliveryDate();
                    row[7]= productionOrder.getProductionOrderStatus();
                    //row[8]= productionOrder.getProductionMode();
                    ((DefaultTableModel) tblMaterialInformation.getModel()).addRow(row);
            }
            }  
        }
        
        if(selectedMaterialStatus.equals("material not arrived")){
            for (ProductionOrder productionOrder : pod.getProductionOrderList()) {
                if(productionOrder.getRawMaterialOrder().getDeliverStatus().equals("Not Delivered")){
                    Object[] row = new Object[8];
                    row[0] = productionOrder;
                    row[1] = productionOrder.getOrder().getRawMaterial();
                    row[2] = productionOrder.getOrder().getRawMaterial().getPrice();
                    row[3] = productionOrder.getOrder().getQuantity();
                    row[4] = productionOrder.getRawMaterialOrder().getDeliverStatus();
                    row[5] = productionOrder.getRawMaterialOrder().getDeliveryaddress();
                    row[6] = productionOrder.getRawMaterialOrder().getDeliveryDate();
                    row[7]= productionOrder.getProductionOrderStatus();
                    //row[8]= productionOrder.getProductionMode();
                    ((DefaultTableModel) tblMaterialInformation.getModel()).addRow(row);
            }
            }  
        }
        
        if(selectedMaterialStatus.equals("material arrived")){
            for (ProductionOrder productionOrder : pod.getProductionOrderList()) {
                if(productionOrder.getRawMaterialOrder().getDeliverStatus().equals("Delivered")){
                    Object[] row = new Object[8];
                    row[0] = productionOrder;
                    row[1] = productionOrder.getOrder().getRawMaterial();
                    row[2] = productionOrder.getOrder().getRawMaterial().getPrice();
                    row[3] = productionOrder.getOrder().getQuantity();
                    row[4] = productionOrder.getRawMaterialOrder().getDeliverStatus();
                    row[5] = productionOrder.getRawMaterialOrder().getDeliveryaddress();
                    row[6] = productionOrder.getRawMaterialOrder().getDeliveryDate(); 
                    row[7]= productionOrder.getProductionOrderStatus();
                    //row[8]= productionOrder.getProductionMode();
                    ((DefaultTableModel) tblMaterialInformation.getModel()).addRow(row);}
            }
            
        }
    }

//    private ProductionOrderDirectory populatedAllBrandCompanyOrder() {
//        pod = inventoryManagerprofile.getInventoryOrganization().getProductionEnterprise().getProductionOrderDirectory();
//        for(Order order:brandCompany.getProcurementOrganization().getOrderDirectory().getOrderDirectory()){
//           pod.addNewProductionOrder(order.getProductOrder());
//        }
//        return pod;
//    }
    
   
}

