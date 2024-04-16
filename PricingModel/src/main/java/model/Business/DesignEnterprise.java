/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Business;

import model.DesignEnterprise.DesignOrganization;

/**
 *
 * @author qiaohui
 */
public class DesignEnterprise extends Enterprise{

    String enterprsieType="Design Company";
    String companyName;
    DesignOrganization designOrganization;
    
    public DesignEnterprise(String companyName) {
        this.enterprsieType="Design Company";
    }

    @Override
    public String getEnterpriseType() {
        return "Design Company";
    }
    
    
}
