/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.RawMaterialEnterprise;

import java.util.ArrayList;

/**
 *
 * @author qiaohui
 */
public class RawMaterialOrderDirectory {
    ArrayList<RawMaterialOrder> rawMaterialOrderDirectory;

    public RawMaterialOrderDirectory() {
        rawMaterialOrderDirectory=new ArrayList<>();
    }

    public ArrayList<RawMaterialOrder> getRawMaterialOrderDirectory() {
        return rawMaterialOrderDirectory;
    }

    public void setRawMaterialOrderDirectory(ArrayList<RawMaterialOrder> rawMaterialOrderDirectory) {
        this.rawMaterialOrderDirectory = rawMaterialOrderDirectory;
    }
   
}
