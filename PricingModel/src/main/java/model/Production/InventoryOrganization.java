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

    public InventoryOrganization(InventoryManagerProfile inventoryManagerProfile, MaterialOrderDirectory materialOrderDIrectory) {
        this.inventoryManagerProfile = inventoryManagerProfile;
        this.materialOrderDIrectory = materialOrderDIrectory;
    }
    
    public InventoryManagerProfile getInventoryManagerProfile() {
        return inventoryManagerProfile;
    }
    
    
    
}
