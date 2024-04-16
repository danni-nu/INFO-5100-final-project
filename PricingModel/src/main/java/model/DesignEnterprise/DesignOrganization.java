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
public class DesignOrganization {
    public ArrayList<DesignerDirectory> DesignerDirectory;
    public ArrayList<RequirementAssignmentDirectory> RequirementAssignmentDirectory;

    public DesignOrganization(ArrayList<DesignerDirectory> DesignerDirectory, ArrayList<RequirementAssignmentDirectory> RequirementsDirectory) {
        this.DesignerDirectory = DesignerDirectory;
        this.RequirementAssignmentDirectory = RequirementsDirectory;
    } 
    public ArrayList<DesignerDirectory> getDesignerDirectory() {
        return DesignerDirectory;
    }

    public void setDesignerDirectory(ArrayList<DesignerDirectory> DesignerDirectory) {
        this.DesignerDirectory = DesignerDirectory;
    }

    public ArrayList<RequirementAssignmentDirectory> getRequirementAssignmentDirectory() {
        return RequirementAssignmentDirectory;
    }

    public void setRequirementAssignmentDirectory(ArrayList<RequirementAssignmentDirectory> RequirementAssignmentDirectory) {
        this.RequirementAssignmentDirectory = RequirementAssignmentDirectory;
    }

    
    
}
