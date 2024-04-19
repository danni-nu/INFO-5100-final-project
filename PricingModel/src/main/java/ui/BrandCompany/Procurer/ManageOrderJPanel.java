/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.BrandCompany.Procurer;

import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.BrandCompany.ProcurerProfile;
import model.BrandCompany.Requirement;
import model.Business.BrandEnterprise;
import model.Business.Business;
import model.Production.ProductionOrder;
import model.Production.ProductionOrderDirectory;
import model.Production.ProductionOrganization;
import model.RawMaterialEnterprise.RawMaterialOrder;
import model.RawMaterialEnterprise.RawMaterialOrderDirectory;

/**
 *
 * @author qiaohui
 */
public class ManageOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrder
     */
    JPanel workArea;
    ProcurerProfile procurerProfile;
    Business b;
    BrandEnterprise brandCompany;
    
    
    public ManageOrderJPanel(Business b, ProcurerProfile procurer, JPanel workArea,BrandEnterprise brandCompany) {
        initComponents();
        this.b=b;
        this.procurerProfile=procurer;
        this.workArea=workArea;
        this.brandCompany=brandCompany;
        populateUnplacedOrderTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        btnCheckUnfinishedOrder = new javax.swing.JButton();
        btnCheckOrderDetail = new javax.swing.JButton();
        BbtnCreateNewOrder = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrderDetailStatus = new javax.swing.JTable();
        btnRequestCancelOrder = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblUnplacedOrder = new javax.swing.JTable();
        spnQuantity = new javax.swing.JSpinner();
        lblOrderTotal = new javax.swing.JLabel();
        lblOrderCost = new javax.swing.JLabel();

        btnBack.setText(">>Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnCheckUnfinishedOrder.setText("Check Unfinished Order");

        btnCheckOrderDetail.setText("Check Order Detail");

        BbtnCreateNewOrder.setText("Create New Order");
        BbtnCreateNewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbtnCreateNewOrderActionPerformed(evt);
            }
        });

        lblTitle.setText("Order Management");

        tblOrderDetailStatus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "OrderID", "OrderStatus", "Material ", "Material Status", "ProductionMode", "Product Status", "Deliver TIme"
            }
        ));
        jScrollPane2.setViewportView(tblOrderDetailStatus);

        btnRequestCancelOrder.setText("Request Cancel Order");

        jLabel2.setText("Quantiy:");

        jButton6.setText("Check Unplaced Order");

        tblUnplacedOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "RequirementsID", "RawMaterial", "OrderProductionMode", "Designer", "Color", "Style", "Message"
            }
        ));
        jScrollPane4.setViewportView(tblUnplacedOrder);

        lblOrderTotal.setText("Order Total:");

        lblOrderCost.setText("<Cost>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(215, 215, 215)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(lblOrderTotal)
                                .addGap(13, 13, 13))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spnQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(lblOrderCost)
                                .addGap(83, 83, 83)
                                .addComponent(BbtnCreateNewOrder)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(btnCheckOrderDetail))
                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCheckUnfinishedOrder, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRequestCancelOrder))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(lblTitle))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BbtnCreateNewOrder)
                            .addComponent(lblOrderTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOrderCost, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCheckOrderDetail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCheckUnfinishedOrder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(btnRequestCancelOrder)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        workArea.remove(this);
        CardLayout layout =(CardLayout)workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnBackActionPerformed

    private void BbtnCreateNewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbtnCreateNewOrderActionPerformed
        // TODO add your handling code here:
        
//        ProductionOrganization productionOrganization = selectdProductionEnterprise.getProductionOrganization();
//        ProductionOrderDirectory productionOrderDirectory = selectdProductionEnterprise.getProductionOrderDirectory();
//  
//        ProductionOrder productionOrder4 =productionOrderDirectory.addNewOrder(order4);
//        ProductionOrder productionOrder3 =productionOrderDirectory.addNewOrder(order3);
//        ProductionOrder productionOrder2 =productionOrderDirectory.addNewOrder(order2);
//        ProductionOrder productionOrder1 =productionOrderDirectory.addNewOrder(order1);
//        
//        RawMaterialOrderDirectory rawMaterialOrderDirectory=rawMaterialEnterprise.getRawMaterialManageOrganization().getRawMaterialOrderDirectory();
//        RawMaterialOrder rawMaterialOrder4 =rawMaterialOrderDirectory.addNewRawMaterialOrder(order4, productionOrder4);
    }//GEN-LAST:event_BbtnCreateNewOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BbtnCreateNewOrder;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCheckOrderDetail;
    private javax.swing.JButton btnCheckUnfinishedOrder;
    private javax.swing.JButton btnRequestCancelOrder;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblOrderCost;
    private javax.swing.JLabel lblOrderTotal;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JSpinner spnQuantity;
    private javax.swing.JTable tblOrderDetailStatus;
    private javax.swing.JTable tblUnplacedOrder;
    // End of variables declaration//GEN-END:variables
    
    
    
    private void populateUnplacedOrderTable() {
        DefaultTableModel model = (DefaultTableModel) tblUnplacedOrder.getModel();
        model.setRowCount(0);
        for(Requirement re:brandCompany.getProductPlanningOrganization().getRequirementDirectory().getRequirementsDirectory()){
            Object row[] = new Object[5];
            row[0] = re;
            row[1] = re.getRowMaterial();
            row[2] = re.getProductionMode().getModeName();
            row[3] = re.getDesignerProfile().getPerson().getPersonName();
            row[4] = re.getStyle().getStyleName();
            //row[5] = re.getColor();
            model.addRow(row);
            }
    }
  
}
