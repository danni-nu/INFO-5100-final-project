/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.BrandCompany;

import java.util.ArrayList;

/**
 *
 * @author qiaohui
 */
public class ProductPlannerDirectory {
    ArrayList<RequirementsPlanner> productPlannerDirectory;
    
    public ProductPlannerDirectory(ArrayList<RequirementsPlanner> productPlannerDirectory) {
        this.productPlannerDirectory = productPlannerDirectory;
    }

    public ArrayList<RequirementsPlanner> getProductPlannerDirectory() {
        return productPlannerDirectory;
    }

    public void setProductPlannerDirectory(ArrayList<RequirementsPlanner> productPlannerDirectory) {
        this.productPlannerDirectory = productPlannerDirectory;
    } 
}
