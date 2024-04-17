/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Production;

import java.util.ArrayList;

/**
 *
 * @author administratorzi
 */
public class ProductionOrganization {
    private ProductionManagerProfile productManagerProfile;
    private ProductionModeDirectory productionModeDirectory;
    ProductionOrderDirectory productionOrderDirectory;
    
    public ProductionOrganization() {
        this.productionModeDirectory = new ProductionModeDirectory();
        this.productionOrderDirectory=new ProductionOrderDirectory();
    }

    public ProductionOrderDirectory getProductionOrderDirectory() {
        return productionOrderDirectory;
    }

    public void setProductionOrderDirectory(ProductionOrderDirectory productionOrderDirectory) {
        this.productionOrderDirectory = productionOrderDirectory;
    }
    
    public ProductionModeDirectory getProductionModeDirectory() {
        return productionModeDirectory;
    }

    public void setProductionModeDirectory(ProductionModeDirectory productionModeDirectory) {
        this.productionModeDirectory = productionModeDirectory;
    }

    public ProductionManagerProfile getProductManagerProfile() {
        return productManagerProfile;
    }

    public void setProductManagerProfile(ProductionManagerProfile productManagerProfile) {
        this.productManagerProfile = productManagerProfile;
    }

    
    
    
}
