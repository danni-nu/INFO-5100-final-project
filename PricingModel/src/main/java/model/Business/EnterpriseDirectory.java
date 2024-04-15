/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Business;

import java.util.ArrayList;
import java.lang.String;

/**
 *
 * @author qiaohui
 */
public class EnterpriseDirectory {
    ArrayList<Enterprise> enterpriseDirectory;

    public ArrayList<Enterprise> getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(ArrayList<Enterprise> enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }
    
    
    public ArrayList<Enterprise> findDesignEnterpriseList(){
        ArrayList<Enterprise> newDesignEnterpriseList=new ArrayList<>();
        for(Enterprise enterprise:enterpriseDirectory ){
            if (enterprise.getEnterpriseType()=="Design Company"){
                newDesignEnterpriseList.add(enterprise);
            }
            }
        return newDesignEnterpriseList;
    }
    
    public BrandEnterprise addDesignEnterprise(String name){
        BrandEnterprise e = new BrandEnterprise( name);
        enterpriseDirectory.add(e); 
        return e;
    }  
}
