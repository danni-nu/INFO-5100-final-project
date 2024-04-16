/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Business;

import java.util.ArrayList;
import model.DesignEnterprise.DesignOrganization;
import model.DesignEnterprise.StyleDirectory;

/**
 *
 * @author qiaohui
 */
public class DesignEnterprise extends Enterprise{

    String enterprsieType="Design Company";
    String companyName;
    DesignOrganization designOrganization;
    StyleDirectory styleDirectory;
    
    public DesignEnterprise(String companyName) {
       this.enterprsieType="Design Company";
       this.companyName=companyName;
       this.designOrganization=new DesignOrganization();
       this.styleDirectory=new ArrayList<>();
    }

    public String getEnterprsieType() {
        return enterprsieType;
    }

    public void setEnterprsieType(String enterprsieType) {
        this.enterprsieType = enterprsieType;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public DesignOrganization getDesignOrganization() {
        return designOrganization;
    }

    public void setDesignOrganization(DesignOrganization designOrganization) {
        this.designOrganization = designOrganization;
    }

    public StyleDirectory getStyleDirectory() {
        return styleDirectory;
    }

    public void setStyleDirectory(StyleDirectory styleDirectory) {
        this.styleDirectory = styleDirectory;
    }
    

    @Override
    public String getEnterpriseType() {
        return "Design Company";
    }
    
    @Override
    public String toString(){
        return companyName;
    }
}
