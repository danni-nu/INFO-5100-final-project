/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DesignEnterprise;

import model.BrandCompany.Requirement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tianlyu
 */
public class RequirementAssignment {
    private DesignerProfile designerProfile;
    private Requirement requirement;
    private String status;//inistial Assigned not designed
    private RequirementSolution requirementSolution; //each designerProfile have one



    
    public RequirementAssignment(DesignerProfile dp, Requirement r) {
        requirement = r;
        designerProfile = dp;
        this.status = "Assigned Not finished";
    }

    public DesignerProfile getDesignerProfile() {
        return designerProfile;
    }

    public void setDesignerProfile(DesignerProfile designerProfile) {
        this.designerProfile = designerProfile;
    }

    public Requirement getRequirement() {
        return requirement;
    }

    public void setRequirement(Requirement requirement) {
        this.requirement = requirement;
    }


    public RequirementSolution getRequirementSolution() {
        return requirementSolution;
    }

    public void addRequirementSolution(RequirementSolution requirementSolution){
        this.requirementSolution = requirementSolution;
        this.status = "Finished design";//update solution Finished design
    }

    public String getStatus() {
        return status;
    }
    
    
}
