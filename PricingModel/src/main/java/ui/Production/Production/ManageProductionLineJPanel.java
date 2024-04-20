/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Production.Production;

import javax.swing.JPanel;
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
        //selectedProductionMode = "all production orders";
        //refreshTable();
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
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cmbProductionMode = new javax.swing.JComboBox<>();

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
                "Production Order ID", "Production Mode", "Order Revenue", "Message", "Material Status", "Quantity", "Design Solution Image", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblProductionStatus);

        jButton1.setText("Order Finished");

        jLabel2.setText("Design Solution picture");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cmbProductionMode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 889, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
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
                .addGap(457, 457, 457)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<ProductionMode> cmbProductionMode;
    private javax.swing.JButton jButton1;
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
        for (ProductionMode productionMode: productionManagerprofile.getProductionOrganization().getProductionModeDirectory().getProductionModeList()){
            
                    cmbProductionMode.addItem(productionMode);
                
            }
    }
}