/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.BrandCompany;
import model.BrandCompany.PlannerProfile;
import model.DesignEnterprise.Color;
import model.DesignEnterprise.DesignerProfile;
import model.DesignEnterprise.RequirementAssignment;
import model.DesignEnterprise.RequirementSolution;
import model.DesignEnterprise.Style;
import model.Production.ProductionMode;
import model.RawMaterialEnterprise.RawMaterial;

/**
 *
 * @author tianlyu
 */
public class Requirement {
    private String RequirementID;
    private RawMaterial rowMaterial;
    private DesignerProfile designerProfile;
    private ProductionMode productionMode;
    private PlannerProfile plannerProfile;
    private RequirementAssignment requirementAssignment;
    private Color color;
    private Style style;
    private String deadline;
    private String evaluation;
    private String status="waiting designing";// //designing, waitng review, waiting approcal
    private static int count=0;

//    public Requirement(RawMaterial rowMaterial, DesignerProfile designerProfile, ProductionMode productionType, PlannerProfile plannerProfile, Color color, Style style, String deadline, String evaluation) {
//        count++;
//        this.rowMaterial = rowMaterial;
//        this.designerProfile = designerProfile;
//        this.productionMode = productionMode;
//        this.plannerProfile=plannerProfile;
//        this.color = color;
//        this.style = style;
//        this.deadline = deadline;
//        this.evaluation = evaluation;
//    }
    public Requirement(RawMaterial rowMaterial, DesignerProfile designerProfile, ProductionMode productionType, PlannerProfile plannerProfile,Style style) {
        count++;
        this.RequirementID=String.valueOf(count);
        this.rowMaterial = rowMaterial;
        this.designerProfile = designerProfile;
        this.productionMode = productionType;
        this.plannerProfile=plannerProfile;
        this.style=style;
    }

    public RequirementAssignment getRequirementAssignment() {
        return requirementAssignment;
    }

    public void setRequirementAssignment(RequirementAssignment requirementAssignment) {
        this.requirementAssignment = requirementAssignment;
    }

    public PlannerProfile getPlannerProfile() {
        return plannerProfile;
    }

    public void setPlannerProfile(PlannerProfile plannerProfile) {
        this.plannerProfile = plannerProfile;
    }
    

    public RawMaterial getRowMaterial() {
        return rowMaterial;
    }

    public void setRowMaterial(RawMaterial rowMaterial) {
        this.rowMaterial = rowMaterial;
    }

    public DesignerProfile getDesignerProfile() {
        return designerProfile;
    }

    public void setDesignerProfile(DesignerProfile designerProfile) {
        this.designerProfile = designerProfile;
    }

    public ProductionMode getProductionMode() {
        return productionMode;
    }

    public void setProductionMode(ProductionMode productionMode) {
        this.productionMode = productionMode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }
    
    @Override
    public String toString(){
        return RequirementID;
    }

    public String getRowMaterialName() {
        return rowMaterial.getMaterialName();
    }

    public String getProductionModeName() {
        return productionMode.getModeName();
    }

    public String getRequirementID() {
        return RequirementID;
    }

    public static int getCount() {
        return count;
    }
    
//    public RequirementAssignment newRequirementAssignment(DesignerAssignmentRoad dar) {
//
//        RequirementAssignment requirementAssignment= new RequirementAssignment(dar, this); //links seatassignment to seat
//       
//        return requirementAssignment;
//    }
    
    
    
}
