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
    String enterpriseType="Production Company";
    String companyName;
    DesignOrganization designOrganization;

    public DesignEnterprise(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String getEnterpriseType() {
        return "Design Company";
    }
}
