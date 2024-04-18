/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.BrandCompany;

import model.Personnel.Person;
import model.Personnel.Profile;

/**
 *
 * @author qiaohui
 */
public class PlannerProfile extends Profile{
    
    public PlannerProfile(Person p) {
        super(p);
    }


    @Override
    public String getRole() {
        return "Planner";
    }
    
}
