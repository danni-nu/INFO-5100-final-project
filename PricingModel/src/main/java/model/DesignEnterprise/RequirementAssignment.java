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
    private boolean status = false;
//    private DesignerAssignmentRoad DesignerAssignmentRoad;
    private List<RequirementSolution> requirementSolutionlist; //each designerProfile have one
    //+Deadline: string 
    //+Evaluation:String 直接从requirementAssignmentsDirectory拿？


    
    public RequirementAssignment(DesignerProfile dp, Requirement r) {
        requirement = r;
        designerProfile = dp;
        requirementSolutionlist = new ArrayList<>();
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


    public List<RequirementSolution> getRequirementSolution() {
        return requirementSolutionlist;
    }

    public void addRequirementSolution(RequirementSolution requirementSolution){
        requirementSolutionlist.add(requirementSolution);
        status = true;//update solution change status to true
    }
    
    
}
