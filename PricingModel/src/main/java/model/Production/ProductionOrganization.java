/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Production;

import java.util.ArrayList;
import model.DesignEnterprise.DesignerProfile;
import model.Personnel.Person;

/**
 *
 * @author administratorzi
 */
public class ProductionOrganization {
    //private ProductionManagerProfile productManagerProfile;
    private ProductionModeDirectory productionModeDirectory;
    
    
    public ProductionOrganization() {
        this.productionModeDirectory = new ProductionModeDirectory();
        
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

    
}
