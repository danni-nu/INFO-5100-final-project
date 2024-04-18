/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.RawMaterialEnterprise;

import java.time.LocalDate;
import java.util.Date;
import model.BrandCompany.Order;
import model.Production.ProductionOrder;

/**
 *
 * @author tianlyu
 */
public class RawMaterialOrder {
    Order o;
    ProductionOrder po;
    private RawMaterial rawMaterial;
    private String deliverStatus; //Material Order Not Placed/Material Order in Production/Material Order Delivered
    private int materialPrice;
    private LocalDate deliveryDate;
    private String deliveryNumber;

    //public RawMaterialOrder(RawMaterial rawMaterial, String deliverStatus, int materialPrice, Date deliveryDate, String deliveryNumber) {
        //this.rawMaterial = rawMaterial;
        //this.deliverStatus = deliverStatus;
        //this.materialPrice = materialPrice;
        //this.deliveryDate = deliveryDate;
        //this.deliveryNumber = deliveryNumber;
    //}
    
     //public RawMaterialOrder(Order o, ProductionOrder po,RawMaterial rawMaterial, String deliverStatus, int materialPrice, Date deliveryDate, String deliveryNumber) {
        //this.rawMaterial = rawMaterial;
        //this.deliverStatus = deliverStatus;
        //this.materialPrice = materialPrice;
        //this.deliveryDate = deliveryDate;
        //this.deliveryNumber = deliveryNumber;
        //this.o=o;
        //this.po=po;
    //}
    //}
    
    public RawMaterialOrder(Order o, String deliverStatus, LocalDate deliveryDate) {
        this.o=o;
        this.deliverStatus = deliverStatus;
        this.deliveryDate = deliveryDate;
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


    public String getDeliveryNumber() {
        return deliveryNumber;
    }

    
}
