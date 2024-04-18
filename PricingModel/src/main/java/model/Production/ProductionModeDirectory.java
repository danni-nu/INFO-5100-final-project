/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Production;

import java.util.ArrayList;

/**
 *
 * @author administratorzi
 */
public class ProductionModeDirectory {
    ArrayList<ProductionMode> productionModeList;

    public ProductionModeDirectory() {
        productionModeList = new ArrayList<>();
    }

    public ArrayList<ProductionMode> getProductionModeList() {
        return productionModeList;
    }

    public void setProductionModeList(ArrayList<ProductionMode> productionModeList) {
        this.productionModeList = productionModeList;
    }
    
    public void addNewProductionMode(String modeName, int price){
        ProductionMode productionMode=new ProductionMode(modeName,price);
        productionModeList.add(productionMode);
    }
    
    public ProductionMode addANewProductionMode(String modeName, int price){
        ProductionMode productionMode=new ProductionMode(modeName,price);
        productionModeList.add(productionMode);
        return productionMode;
    }
}
