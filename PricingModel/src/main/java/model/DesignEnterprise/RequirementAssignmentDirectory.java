/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DesignEnterprise;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import model.BrandCompany.Requirement;

/**
 *
 * @author qiaohui
 */
public class RequirementAssignmentDirectory {
    
    //use DesignerProfile to find Requirement
    private static HashMap<DesignerProfile, List<Requirement>> DesignerToRequirement = new HashMap<>();
    
    //use Requirement to find RequirementAssignment
    private static HashMap<Requirement, RequirementAssignment> RequirementToRequirementAssignment = new HashMap<>();

    public RequirementAssignmentDirectory() {
    }
    
    //Add Requirement To Desginer
    public static void assignRequirementToDesginer(DesignerProfile designerProfile,Requirement requirement){
        DesignerToRequirement.putIfAbsent(designerProfile, new ArrayList<>());
        DesignerToRequirement.get(designerProfile).add(requirement);
        
        RequirementAssignment requirementAssignment = new RequirementAssignment(designerProfile, requirement);
        RequirementToRequirementAssignment.putIfAbsent(requirement, requirementAssignment);
    }
    
    //remove Requirement FromDesigner
    public static void removeRequirementFromDesigner(DesignerProfile designerProfile,Requirement requirement){
        DesignerToRequirement.get(designerProfile).remove(requirement);
        RequirementToRequirementAssignment.remove(requirement);
    }
    
}
