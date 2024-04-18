/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.BrandCompany;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;
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
    RawMaterialOrder rawMaterialOrder;
    String Orderstatus="false";//waiting producing, received order;
    String materialStatus;
    int quantity;
    int OrderPrice;

    public Order(Requirement requirement,int quantity, String materialStatus) {
        this.requirement=requirement;
        this.Orderstatus = "false";
        this.rawMaterial=requirement.getRowMaterial();
        this.productionMode=requirement.getProductionMode();
        this.quantity = quantity;
        
        //generate random date from 2 years before to now
        LocalDate date = null;
        LocalDate now = LocalDate.now();
        LocalDate twoYearsAgo = now.minusYears(2);
        if (materialStatus == "material delivered"){
            long day = ThreadLocalRandom.current().nextLong(twoYearsAgo.toEpochDay(), now.toEpochDay() + 1);
            date = LocalDate.ofEpochDay(day);
        }
        rawMaterialOrder = new RawMaterialOrder(this,materialStatus, date);
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

    public RawMaterialOrder getRawMaterialOrder() {
        return rawMaterialOrder;
    }
    
    
}
