/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.BrandCompany;

/**
 *
 * @author qiaohui
 */
public class ProductPlanningOrganization {
    ProductPlannerDirectory plannerDirectory;
    RequirementsDirectory requirementDirectory;

    public ProductPlanningOrganization() {
        this.plannerDirectory=new ProductPlannerDirectory();
        this.requirementDirectory=new RequirementsDirectory();
    }
    
    
    public ProductPlannerDirectory getPlannerDirectory() {
        return plannerDirectory;
    }

    public void setPlannerDirectory(ProductPlannerDirectory plannerDirectory) {
        this.plannerDirectory = plannerDirectory;
    }

    public RequirementsDirectory getRequirementDirectory() {
        return requirementDirectory;
    }

    public void setRequirementDirectory(RequirementsDirectory requirementDirectory) {
        this.requirementDirectory = requirementDirectory;
    }
    
    
}
