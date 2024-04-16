/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Business;

import model.DesignEnterprise.DesignOrganization;
import model.RawMaterialEnterprise.RawMaterialDirectory;
import model.RawMaterialEnterprise.RawMaterialManageOrganization;

/**
 *
 * @author qiaohui
 */
public class RawMaterialEnterprise extends Enterprise{
    String enterpriseType="Raw Material Company";
    String companyName;
    RawMaterialManageOrganization rawMaterialManageOrganization;
    RawMaterialDirectory rawMaterialDirectory;

    public RawMaterialEnterprise(String companyName) {
        this.enterpriseType="Raw Material Company";
        this.companyName = companyName;
        this.rawMaterialManageOrganization=new RawMaterialManageOrganization();
        this.rawMaterialDirectory=new RawMaterialDirectory();
    }
    
    
    @Override
    public String getEnterpriseType() {
        return "Raw Material Company";
    }
    
    @Override
    public String toString(){
        return companyName;
    }
    
}
