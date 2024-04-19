/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.RawMaterialEnterprise;

import model.Personnel.Person;
import model.Personnel.Profile;

/**
 *
 * @author tianlyu
 */
public class RawMaterialManager extends Profile{

    @Override
    public String getRole() {
        return "RawMaterialManager";
    }

    public RawMaterialManager(Person p) {
        super(p);
    }
    
    
    
}
