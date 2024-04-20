/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DesignEnterprise;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author tianlyu
 */
public class RequirementSolution {
    private String solutionName;
    private String deadline;
    private String evaluation;
    
    private final JFileChooser fileChooser = new JFileChooser();
    ImageIcon productImage;    
   

    public RequirementSolution(ImageIcon productImage) {
        this.productImage = productImage;
    }

    public RequirementSolution() {
    }

    public String getSolutionName() {
        return solutionName;
    }


    public ImageIcon getProductImage() {
        return productImage;
    }

    public void setProductImage(ImageIcon productImage) {
        this.productImage = productImage;
    }

    
    
}
