/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Production;

import model.Production.ProductionMode;
import javax.swing.ImageIcon;
import model.BrandCompany.Order;
import model.Business.MaterialOrder;



/**
 *
 * @author administratorzi
 */
public class ProductionOrder {
    private Order order; //linked to Order Class
    private ProductionMode productionMode;
    private String productionOrderStatus = "waiting placed"; //(1.waiting placed  )2.waiting delivery 3.delivered
    private MaterialOrder materialOrder;
    //private ImageIcon logoImage;

    public ProductionOrder(Order order, ProductionMode productionMode, MaterialOrder materialOrder) {
        this.order = order;
        this.productionMode = productionMode;
        this.materialOrder = materialOrder;
    }
    
    public ImageIcon getLogoImage() {
        return order.getImageIcon();
    }
    
    public int getQuantity(){
        return order.getQuantity();
    }
}
