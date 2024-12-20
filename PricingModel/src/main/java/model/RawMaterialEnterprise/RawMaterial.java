 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.RawMaterialEnterprise;

import java.util.ArrayList;


/**
 *
 * @author tianlyu
 */
public class RawMaterial {
    
    private String materialName;
    private String description;
    private int price;
//    private int quantity;
//
//    static {
//        //原材料类型
//        materialTypes.add("Cotton");
//        materialTypes.add("Linen");
//        materialTypes.add("Denim");
//        materialTypes.add("Wool");
//    }

    public RawMaterial(String materialName, String description, int price) {
        this.materialName = materialName;
        this.description = description;
        this.price = price;
        //this.quantity = quantity;
    }

    public RawMaterial(String materialName, int price) {
        this.materialName = materialName;
        this.price = price;
    }

    public String getMaterialName() {
        return materialName;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

//    public int getQuantity() {
//        return quantity;
//    }
//
//    public static void addMaterialType(String type) {
//        materialTypes.add(type);
//    }
    @Override
    public String toString(){
        return materialName;
    }
}
