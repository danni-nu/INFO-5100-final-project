/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Production;

import java.util.ArrayList;
import model.BrandCompany.Order;

/**
 *
 * @author administratorzi
 */
public class ProductionOrderDirectory {
     private ArrayList<ProductionOrder> productionOrderList;
     
     public ProductionOrderDirectory() {
            productionOrderList = new ArrayList<>();
     }

    public ArrayList<ProductionOrder> getProductionOrderList() {
        return productionOrderList;
    }

    public void setProductionOrderList(ArrayList<ProductionOrder> productionOrderList) {
        this.productionOrderList = productionOrderList;
    }
     
    
    public ProductionOrder addNewOrder(Order o){
        ProductionOrder productionOrder=new ProductionOrder(o);
        productionOrderList.add(productionOrder);
        return productionOrder;
    }
     
}
