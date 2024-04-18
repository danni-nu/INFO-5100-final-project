/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DesignEnterprise;

import java.util.ArrayList;

/**
 *
 * @author qiaohui
 */
public class RequirementAssignmentDirectory {
    private ArrayList<RequirementAssignment> requirementAssignmentsDirectory;

    public RequirementAssignmentDirectory() {
        this.requirementAssignmentsDirectory = new ArrayList<>();
    }
    
    public ArrayList<RequirementAssignment> getRequirementAssignmentsDirectory() {
        return requirementAssignmentsDirectory;
    }

    public void setRequirementAssignmentsDirectory(ArrayList<RequirementAssignment> requirementAssignmentsDirectory) {
        this.requirementAssignmentsDirectory = requirementAssignmentsDirectory;
    }
    
}
