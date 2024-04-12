/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Production;

import model.Production.ProductionMode;
import javax.swing.ImageIcon;
import model.Business.MaterialOrder;

/**
 *
 * @author administratorzi
 */
public class ProductionOrder {
    // Requirement 
    private int quantity;
    private ProductionMode productionMode;
    private int OrderId;
    private String productionOrderStatus = "waiting placed"; //waiting placed  waiting delivery   delivered
    private MaterialOrder materialOrder;
    private ImageIcon logoImage;
    
    
    
}
