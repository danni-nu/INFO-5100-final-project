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
    public ArrayList<RequirementsDirectory> RequirementsDirectory;

    public DesignOrganization(ArrayList<DesignerDirectory> DesignerDirectory, ArrayList<RequirementsDirectory> RequirementsDirectory) {
        this.DesignerDirectory = DesignerDirectory;
        this.RequirementsDirectory = RequirementsDirectory;
    }

    public ArrayList<DesignerDirectory> getDesignerDirectory() {
        return DesignerDirectory;
    }

    public void setDesignerDirectory(ArrayList<DesignerDirectory> DesignerDirectory) {
        this.DesignerDirectory = DesignerDirectory;
    }

    public ArrayList<RequirementsDirectory> getRequirementsDirectory() {
        return RequirementsDirectory;
    }

    public void setRequirementsDirectory(ArrayList<RequirementsDirectory> RequirementsDirectory) {
        this.RequirementsDirectory = RequirementsDirectory;
    }
    
    
    
}
