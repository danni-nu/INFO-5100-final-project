/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Production.Production;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.BrandCompany.Order;
import model.Business.BrandEnterprise;
import model.Business.Business;
import model.Production.ProductionManagerProfile;
import model.Production.ProductionMode;
import model.Production.ProductionOrder;
import model.Production.ProductionOrderDirectory;

/**
 *
 * @author administratorzi
 */
public class ManageProductionLineJPanel extends javax.swing.JPanel {

    javax.swing.JPanel cardSequencePanel;
    Business business;
    ProductionManagerProfile productionManagerprofile;
    String selectedProductionMode;
    BrandEnterprise brandCompany;
    ProductionOrderDirectory pod;
    ProductionOrder selectedProdutionOrder;
    
    /**
     * Creates new form AssignProducingLineJPanel
     */
    
    public ManageProductionLineJPanel(JPanel cardSequencePanel, Business business,ProductionManagerProfile productionManagerprofile,BrandEnterprise brandCompany) {
        initComponents();
         this.business = business;
        this.cardSequencePanel = cardSequencePanel;
        this.productionManagerprofile = productionManagerprofile;
        this.brandCompany=brandCompany;
        this.pod=populatedAllBrandCompanyOrder();
        populateProductionModeCombo();
        selectedProductionMode = "All production modes";
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductionStatus = new javax.swing.JTable();
        btnProductionFinished = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cmbProductionMode = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Manage Undelivered Production Order");

        tblProductionStatus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Production Order ID", "Production Mode", "Mode Price", "Quantity", "Revenue", "Material Status", "Status", "Message"
            }
        ));
        tblProductionStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblProductionStatusMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblProductionStatus);

        btnProductionFinished.setText("Production Finished");

        jLabel2.setText("Design Solution picture");

        cmbProductionMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProductionModeActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(cmbProductionMode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProductionFinished))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(cmbProductionMode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(428, 428, 428)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProductionFinished)
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblProductionStatusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductionStatusMousePressed
        // TODO add your handling code here:
        int size = tblProductionStatus.getRowCount();
        int selectedrow = tblProductionStatus.getSelectionModel().getLeadSelectionIndex();

        if (selectedrow < 0 || selectedrow > size - 1) {
            return;
        }
        selectedProdutionOrder = ((ProductionOrder) tblProductionStatus.getValueAt(selectedrow, 0));
        if (selectedProdutionOrder == null) {
            return;
        }
    }//GEN-LAST:event_tblProductionStatusMousePressed

    private void cmbProductionModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProductionModeActionPerformed
        // TODO add your handling code here:
        if (cmbProductionMode.getSelectedItem() == null) return;
        selectedProductionMode = (String) cmbProductionMode.getSelectedItem();
        refreshTable();
    }//GEN-LAST:event_cmbProductionModeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProductionFinished;
    private javax.swing.JComboBox<String> cmbProductionMode;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProductionStatus;
    // End of variables declaration//GEN-END:variables

    private ProductionOrderDirectory populatedAllBrandCompanyOrder() {
        pod = productionManagerprofile.getProductionOrganization().getProductionEnterprise().getProductionOrderDirectory();
        for(Order order:brandCompany.getProcurementOrganization().getOrderDirectory().getOrderDirectory()){
           pod.addNewProductionOrder(order.getProductOrder());
        }
        return pod;
    }

    private void populateProductionModeCombo() {
        cmbProductionMode.removeAllItems();
        cmbProductionMode.addItem("All production modes");
        for (ProductionMode productionMode: productionManagerprofile.getProductionOrganization().getProductionModeDirectory().getProductionModeList()){
            
            cmbProductionMode.addItem(productionMode.getModeName());
                
        }   
    }

    private void refreshTable() {
        int rc = tblProductionStatus.getRowCount();
        int i;
        for (i = rc - 1; i >= 0; i--) {
            ((DefaultTableModel) tblProductionStatus.getModel()).removeRow(i);
        }

        //ProductionOrderDirectory pod = inventoryManagerprofile.getInventoryOrganization().getProductionEnterprise().getProductionOrderDirectory();
        if (selectedProductionMode.equals("All production modes")) {
            for (ProductionOrder productionOrder : pod.getProductionOrderList()) {
                
                Object[] row = new Object[8];
                    row[0] = productionOrder;
                    row[1] = productionOrder.getProductionMode();
                    row[2] = productionOrder.getProductionMode().getModePrice();
                    row[3] = productionOrder.getOrder().getQuantity();
                    row[4] = productionOrder.getRevenue();
                    row[5] = productionOrder.getRawMaterialOrder().getDeliverStatus();
                    row[6] = productionOrder.getProductionOrderStatus();
                    row[7] = productionOrder.getMessage();
                ((DefaultTableModel) tblProductionStatus.getModel()).addRow(row);
            }
        } else {

            for (ProductionOrder productionOrder : pod.getProductionOrderList()) {
                if (productionOrder.getProductionMode().getModeName().equals(selectedProductionMode)) {
                    Object[] row = new Object[8];
                    row[0] = productionOrder;
                    row[1] = productionOrder.getProductionMode();
                    row[2] = productionOrder.getProductionMode().getModePrice();
                    row[3] = productionOrder.getOrder().getQuantity();
                    row[4] = productionOrder.getRevenue();
                    row[5] = productionOrder.getRawMaterialOrder().getDeliverStatus();
                    row[6] = productionOrder.getProductionOrderStatus();
                    row[7] = productionOrder.getMessage();
                    ((DefaultTableModel) tblProductionStatus.getModel()).addRow(row);
                }
            }
        }
    }

}


