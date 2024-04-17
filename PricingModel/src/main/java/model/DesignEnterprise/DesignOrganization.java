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
    public DesignerDirectory DesignerDirectory;
    public RequirementAssignmentDirectory RequirementAssignmentDirectory;

    public DesignOrganization() {
        this.DesignerDirectory=new DesignerDirectory();
        this.RequirementAssignmentDirectory=new RequirementAssignmentDirectory();
    }
    
    public DesignerDirectory getDesignerDirectory() {
        return DesignerDirectory;
    }

    public void setDesignerDirectory(DesignerDirectory DesignerDirectory) {
        this.DesignerDirectory = DesignerDirectory;
    }

    public RequirementAssignmentDirectory getRequirementAssignmentDirectory() {
        return RequirementAssignmentDirectory;
    }

    public void setRequirementAssignmentDirectory(RequirementAssignmentDirectory RequirementAssignmentDirectory) {
        this.RequirementAssignmentDirectory = RequirementAssignmentDirectory;
    }

 

    
    
}
