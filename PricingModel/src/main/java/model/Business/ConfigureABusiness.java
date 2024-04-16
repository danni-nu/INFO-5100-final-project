/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Business;

import model.BrandCompany.ProcurerDirectory;
import model.BrandCompany.ProcurerProfile;
import model.BrandCompany.ProductPlannerDirectory;
import model.Business.Business;
import model.Personnel.Person;
import model.Personnel.PersonDirectory;
import model.UserAccountManagement.UserAccount;
import model.UserAccountManagement.UserAccountDirectory;

/**
 *
 * @author kal bugrara
 */
public class ConfigureABusiness {

  public static Business initialize() {
    Business business = new Business("Xerox");
    BrandEnterprise brandEnterprise= business.getEnterpriseDirectory().addBrandEnterprise("BrandComapny");
    DesignEnterprise designEnterprise= business.getEnterpriseDirectory().addDesignEnterprise("DesignCompany");
    ProductionEnterprise productionEnterprise= business.getEnterpriseDirectory().addProductionEnterprise("Production Company");
    RawMaterialEnterprise rawMaterialEnterprise=business.getEnterpriseDirectory().addRawMaterialEnterprise("Raw Material Company");
    PersonDirectory personDirectory=business.getPersonDirectory();
    UserAccountDirectory useAccountDirectory=business.getUserAccountDirectory();
    
        Person p1 = personDirectory.newPerson("Archil");
        Person p2 = personDirectory.newPerson("Bhargav");
        Person p3 = personDirectory.newPerson("Chaitanya");
        Person p4 = personDirectory.newPerson("Dhruv");
        Person p5 = personDirectory.newPerson("Esha");
        Person p6 = personDirectory.newPerson("Fenil");
        Person p7 = personDirectory.newPerson("Gaurav");
        Person p8 = personDirectory.newPerson("Hemant");

    
        ProcurerDirectory prurerDirectory=brandEnterprise.getProcurementOrganization().getProcurerDirectory();
        ProcurerProfile pricurerProfile=prurerDirectory.newProcurerProfile(p2);
        UserAccount us2=useAccountDirectory.newUserAccount(pricurerProfile, "Procurer1", "123");
        
        ProductPlannerDirectory plannerDirectory=brandEnterprise.getProductPlanningOrganization().;
        
    
    
    
    return business;
  }
}
