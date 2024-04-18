/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DesignEnterprise;

import model.BrandCompany.Requirement;
import java.util.ArrayList;

/**
 *
 * @author tianlyu
 */
public class RequirementAssignment {
    private DesignerProfile designerProfile;
    private Requirement requirement;
    private ArrayList<RequirementAssignment> requirementAssignmentsDirectory;
    private DesignerAssignmentRoad DesignerAssignmentRoad;
    private RequirementSolution requirementSolution;
    //+Deadline: string 
    //+Evaluation:String 直接从requirementAssignmentsDirectory拿？


    
    public RequirementAssignment(DesignerAssignmentRoad da, Requirement r) {
        requirement = r;
        DesignerAssignmentRoad = da;
        
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

    public ArrayList<RequirementAssignment> getRequirementAssignmentsDirectory() {
        return requirementAssignmentsDirectory;
    }

    public void setRequirementAssignmentsDirectory(ArrayList<RequirementAssignment> requirementAssignmentsDirectory) {
        this.requirementAssignmentsDirectory = requirementAssignmentsDirectory;
    }


    public RequirementSolution getRequirementSolution() {
        return requirementSolution;
    }

    public void setRequirementSolution(RequirementSolution requirementSolution) {
        this.requirementSolution = requirementSolution;
    }

    
    
}
