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
    ArrayList<PlannerProfile> productPlannerDirectory;
    
    public ProductPlannerDirectory() {
        this.productPlannerDirectory = new ArrayList<>();
    }

    public ArrayList<PlannerProfile> getProductPlannerDirectory() {
        return productPlannerDirectory;
    }

    public void setProductPlannerDirectory(ArrayList<PlannerProfile> productPlannerDirectory) {
        this.productPlannerDirectory = productPlannerDirectory;
    } 
}
