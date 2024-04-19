/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Production;

import java.util.ArrayList;
import model.Business.ProductionEnterprise;
import model.Personnel.Person;



/**
 *
 * @author administratorzi
 */
public class InventoryOrganization {
    private InventoryManagerProfile inventoryManagerProfile;
    //private ProdcutionMaterialOrderDirectory materialOrderDIrectory;
    private ProductionEnterprise productionEnterprise;
    

    public InventoryOrganization(Person p, ProductionEnterprise productionEnterprise) {
       //this.materialOrderDIrectory=new ProdcutionMaterialOrderDirectory();
       inventoryManagerProfile = new InventoryManagerProfile(p, this);
       this.productionEnterprise = productionEnterprise;
    }
    
    //public InventoryManagerProfile getInventoryManagerProfile() {
        //return inventoryManagerProfile;
    //}

    public ProductionEnterprise getProductionEnterprise() {
        return productionEnterprise;
    }

    public InventoryManagerProfile getInventoryManagerProfile() {
        return inventoryManagerProfile;
    }
    
    
    
}
