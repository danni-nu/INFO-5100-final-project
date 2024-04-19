/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DesignEnterprise;

import java.util.ArrayList;
import model.BrandCompany.Requirement;
import model.Personnel.Person;
import model.Personnel.Profile;

/**
 *
 * @author tianlyu
 */
public class DesignerProfile extends Profile {
    int defaultDesignPricing;
    String deginerTitle;
    

    public DesignerProfile(Person p, int defaultDesignPricing) {
        super(p);
        this.defaultDesignPricing = defaultDesignPricing;
    }

    public int getDefaultDesignPricing() {
        return defaultDesignPricing;
    }

    //Designer add Requirement Assignment
    public void addRequirementAssignment(Requirement requirement) {
        RequirementAssignmentDirectory.assignRequirementToDesginer(this, requirement);
    }
    
    //Designer remove Requirement Assignment
    public void removeRequirementAssignment(Requirement requirement) {
        RequirementAssignmentDirectory.removeRequirementFromDesigner(this, requirement);
    }

    @Override
    public String getRole() {
        return "Designer";
    }
    
//    public DesignerAssignmentRoad getDesignerAssignmentRoadbyName(String desingerName) {
//        return this.getDesignerAssignmentRoadbyName(desingerName);
//    }
    
//    public DesignerAssignmentRoad newDesignerAssignmentRoad(String s) {
//        return this.newDesignerAssignmentRoad(s);
//    }
//    
//    public DesignerAssignmentRoad newDesignerAssignmentRoad() {
//        return this.newDesignerAssignmentRoad();
//    }
}
