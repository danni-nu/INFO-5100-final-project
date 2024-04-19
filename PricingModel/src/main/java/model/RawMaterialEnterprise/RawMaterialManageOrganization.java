/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.RawMaterialEnterprise;

import model.Personnel.Person;
import model.Personnel.Profile;

/**
 *
 * @author qiaohui
 */
public class RawMaterialManageOrganization {
    //RawMaterialDirectory rawMaterialDirectory;
    RawMaterialManager rawMaterialManager;
    RawMaterialOrderDirectory rawMaterialOrderDirectory;

    public RawMaterialOrderDirectory getRawMaterialOrderDirectory() {
        return rawMaterialOrderDirectory;
    }

    public void setRawMaterialOrderDirectory(RawMaterialOrderDirectory rawMaterialOrderDirectory) {
        this.rawMaterialOrderDirectory = rawMaterialOrderDirectory;
    }
   
    public RawMaterialManageOrganization() { 
        rawMaterialOrderDirectory= new RawMaterialOrderDirectory ();
    }

    public RawMaterialManager getRawMaterialManager() {
        return rawMaterialManager;
    }

    public void setRawMaterialManager(RawMaterialManager rawMaterialManager) {
        this.rawMaterialManager = rawMaterialManager;
    }
    
    public void addRawMaterialManager(Person p) {
        new RawMaterialManager(p);
    }
    
    
}
