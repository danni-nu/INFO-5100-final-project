/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Business;

import model.Production.InventoryOrganization;
import model.Production.ProductionOrganization;

/**
 *
 * @author qiaohui
 */
public class ProductionEnterprise extends Enterprise{
    String enterpriseType="Production Company";
    String companyName;
    private InventoryOrganization inventoryOrganization;
    private ProductionOrganization productionOrganization;

    public ProductionEnterprise(String companyName) {
        this.enterpriseType="Production Company";
        this.companyName = companyName;
        this.inventoryOrganization=new InventoryOrganization();
    }

    @Override
    public String getEnterpriseType() {
        return "Production Company";
    }
    
    @Override
    public String toString(){
        return companyName;
    }
 
    
}
