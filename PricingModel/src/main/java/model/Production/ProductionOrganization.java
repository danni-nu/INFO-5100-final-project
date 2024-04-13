/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Production;

/**
 *
 * @author administratorzi
 */
class ProductionOrganization {
    private ProductionManagerProfile productManagerProfile;
    private ProductionModeDirectory productionModeDirectory;

    

    public ProductionOrganization(ProductionManagerProfile productManagerProfile, ProductionModeDirectory productionModeDirectory) {
        this.productManagerProfile = productManagerProfile;
        this.productionModeDirectory = productionModeDirectory;
    }
    
    public ProductionManagerProfile getProductManagerProfile() {
        return productManagerProfile;
    }
    
    
}
