/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Production;

import java.util.ArrayList;
import model.Personnel.Person;
import model.Personnel.Profile;

/**
 *
 * @author administratorzi
 */
public class InventoryManagerProfile extends Profile {

   //private MaterialOrderDirectory materialOrderDirectory;

    public InventoryManagerProfile(Person p, ProductionOrganization po) {
        super(p); 
       // materialOrderDirectory = new MaterialOrderDirectory();
    }
    
    
    @Override
    public String getRole(){
        return  "InventoryManager";
    }

}
