package ui;


import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.BrandCompany.ProcurerProfile;
import model.BrandCompany.PlannerProfile;
import model.Business.BrandEnterprise;
import model.Business.Business;
import model.Business.DesignEnterprise;
import model.Business.ProductionEnterprise;
import model.Business.RawMaterialEnterprise;
import model.DesignEnterprise.DesignerProfile;
import model.Personnel.Profile;
import model.Production.InventoryManagerProfile;
import model.Production.ProductionManagerProfile;
import model.RawMaterialEnterprise.RawMaterialManager;
import model.UserAccountManagement.UserAccount;
import model.UserAccountManagement.UserAccountDirectory;
import ui.BrandCompany.Procurer.ProcurerWorkAreaJPanel;
import ui.BrandCompany.Planner.PlannerWorkAreaJPanel;
import ui.DesignerRole.DesignerWorkAreaJPanel;
import ui.Production.Inventory.ProductionEnterpriseInventoryWorkAreaJPanel;
import ui.Production.Inventory.ProductionEnterpriseInventoryWorkAreaJPanel1;
import ui.Production.Production.ProductionWorkAreaJPanel;
import ui.RawMaterialRole.InventoryWorkAreaJPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author qiaohui
 */
public class LoginJPanel extends javax.swing.JPanel {

    Business business;
    JPanel loginJPanel;
    
