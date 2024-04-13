/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DesignEnterprise;

import java.util.ArrayList;

/**
 *
 * @author tianlyu
 */
public class DesignerProfile {
    private String profileClass;
    private double defaultDesignPricing;
    private ArrayList<RequirementAssignment> requirementAssignmentList;

    public DesignerProfile(String profileClass, double defaultDesignPricing) {
        this.profileClass = profileClass;
        this.defaultDesignPricing = defaultDesignPricing;
        requirementAssignmentList = new ArrayList<>();
    }

    public String getProfileClass() {
        return profileClass;
    }

    public double getDefaultDesignPricing() {
        return defaultDesignPricing;
    }

    public void addRequirementAssignment(RequirementAssignment assignment) {
        requirementAssignmentList.add(assignment);
    }
    
    public void removeRequirementAssignment(RequirementAssignment assignment) {
        requirementAssignmentList.remove(assignment);
    }
}
