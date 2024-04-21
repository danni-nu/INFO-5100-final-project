/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Personnel;

import java.util.ArrayList;

import model.Business.Business;

/**
 *
 * @author kal bugrara
 */
public class AdminDirectory {

    Business business;
    ArrayList<AdminProfile> employeelist;

    public AdminDirectory(Business d) {
        business = d;
        employeelist = new ArrayList();

    }

    public AdminDirectory() {
    }

    public AdminProfile newEmployeeProfile(Person p) {

        AdminProfile sp = new AdminProfile(p);
        employeelist.add(sp);
        return sp;
    }

    public AdminProfile findEmployee(String id) {

        for (AdminProfile sp : employeelist) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
            return null; //not found after going through the whole list
         }


    
}
