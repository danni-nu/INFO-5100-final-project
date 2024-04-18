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
public class InventoryOrganization {
    private InventoryManagerProfile inventoryManagerProfile;
    private MaterialOrderDirectory materialOrderDIrectory;

    public InventoryOrganization() {
       this.materialOrderDIrectory=new MaterialOrderDirectory();
    }
    
    public InventoryManagerProfile getInventoryManagerProfile() {
        return inventoryManagerProfile;
    }
    
    
    
}
