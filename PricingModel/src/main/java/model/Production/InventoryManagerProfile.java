/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Production;

import java.util.ArrayList;
import model.Business.MaterialOrder;
import model.Personnel.Person;
import model.Personnel.Profile;

/**
 *
 * @author administratorzi
 */
public class InventoryManagerProfile extends Profile {

    private ArrayList<MaterialOrder> materialOrderList;

    public InventoryManagerProfile(Person p) {
        super(p); 
        materialOrderList = new ArrayList();
    }
    
    @Override
    public String getRole(){
        return  "InventoryManager";
    }

}
