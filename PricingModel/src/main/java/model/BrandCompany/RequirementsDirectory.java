/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.BrandCompany;

import java.util.ArrayList;
import model.DesignEnterprise.RequirementAssignment;

/**
 *
 * @author tianlyu
 */
public class RequirementsDirectory {
    private ArrayList<Requirement> requirementsDirectory;

    public RequirementsDirectory() {
        this.requirementsDirectory = new ArrayList<>();
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
    
}
