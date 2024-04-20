/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Production;

import java.util.ArrayList;
import model.Business.ProductionEnterprise;
import model.DesignEnterprise.DesignerProfile;
import model.Personnel.Person;

/**
 *
 * @author administratorzi
 */
public class ProductionOrganization {
    private ProductionManagerProfile productionManagerProfile;
    private ProductionModeDirectory productionModeDirectory;
    private ProductionEnterprise productionEnterprise;
    
    public ProductionOrganization(Person p, ProductionEnterprise productionEnterprise) {
        this.productionModeDirectory = new ProductionModeDirectory();
        productionManagerProfile = new ProductionManagerProfile(p, this);
        this.productionEnterprise = productionEnterprise;
    }
    
    public ProductionModeDirectory getProductionModeDirectory() {
        return productionModeDirectory;
    }

    public void setProductionModeDirectory(ProductionModeDirectory productionModeDirectory) {
        this.productionModeDirectory = productionModeDirectory;
    }

    public ProductionMode findProductionMode(String s){
        for(ProductionMode productionMode: productionModeDirectory.getProductionModeList()){
                if(productionMode.getModeName().equals(s)){
                    return productionMode;
                }
            }
        return null;
    }

    public ProductionManagerProfile getProductionManagerProfile() {
        return productionManagerProfile;
    }

    public ProductionEnterprise getProductionEnterprise() {
        return productionEnterprise;
    }
    
    
}
