/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Business;

import model.Production.InventoryOrganization;
import model.Production.ProductionOrderDirectory;
import model.Production.ProductionOrganization;

/**
 *
 * @author qiaohui
 */
public class ProductionEnterprise{
    String enterpriseType="Production Company";
    String companyName;
    private InventoryOrganization inventoryOrganization;
    private ProductionOrganization productionOrganization;
    private ProductionOrderDirectory productionOrderDirectory;

    public ProductionEnterprise(String companyName) {
        this.enterpriseType="Production Company";
        this.companyName = companyName;
        this.inventoryOrganization=new InventoryOrganization(this);
        this.productionOrganization=new ProductionOrganization(this);
        productionOrderDirectory = new ProductionOrderDirectory(this);
    }

    public ProductionEnterprise(Enterprise enterprise) {
        enterpriseType="Production Company";
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public InventoryOrganization getInventoryOrganization() {
        return inventoryOrganization;
    }

    public void setInventoryOrganization(InventoryOrganization inventoryOrganization) {
        this.inventoryOrganization = inventoryOrganization;
    }

    public ProductionOrganization getProductionOrganization() {
        return productionOrganization;
    }

    public void setProductionOrganization(ProductionOrganization productionOrganization) {
        this.productionOrganization = productionOrganization;
    }

    
    //@Override
    public String getEnterpriseType() {
        return "Production Company";
    }
    
    @Override
    public String toString(){
        return companyName;
    }

    public ProductionOrderDirectory getProductionOrderDirectory() {
        return productionOrderDirectory;
    }
 
    
    
}
