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
public class RequirementAssignment {
    private DesignerProfile designerProfile;
    private Requirement requirement;
    private ArrayList<RequirementAssignment> requirementAssignmentsDirectory;
    private RequirementSolution requirementSolution;
    //+Deadline: string 
    //+Evaluation:String 直接从requirementAssignmentsDirectory拿？

    public RequirementAssignment(DesignerProfile designerProfile, Requirement requirement, ArrayList<RequirementAssignment> requirementAssignmentsDirectory, RequirementSolution requirementSolution) {
        this.designerProfile = designerProfile;
        this.requirement = requirement;
        this.requirementAssignmentsDirectory = requirementAssignmentsDirectory;
        this.requirementSolution = requirementSolution;
        requirementAssignmentsDirectory.add(this);
    }
    

    public DesignerProfile getDesignerProfile() {
        return designerProfile;
    }

    public Requirement getRequirement() {
        return requirement;
    }

    public void setDesignerProfile(DesignerProfile designerProfile) {
        this.designerProfile = designerProfile;
    }

    public void setRequirement(Requirement requirement) {
        this.requirement = requirement;
    }
    
}
