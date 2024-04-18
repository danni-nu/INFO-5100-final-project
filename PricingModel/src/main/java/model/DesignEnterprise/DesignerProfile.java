/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DesignEnterprise;

import java.util.ArrayList;
import model.Personnel.Person;
import model.Personnel.Profile;

/**
 *
 * @author tianlyu
 */
public class DesignerProfile extends Profile {
    int defaultDesignPricing;
    String deginerTitle;
    ArrayList<RequirementAssignment> requirementAssignmentList;

    public DesignerProfile(Person p, int defaultDesignPricing) {
        super(p);
        this.defaultDesignPricing = defaultDesignPricing;
        requirementAssignmentList = new ArrayList<>();
    }

    public int getDefaultDesignPricing() {
        return defaultDesignPricing;
    }

    public void addRequirementAssignment(RequirementAssignment assignment) {
        requirementAssignmentList.add(assignment);
    }
    
    public void removeRequirementAssignment(RequirementAssignment assignment) {
        requirementAssignmentList.remove(assignment);
    }

    @Override
    public String getRole() {
        return "Designer";
    }
    
    public DesignerAssignmentRoad newDesignerAssignmentRoad(String s) {
        return this.newDesignerAssignmentRoad(s);
    }
    
    public DesignerAssignmentRoad newDesignerAssignmentRoad() {
        return this.newDesignerAssignmentRoad();
    }
}
