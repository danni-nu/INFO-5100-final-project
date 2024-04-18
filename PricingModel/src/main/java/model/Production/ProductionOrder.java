/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Production;

import model.Production.ProductionMode;
import javax.swing.ImageIcon;
import model.BrandCompany.Order;
import model.RawMaterialEnterprise.RawMaterialOrder;



/**
 *
 * @author administratorzi
 */
public class ProductionOrder {
    private Order order; //linked to Order Class
    private ProductionMode productionMode;
    private String productionOrderStatus = "waiting placed"; //(1.waiting placed  )2.waiting delivery 3.delivered
    private RawMaterialOrder materialOrder;
    //private ImageIcon logoImage;

    public ProductionOrder(Order order) {
        this.order = order;

    }
    public ProductionOrder(Order order, ProductionMode productionMode, RawMaterialOrder materialOrder) {
        this.order = order;
        this.productionMode = productionMode;
        this.materialOrder = materialOrder;
    }
    
    public Order getOrder(){    
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public ProductionMode getProductionMode() {
        return productionMode;
    }

    public void setProductionMode(ProductionMode productionMode) {
        this.productionMode = productionMode;
    }

    public String getProductionOrderStatus() {
        return productionOrderStatus;
    }

    public void setProductionOrderStatus(String productionOrderStatus) {
        this.productionOrderStatus = productionOrderStatus;
    }

    public RawMaterialOrder getMaterialOrder() {
        return materialOrder;
    }

//    public ImageIcon getLogoImage() {
//        return order.getImageIcon();
//    }
    public void setMaterialOrder(RawMaterialOrder materialOrder) {
        this.materialOrder = materialOrder;
    }

    public int getQuantity() {
        return order.getQuantity();
    }
}
