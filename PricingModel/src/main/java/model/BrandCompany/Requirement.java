/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.BrandCompany;
import java.util.ArrayList;
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
    private String requirementstatus;
    private static int count=0;
    private boolean status=false;
    private String requirementFeedback;//feedback of requirment
    ArrayList<Order> requirementOrderList;

    public Requirement(RawMaterial rowMaterial, DesignerProfile designerProfile, ProductionMode productionType, PlannerProfile plannerProfile,Style style,Color c) {
        this.requirementstatus= "unfinished";
        count++;
        this.RequirementID=String.valueOf(count);
        this.rowMaterial = rowMaterial;
        this.designerProfile = designerProfile;
        this.productionMode = productionType;
        this.plannerProfile=plannerProfile;
        this.style=style;
        this.color=c;
        this.status=false;
        this.requirementOrderList=new ArrayList<>();
        this.requirementFeedback = "No feed back yet";
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    
    public String getRequirementstatus() {
        if (this.getRequirementAssignment()==null){
            return "waiting Assignment";
        }
        if(this.getRequirementAssignment()!=null&&this.getRequirementAssignment().getRequirementSolution()==null){
            return "waiting Designing";
        }
        if(this.getRequirementAssignment()!=null&&this.getRequirementAssignment().getRequirementSolution()!=null&&this.isStatus()==false){
            return "Finished, waiting reviewing";
        }
        if(this.getRequirementAssignment()!=null&&this.getRequirementAssignment().getRequirementSolution()!=null&&this.isStatus()==true){
            return "Approved,waiting place order!";
        }
        return null;
    }

    public ArrayList<Order> getRequirementOrderList() {
        return requirementOrderList;
    }

    public void setRequirementOrderList(ArrayList<Order> requirementOrderList) {
        this.requirementOrderList = requirementOrderList;
    }

    public void setRequirementstatus(String requirementstatus) {
        this.requirementstatus = requirementstatus;
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
    
    public void setOrderToAssignment(Order order){
        requirementOrderList.add(order);
    }

    public String getRequirementFeedback() {
        return requirementFeedback;
    }

    public void setRequirementFeedback(String requirementFeedback) {
        this.requirementFeedback = requirementFeedback;
    }
    
    
    
}
