/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.BrandCompany;

import javax.swing.ImageIcon;
import model.DesignEnterprise.RequirementSolution;
import model.Production.ProductionMode;
import model.Production.ProductionOrder;
import model.RawMaterialEnterprise.RawMaterial;
import model.RawMaterialEnterprise.RawMaterialOrder;

/**
 *
 * @author qiaohui
 */
public class Order {
    Requirement requirement;
    RequirementSolution requirementSolution;
    RawMaterial rawMaterial;
    ProductionMode productionMode;
    ProductionOrder productOrder;
    RawMaterialOrder rawMarerialOrder;
    String Orderstatus="unplace";//waiting producing, received order;
    int quantity;
    int OrderPrice;

    public Order(String Orderstatus, int quantity, int OrderPrice) {
        this.Orderstatus = Orderstatus;
        this.quantity = quantity;
        this.OrderPrice = OrderPrice;
    }

    public Requirement getRequirement() {
        return requirement;
    }

    public void setRequirement(Requirement requirement) {
        this.requirement = requirement;
    }

    public RawMaterial getRawMaterial() {
        return rawMaterial;
    }

    public void setRawMaterial(RawMaterial rawMaterial) {
        this.rawMaterial = rawMaterial;
    }

    public ProductionMode getProductionMode() {
        return productionMode;
    }

    public void setProductionMode(ProductionMode productionMode) {
        this.productionMode = productionMode;
    }

    public ProductionOrder getProductOrder() {
        return productOrder;
    }

    public void setProductOrder(ProductionOrder productOrder) {
        this.productOrder = productOrder;
    }

    public RawMaterialOrder getRawMarerialOrder() {
        return rawMarerialOrder;
    }

    public void setRawMarerialOrder(RawMaterialOrder rawMarerialOrder) {
        this.rawMarerialOrder = rawMarerialOrder;
    }

    public String getOrderstatus() {
        return Orderstatus;
    }

    public void setOrderstatus(String Orderstatus) {
        this.Orderstatus = Orderstatus;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getOrderPrice() {
        return OrderPrice;
    }

    public void setOrderPrice(int OrderPrice) {
        this.OrderPrice = OrderPrice;
    }    
}
