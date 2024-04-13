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
public class RequirementsDirectory {
    private ArrayList<Requirement> requirementsDirectory;
    private ArrayList<RequirementAssignment> requirementAssignmentsDirectory;

    public RequirementsDirectory(ArrayList<Requirement> requirementsDirectory, ArrayList<RequirementAssignment> requirementAssignments) {
        this.requirementsDirectory = requirementsDirectory;
        this.requirementAssignmentsDirectory = requirementAssignments;
    }

  
    public void addRequirementAssignment(RequirementAssignment assignment) {
        requirementAssignmentsDirectory.add(assignment);
    }
    
    public void removeRequirementAssignment(RequirementAssignment assignment) {
        requirementAssignmentsDirectory.remove(assignment);
    }
    
    public void addRequirement(Requirement requirement) {
        requirementsDirectory.add(requirement);
    }
    
    public void removeRequirement(Requirement requirement) {
        requirementsDirectory.remove(requirement);
    }
    

    public ArrayList<Requirement> getRequirementsDirectory() {
        return requirementsDirectory;
    }

    public void setRequirementsDirectory(ArrayList<Requirement> requirementsDirectory) {
        this.requirementsDirectory = requirementsDirectory;
    }

    public ArrayList<RequirementAssignment> getRequirementAssignments() {
        return requirementAssignmentsDirectory;
    }

   
    
    
}
