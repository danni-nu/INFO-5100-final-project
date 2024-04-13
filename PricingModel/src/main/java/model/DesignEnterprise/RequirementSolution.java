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
public class RequirementSolution {
    private String solutionName;
    private String deadline;
    private String evaluation;
    private ArrayList<String> uploadedImages; // 存储上传的图片路径
    
    public RequirementSolution() {
        
    }

    public RequirementSolution(String solutionName, String deadline, String evaluation) {
        this.solutionName = solutionName;
        this.deadline = deadline;
        this.evaluation = evaluation;
        this.uploadedImages = new ArrayList<>();
    }

    public String getSolutionName() {
        return solutionName;
    }

    public String getDeadline() {
        return deadline;
    }

    public String getEvaluation() {
        return evaluation;
    }

    public ArrayList<String> getUploadedImages() {
        return uploadedImages;
    }

    public void addImage(String imagePath) {
        uploadedImages.add(imagePath);
    }  
    
}
