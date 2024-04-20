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
    //private ProductionOrder productionOrder;
    private RawMaterial rawMaterial;
    private String deliverStatus="unplaced order"; //Material Order Not Placed/Material Order in Production/Material Order Delivered
    private boolean status=false;
    private int materialPrice;
    private String deliveryDate;
    private String deliveryNumber;
    private String deliveryaddress;
    private static int count= 100;
    String productionEnterpriseWarehouseAddress;
    

    public RawMaterialOrder(RawMaterial rawMaterial, String deliverStatus, int materialPrice, String deliveryDate, String deliveryNumber) {
        count++;
        this.rawMaterialOrderID=String.valueOf(count);
        this.rawMaterial = rawMaterial;
        this.materialPrice = materialPrice;
        this.deliveryDate = "N/A";
        this.deliveryNumber = "N/A";
        this.deliveryaddress = "N/A";
        this.deliverStatus="Not delivered";
    }
    
     public RawMaterialOrder(Order o) {
        count++;
        this.rawMaterialOrderID=String.valueOf(count);
        this.order=o;
        this.deliverStatus = "Not delivered";
        this.deliveryDate ="N/A";
        this.deliveryNumber = "N/A";
        this.deliveryaddress = "N/A";
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
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

    @Override
    public String toString(){
        return rawMaterialOrderID;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public void setDeliveryNumber(String deliveryNumber) {
        this.deliveryNumber = deliveryNumber;
    }

    public String getProductionEnterpriseWarehouseAddress() {
        return productionEnterpriseWarehouseAddress;
    }

    public void setProductionEnterpriseWarehouseAddress(String productionEnterpriseWarehouseAddress) {
        this.productionEnterpriseWarehouseAddress = productionEnterpriseWarehouseAddress;
    }

    public String getRawMaterialOrderID() {
        return rawMaterialOrderID;
    }

    public String getDeliveryaddress() {
        return deliveryaddress;
    }

    public static int getCount() {
        return count;
    }
    
    
}
