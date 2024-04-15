/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Business;

import model.DesignEnterprise.DesignOrganization;
import model.RawMaterialEnterprise.RawMaterialManageOrganization;

/**
 *
 * @author qiaohui
 */
public class RawMaterialEnterprise extends Enterprise{
    String enterpriseType="Raw Material Company";
    String companyName;
    RawMaterialManageOrganization rawMaterialManageOrganization;

    public RawMaterialEnterprise(String companyName) {
        this.enterpriseType="Raw Material Company";
        this.companyName = companyName;
    }
    
    
    @Override
    public String getEnterpriseType() {
        return "Raw Material Company";
    }
    
    
}
