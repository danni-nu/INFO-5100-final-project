/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.BrandCompany;

import java.util.ArrayList;
import model.DesignEnterprise.DesignerProfile;
import model.DesignEnterprise.RequirementAssignment;
import model.DesignEnterprise.Style;
import model.Production.ProductionMode;
import model.RawMaterialEnterprise.RawMaterial;

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
    
    public Requirement addANewRrequirement(RawMaterial r, DesignerProfile d, ProductionMode p, PlannerProfile pp,Style style){
        Requirement newrequirement=new Requirement(r,d,p,pp,style);
        requirementsDirectory.add(newrequirement);
        return newrequirement;
    }
    public void addNewRrequirement(RawMaterial r, DesignerProfile d, ProductionMode p, PlannerProfile pp,Style style){
        Requirement newrequirement=new Requirement(r,d,p,pp,style);
        requirementsDirectory.add(newrequirement);
    }
    
}
