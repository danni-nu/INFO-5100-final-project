/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Production;

import java.util.ArrayList;
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

    

    
    
    
}
