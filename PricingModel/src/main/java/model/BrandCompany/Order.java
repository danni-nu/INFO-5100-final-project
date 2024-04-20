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
    private String orederID;
    private Requirement requirement;
    private RequirementSolution requirementSolution;
    private RawMaterial rawMaterial;
    private ProductionMode productionMode;
    private ProductionOrder productOrder;
    private RawMaterialOrder rawMarerialOrder;
    private String Orderstatus="wait raw material";//waiting producing, received order;
    private boolean status=false;
    private int quantity;
    private int OrderPrice;
    private static int count=0;
    private String orderMessage;
    

    public Order(Requirement requirement,int quantity) {
        count++;
        this.orederID=String.valueOf(count);
        this.requirement=requirement;
        requirement.addOrderToRequirement(this);
        this.Orderstatus = "false";
        this.status=false;
        this.rawMaterial=requirement.getRowMaterial();
        this.productionMode=requirement.getProductionMode();
        this.quantity = quantity;
        this.rawMarerialOrder= new RawMaterialOrder(this);
        this.productOrder=new ProductionOrder(this, rawMarerialOrder);
        
        
    }

    public String getOrederID() {
        return orederID;
    }

    public void setOrederID(String orederID) {
        this.orederID = orederID;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Order.count = count;
       
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
      if(this.status==false&&this.productOrder.getProductionOrderStatus()=="waiting placed"&&this.rawMarerialOrder.getDeliverStatus()=="Not delivered"){
          return "waiting raw material";
      }
      if(this.status==false&&this.productOrder.getProductionOrderStatus()=="waiting placed"==false&&this.rawMarerialOrder.getDeliverStatus()=="delivered"){
          return "waiting producing";
      }
      if(this.status==false&&this.productOrder.getProductionOrderStatus()=="placed"&&this.rawMarerialOrder.getDeliverStatus()=="delivered"){
          return "waiting delivering";
      }else{
          return "delivered";
      }
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

    public String getOrderMessage() {
        return orderMessage;
    }

    public void setOrderMessage(String orderMessage) {
        this.orderMessage = orderMessage;
    }
    
    
    @Override
    public String toString(){
        return orederID;
    }
}
