/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DesignEnterprise;

import java.util.ArrayList;

/**
 *
 * @author tianlyu
 */
public class DesignEnterpriseDirectory {
    
    public ArrayList<DesignOrganization> DesignEnterprise;

    public DesignEnterpriseDirectory(ArrayList<DesignOrganization> DesignEnterprise) {
        this.DesignEnterprise = DesignEnterprise;
    }

    public ArrayList<DesignOrganization> getDesignEnterprise() {
        return DesignEnterprise;
    }

    public void setDesignEnterprise(ArrayList<DesignOrganization> DesignEnterprise) {
        this.DesignEnterprise = DesignEnterprise;
    }
    
    
    
}
