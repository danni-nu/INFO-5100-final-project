/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DesignEnterprise;

/**
 *
 * @author tianlyu
 */
public class Requirement {
    private RowMaterial rowMaterial;
    private DesignerProfile designerProfile;
    private String productionType;
    private Color color;
    private Style style;
    private String deadline;
    private String evaluation;

    public Requirement(RowMaterial rowMaterial, DesignerProfile designerProfile, String productionType, Color color, Style style, String deadline, String evaluation) {
        this.rowMaterial = rowMaterial;
        this.designerProfile = designerProfile;
        this.productionType = productionType;
        this.color = color;
        this.style = style;
        this.deadline = deadline;
        this.evaluation = evaluation;
    }


    public RequirementSolution addRequirementSolution() {
        return new RequirementSolution();
    }
    
    public RequirementSolution addRequirementSolution(String solutionName, String deadline, String evaluation) {
        return new RequirementSolution(solutionName,deadline,evaluation);
    }

    public static Requirement createNewRequirement(RowMaterial rowMaterial, DesignerProfile designerProfile, String productionType, Color color, Style style, String deadline, String evaluation) {
        return new Requirement(rowMaterial,designerProfile,productionType,color,style,deadline,evaluation);
    }

    public RowMaterial getRowMaterial() {
        return rowMaterial;
    }

    public void setRowMaterial(RowMaterial rowMaterial) {
        this.rowMaterial = rowMaterial;
    }

    public DesignerProfile getDesignerProfile() {
        return designerProfile;
    }

    public void setDesignerProfile(DesignerProfile designerProfile) {
        this.designerProfile = designerProfile;
    }

    public String getProductionType() {
        return productionType;
    }

    public void setProductionType(String productionType) {
        this.productionType = productionType;
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
    
    
    
}
