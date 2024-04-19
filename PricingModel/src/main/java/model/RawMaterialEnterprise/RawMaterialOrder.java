/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.RawMaterialEnterprise;

import java.util.Date;
import model.BrandCompany.Order;
import model.Production.ProductionOrder;

/**
 *
 * @author tianlyu
 */
public class RawMaterialOrder {
    private String rawMaterialOrderID;
    private Order order;
    private ProductionOrder productionOrder;
    private RawMaterial rawMaterial;
    private String deliverStatus="unplaced order"; //Material Order Not Placed/Material Order in Production/Material Order Delivered
    private boolean status=false;
    private int materialPrice;
    private String deliveryDate;
    private String deliveryNumber;
    private static int count;
    

    public RawMaterialOrder(RawMaterial rawMaterial, String deliverStatus, int materialPrice, Date deliveryDate, String deliveryNumber) {
        count++;
        this.rawMaterial = rawMaterial;
        this.deliverStatus = deliverStatus;
        this.materialPrice = materialPrice;
        this.deliveryDate = deliveryDate;
        this.deliveryNumber = deliveryNumber;
        this.deliverStatus="unplaced order";
        this.status=false;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public ProductionOrder getProductionOrder() {
        return productionOrder;
    }

    public void setProductionOrder(ProductionOrder productionOrder) {
        this.productionOrder = productionOrder;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    

    public RawMaterialOrder(Order o, ProductionOrder po) {
        this.order=o;
        this.productionOrder=po;

    //public RawMaterialOrder(Order o) {
        //this.o=o;
        //this.po=po;
    //}
    
     public RawMaterialOrder(Order o) {
        this.o=o;
        this.deliverStatus = "Not delivered";
        this.deliveryDate = "N/A";
        this.deliveryNumber = "N/A";
        this.deliverStatus="false";
    }
    

    public RawMaterial getRawMaterial() {
        return rawMaterial;
    }

    public String getDeliverStatus() {
        return deliverStatus;
    }

    public void setDeliverStatus(String deliverStatus) {
        this.deliverStatus = deliverStatus;
    }

    public int getMaterialPrice() {
        return materialPrice;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public String getDeliveryNumber() {
        return deliveryNumber;
    }

    
}
