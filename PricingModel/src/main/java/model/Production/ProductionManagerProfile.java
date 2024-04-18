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
public class ProductionManagerProfile extends Profile {

    
    //ArrayList<ProductionMode> productionModeList;

    public ProductionManagerProfile(Person p, ProductionOrganization po) {
        super(p); 
        //productionOrderDirectory = new ProductionOrderDirectory();
        //productionModeList = new ArrayList();

    }
    @Override
    public String getRole(){
        return  "ProductionManager";
    }

    

    

    
}
