/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Business;

import model.DesignEnterprise.ColorDirectory;
import model.DesignEnterprise.DesignOrganization;
import model.DesignEnterprise.StyleDirectory;

/**
 *
 * @author qiaohui
 */
public class DesignEnterprise{

    String enterprsieType="Design Company";
    String companyName;
    DesignOrganization designOrganization;
    StyleDirectory styleDirectory;
    ColorDirectory colorDirectory;
    
    public DesignEnterprise(String companyName) {
       this.enterprsieType="Design Company";
       this.companyName=companyName;
       this.designOrganization=new DesignOrganization();
       this.styleDirectory=new StyleDirectory();
       this.colorDirectory=new ColorDirectory();
    }

    public ColorDirectory getColorDirectory() {
        return colorDirectory;
    }

    public void setColorDirectory(ColorDirectory colorDirectory) {
        this.colorDirectory = colorDirectory;
    }

    //@Override
    public String getEnterpriseType() {
        return "Design Company";
    }

    @Override
    public String toString() {
        return companyName;
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
    
    
}
