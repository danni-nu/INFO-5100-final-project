/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DesignEnterprise;

import java.util.ArrayList;
import model.BrandCompany.Requirement;

/**
 *
 * @author tianlyu
 */
public class DesignerAssignmentRoad {
    private DesignerProfile designerProfile;
    private ArrayList<RequirementAssignment> requirementAssignments;

    public DesignerAssignmentRoad(DesignerProfile designerProfile) {
        this.designerProfile = designerProfile;
        requirementAssignments = new ArrayList<>();//designerprofile to create the 
    }
    
    public RequirementAssignment newRequirementAssignment(Requirement r) {
        RequirementAssignment ra = r.newRequirementAssignment(this);
        requirementAssignments.add(ra);  //add RequirementAssignment to requirementAssignments
        return ra;
    }    
    
}
