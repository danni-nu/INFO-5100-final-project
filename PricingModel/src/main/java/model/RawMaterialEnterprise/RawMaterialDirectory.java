/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.RawMaterialEnterprise;

import java.util.ArrayList;
import model.DesignEnterprise.DesignerDirectory;

/**
 *
 * @author tianlyu
 */
public class RawMaterialDirectory {
    
    public ArrayList<RawMaterial> RawMaterialDirectory;

    public RawMaterialDirectory() {
        this.RawMaterialDirectory = new ArrayList<>();
    }

    public ArrayList<RawMaterial> getRawMaterialDirectory() {
        return RawMaterialDirectory;
    }

    public void setRawMaterialDirectory(ArrayList<RawMaterial> RawMaterialDirectory) {
        this.RawMaterialDirectory = RawMaterialDirectory;
    }
    
    public void addNewRawMaterial(RawMaterial rawMaterial) {
        RawMaterialDirectory.add(rawMaterial);
    }
    
    public void removeRawMaterial(RawMaterial rawMaterial) {
        RawMaterialDirectory.remove(rawMaterial);
    }
    
    public void addNewRawMaterial(String materialName, int price){
        RawMaterial rawMaterial =new RawMaterial(materialName,price);
        RawMaterialDirectory.add(rawMaterial);
    }
}