    public LoginJPanel(JPanel cardSequencePanel,Business business) {
        initComponents();
        this.business=business;
        this.loginJPanel=cardSequencePanel;
        populateEnterpriseTypeCombo();
        populateCompanyNameCombo();
        
        txtUserAccount.setText("");
        txtPassword.setText("");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogin = new javax.swing.JButton();
        lblUserAccount = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        txtUserAccount = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        cmbCompany = new javax.swing.JComboBox<>();
        lblCompany = new javax.swing.JLabel();
        cmbCompanyType = new javax.swing.JComboBox<>();
        lblCompanyType = new javax.swing.JLabel();

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblUserAccount.setText("User Account");

        lblPassword.setText("Password");

        cmbCompany.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCompanyActionPerformed(evt);
            }
        });

        lblCompany.setText("Company");

        cmbCompanyType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCompanyType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCompanyTypeActionPerformed(evt);
            }
        });

        lblCompanyType.setText("Enterprise Type");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(239, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(btnLogin))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPassword)
                            .addComponent(lblUserAccount)
                            .addComponent(lblCompany)
                            .addComponent(lblCompanyType))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbCompany, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUserAccount)
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(cmbCompanyType, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(196, 196, 196))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCompanyType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCompanyType))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCompany))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserAccount)
                    .addComponent(txtUserAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(btnLogin)
                .addContainerGap(190, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String un = txtUserAccount.getText();
        String pw = txtPassword.getText();

        UserAccountDirectory uad = business.getUserAccountDirectory();
        UserAccount useraccount = uad.AuthenticateUser(un, pw);
        if (useraccount == null) {
            JOptionPane.showMessageDialog(this, "Please input your account");
        }
//        ProcurerWorkAreaJPanel procurerWorkAreajpanel;
//        PlannerWorkAreaJPanel PlannerWorkAreaJpanel;
        ProductionWorkAreaJPanel productionworkarea;
        ProductionEnterpriseInventoryWorkAreaJPanel productioninventoryworkarea;
        
        DesignerWorkAreaJPanel designerWorkArea;//Designer work area
        InventoryWorkAreaJPanel inventoryWorkArea;//RowMaterial work area
       
        
        String r = useraccount.getRole();
        Profile profile = useraccount.getAssociatedPersonProfile();

        if (profile instanceof ProcurerProfile) {
            ProcurerProfile p=(ProcurerProfile)profile;
            String s=(String)cmbCompany.getSelectedItem();
            BrandEnterprise e = business.getEnterpriseDirectory().getBrandCompany(s);
            ProcurerWorkAreaJPanel procurerWorkJPanel= new ProcurerWorkAreaJPanel(business, p,loginJPanel,e);
            //loginJPanel.removeAll();
            loginJPanel.add("Procurer Work Area", procurerWorkJPanel);
            CardLayout layout =(CardLayout)loginJPanel.getLayout();
            layout.next(loginJPanel);

        }

         if (profile instanceof PlannerProfile) {
            PlannerProfile spp = (PlannerProfile) profile;
            String s=(String)cmbCompany.getSelectedItem();
            BrandEnterprise e = business.getEnterpriseDirectory().getBrandCompany(s);
            PlannerWorkAreaJPanel ppp= new PlannerWorkAreaJPanel(business, spp, loginJPanel,e);
            //loginJPanel.removeAll();
            loginJPanel.add("Planner Work Area", ppp);
            CardLayout layout =(CardLayout)loginJPanel.getLayout();
            layout.next(loginJPanel);

        }
         
        
//        if (!(profile instanceof FacultyProfile)) {
//        } else {
//            FacultyProfile fp = (FacultyProfile) profile;
//            facultyworkarea = new FacultyWorkAreaJPanel(business, fp,loginJPanel);
//            loginJPanel.removeAll();
//            loginJPanel.add("faculty", facultyworkarea);
//            CardLayout layout =(CardLayout)loginJPanel.getLayout();
//            layout.next(loginJPanel);




        if (profile instanceof ProductionManagerProfile) {
            String s=(String)cmbCompany.getSelectedItem();
            ProductionEnterprise e = business.getEnterpriseDirectory().getProductionEnterprise(s);
            productionworkarea = new ProductionWorkAreaJPanel(business, loginJPanel,(ProductionManagerProfile)profile);
            //loginJPanel.removeAll();
            loginJPanel.add("ProductionWorkAreaJPanel", productionworkarea);
            ((java.awt.CardLayout) loginJPanel.getLayout()).next(loginJPanel);

        }
        
         if (profile instanceof InventoryManagerProfile) {
            String s=(String)cmbCompany.getSelectedItem();
            ProductionEnterprise e = business.getEnterpriseDirectory().getProductionEnterprise(s);
            productioninventoryworkarea = new ProductionEnterpriseInventoryWorkAreaJPanel(business, loginJPanel,(InventoryManagerProfile)profile);
           // loginJPanel.removeAll();
            loginJPanel.add("ProductionWorkAreaJPane", productioninventoryworkarea);
            ((java.awt.CardLayout) loginJPanel.getLayout()).next(loginJPanel);

        }
         
        
        //Designer to login


        if (profile instanceof DesignerProfile) {
            DesignerProfile dp = (DesignerProfile) profile;
            String s=(String)cmbCompany.getSelectedItem();
            DesignEnterprise ds = business.getEnterpriseDirectory().getDesignEnterprise(s); 
            BrandEnterprise brandCompany = business.getEnterpriseDirectory().getBrandCompany("Brand Company1");//默认是Brand Company1
            designerWorkArea = new DesignerWorkAreaJPanel(business, loginJPanel,(DesignerProfile)profile,ds,brandCompany);
            loginJPanel.removeAll();
            loginJPanel.add("Designer", designerWorkArea);
            ((java.awt.CardLayout) loginJPanel.getLayout()).next(loginJPanel);

        }
       
        //RawMaterialManager to login 
        if (profile instanceof RawMaterialManager) {

            inventoryWorkArea = new InventoryWorkAreaJPanel(business, loginJPanel,(RawMaterialManager)profile);
            loginJPanel.removeAll();
            loginJPanel.add("RawMaterialManager", inventoryWorkArea);
            ((java.awt.CardLayout) loginJPanel.getLayout()).next(loginJPanel);

        }        


    }//GEN-LAST:event_btnLoginActionPerformed

    private void cmbCompanyTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCompanyTypeActionPerformed
        // TODO add your handling code here:
        updateSupplierVisibility();
        if (cmbCompanyType.getSelectedItem()!=null) {
             populateCompanyNameCombo();
        }
       
    }//GEN-LAST:event_cmbCompanyTypeActionPerformed

    private void cmbCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCompanyActionPerformed
        // TODO add your handling code here:
        if (cmbCompany.getSelectedItem()==null) {
            return;
        }
        String selectedComapnyName=(String)cmbCompany.getSelectedItem();
    }//GEN-LAST:event_cmbCompanyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JComboBox<String> cmbCompany;
    private javax.swing.JComboBox<String> cmbCompanyType;
    private javax.swing.JLabel lblCompany;
    private javax.swing.JLabel lblCompanyType;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserAccount;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserAccount;
    // End of variables declaration//GEN-END:variables

    public void populateEnterpriseTypeCombo() {
        cmbCompanyType.removeAllItems();
        String s1="Brand Company";
        String s2="Design Company";
        String s3="Production Company";
        String s4="Raw Material Company";
        cmbCompanyType.addItem(s1);
        cmbCompanyType.addItem(s2);
        cmbCompanyType.addItem(s3);
        cmbCompanyType.addItem(s4);
  
    }

    public void populateCompanyNameCombo() {
        cmbCompany.removeAllItems();
        String s=(String)cmbCompanyType.getSelectedItem();
        if (s.equals("Brand Company")){
            for(BrandEnterprise e:business.getEnterpriseDirectory().getBrandEnterpriseList()){
                cmbCompany.addItem(e.toString());
            }
        }
        if (s.equals("Design Company")){
            for(DesignEnterprise e:business.getEnterpriseDirectory().getDesignEnterpriseList()){
                cmbCompany.addItem(e.toString());
            }
        }
        if (s.equals("Production Company")){
            for(ProductionEnterprise e:business.getEnterpriseDirectory().getProductionEnterpriseList()){
                cmbCompany.addItem(e.toString());
            }
        }
        if (s.equals("Raw Material Company")){
            for(RawMaterialEnterprise e:business.getEnterpriseDirectory().getRawMaterialEnterpriseList()){
                cmbCompany.addItem(e.toString());
            }
        }
        
    }

    private void updateSupplierVisibility() {
        if((cmbCompanyType.getSelectedItem()==null)){
            lblCompany.setVisible(false);
            cmbCompany.setVisible(false);
            return;
        }else{
            lblCompany.setVisible(true);
            cmbCompany.setVisible(true);
        }
         
    }
}
