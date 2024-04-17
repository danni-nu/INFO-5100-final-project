/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Business;

import java.util.Random;
import model.BrandCompany.PlannerProfile;
import model.BrandCompany.ProcurerDirectory;
import model.BrandCompany.ProcurerProfile;
import model.BrandCompany.ProductPlannerDirectory;
import model.Business.Business;
import model.DesignEnterprise.StyleDirectory;
import model.Personnel.Person;
import model.Personnel.PersonDirectory;
import model.Production.ProductionModeDirectory;
import model.RawMaterialEnterprise.RawMaterialDirectory;
import model.UserAccountManagement.UserAccount;
import model.UserAccountManagement.UserAccountDirectory;

/**
 *
 * @author kal bugrara
 */
public class ConfigureABusiness {

  public static Business initialize() {
    Business business = new Business("Xerox");
    EnterpriseDirectory enterpriseDirectory =business.getEnterpriseDirectory();
    BrandEnterprise brandEnterprise= enterpriseDirectory.addBrandEnterprise("Brand Company");
    DesignEnterprise designEnterprise= enterpriseDirectory.addDesignEnterprise("DesignCompany");
    ProductionEnterprise productionEnterprise= enterpriseDirectory.addProductionEnterprise("Production Company");
    RawMaterialEnterprise rawMaterialEnterprise=enterpriseDirectory.addRawMaterialEnterprise("Raw Material Company");
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
        
        ProductPlannerDirectory plannerDirectory=brandEnterprise.getProductPlanningOrganization().getPlannerDirectory();
        PlannerProfile plannerProfile=plannerDirectory.addNewPlanner(p3);
        UserAccount us3=useAccountDirectory.newUserAccount(plannerProfile, "Planner1", "123");
        
        StyleDirectory styleDirectory =designEnterprise.getStyleDirectory();
        styleDirectory.addNewStyle("Modern");
        styleDirectory.addNewStyle("Modern");
        styleDirectory.addNewStyle("Classic");
        styleDirectory.addNewStyle("Vintage");
        styleDirectory.addNewStyle("Contemporary");
        styleDirectory.addNewStyle("Minimalist");
        styleDirectory.addNewStyle("Industrial");
        styleDirectory.addNewStyle("Scandinavian");
        styleDirectory.addNewStyle("Art Deco");
        styleDirectory.addNewStyle("Bohemian");
        styleDirectory.addNewStyle("Transitional");

        RawMaterialDirectory rawMaterialDirectory=rawMaterialEnterprise.getRawMaterialDirectory();
        Random random = new Random();

        rawMaterialDirectory.addNewRawMaterial("T-shirt", random.nextInt(41) + 20);
        rawMaterialDirectory.addNewRawMaterial("Jeans", random.nextInt(41) + 20);
        rawMaterialDirectory.addNewRawMaterial("Dress shirt", random.nextInt(41) + 20);
        rawMaterialDirectory.addNewRawMaterial("Skirt", random.nextInt(41) + 20);
        rawMaterialDirectory.addNewRawMaterial("Blouse", random.nextInt(41) + 20);
        rawMaterialDirectory.addNewRawMaterial("Sweater", random.nextInt(41) + 20);
        rawMaterialDirectory.addNewRawMaterial("Pants", random.nextInt(41) + 20);
        rawMaterialDirectory.addNewRawMaterial("Shorts", random.nextInt(41) + 20);
        rawMaterialDirectory.addNewRawMaterial("Jacket", random.nextInt(41) + 20);
        rawMaterialDirectory.addNewRawMaterial("Coat", random.nextInt(41) + 20);
        rawMaterialDirectory.addNewRawMaterial("Blazer", random.nextInt(41) + 20);
        rawMaterialDirectory.addNewRawMaterial("Hoodie", random.nextInt(41) + 20);
        rawMaterialDirectory.addNewRawMaterial("Leggings", random.nextInt(41) + 20);
        rawMaterialDirectory.addNewRawMaterial("Cardigan", random.nextInt(41) + 20);
        rawMaterialDirectory.addNewRawMaterial("Jumpsuit", random.nextInt(41) + 20);
        rawMaterialDirectory.addNewRawMaterial("Romper", random.nextInt(41) + 20);
        rawMaterialDirectory.addNewRawMaterial("Tank top", random.nextInt(41) + 20);
        rawMaterialDirectory.addNewRawMaterial("Polo shirt", random.nextInt(41) + 20);
        rawMaterialDirectory.addNewRawMaterial("Suit", random.nextInt(41) + 20);
        rawMaterialDirectory.addNewRawMaterial("Tunic", random.nextInt(41) + 20);
        
        ProductionModeDirectory productionModeDirectory=productionEnterprise.getProductionOrganization().getProductionModeDirectory();
        productionModeDirectory.addNewProductionMode("Screen printing", random.nextInt(11) + 5);
        productionModeDirectory.addNewProductionMode("Digital printing", random.nextInt(11) + 5);
        productionModeDirectory.addNewProductionMode("Heat transfer printing", random.nextInt(11) + 5);
        productionModeDirectory.addNewProductionMode("Sublimation printing", random.nextInt(11) + 5);
        productionModeDirectory.addNewProductionMode("Embroidery", random.nextInt(11) + 5);
        productionModeDirectory.addNewProductionMode("Appliqué", random.nextInt(11) + 5);
        productionModeDirectory.addNewProductionMode("Vinyl printing", random.nextInt(11) + 5);
        productionModeDirectory.addNewProductionMode("Foil printing", random.nextInt(11) + 5);
        productionModeDirectory.addNewProductionMode("Water-based printing", random.nextInt(11) + 5);
        productionModeDirectory.addNewProductionMode("Discharge printing", random.nextInt(11) + 5);
        productionModeDirectory.addNewProductionMode("Glow-in-the-dark printing", random.nextInt(11) + 5);
        productionModeDirectory.addNewProductionMode("Puff printing", random.nextInt(11) + 5);
        productionModeDirectory.addNewProductionMode("Flock printing", random.nextInt(11) + 5);
        productionModeDirectory.addNewProductionMode("Direct-to-garment printing", random.nextInt(11) + 5);
        productionModeDirectory.addNewProductionMode("Laser printing", random.nextInt(11) + 5);
       
    return business;
  }
}
