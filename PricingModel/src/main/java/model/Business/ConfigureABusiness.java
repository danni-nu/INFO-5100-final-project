/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Business;

import java.time.LocalDate;
import java.util.Random;
import model.BrandCompany.Order;
import model.BrandCompany.OrderDirectory;
import model.BrandCompany.PlannerProfile;
import model.BrandCompany.ProcurerDirectory;
import model.BrandCompany.ProcurerProfile;
import model.BrandCompany.ProductPlannerDirectory;
import model.BrandCompany.Requirement;
import model.BrandCompany.RequirementsDirectory;
import model.Business.Business;
import model.DesignEnterprise.DesignerDirectory;
import model.DesignEnterprise.DesignerProfile;
import model.DesignEnterprise.Style;
import model.DesignEnterprise.StyleDirectory;
import model.Personnel.Person;
import model.Personnel.PersonDirectory;
import model.Production.InventoryManagerProfile;
import model.Production.ProductionManagerProfile;
import model.Production.ProductionMode;
import model.Production.ProductionModeDirectory;
import model.Production.ProductionOrder;
import model.Production.ProductionOrderDirectory;
import model.Production.ProductionOrganization;
import model.RawMaterialEnterprise.RawMaterial;
import model.RawMaterialEnterprise.RawMaterialDirectory;
import model.RawMaterialEnterprise.RawMaterialOrder;
import model.RawMaterialEnterprise.RawMaterialOrderDirectory;
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
    BrandEnterprise brandEnterprise= enterpriseDirectory.addBrandEnterprise("Brand Company1");
    DesignEnterprise designEnterprise= enterpriseDirectory.addDesignEnterprise("DesignCompany1");
    ProductionEnterprise productionEnterprise= enterpriseDirectory.addProductionEnterprise("Production Company1");
    RawMaterialEnterprise rawMaterialEnterprise=enterpriseDirectory.addRawMaterialEnterprise("Raw Material Company1");
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
        Person p9 = personDirectory.newPerson( "Isha");
        Person p10 = personDirectory.newPerson( "Jainam");
        Person p11 = personDirectory.newPerson( "Kal");
        Person p12 = personDirectory.newPerson( "Lakshay");
        Person p13 = personDirectory.newPerson( "Mihir");
        Person p14 = personDirectory.newPerson( "Nirav");
        Person p15 = personDirectory.newPerson( "Ojas");
        Person p16 = personDirectory.newPerson( "Bonnie");
        Person p17 = personDirectory.newPerson( "Carl");
        Person p18 = personDirectory.newPerson("Diana");
        Person p19 = personDirectory.newPerson( "Edward");
        Person p20 = personDirectory.newPerson("Fiona");
        
        //production enterprise managers
        Person p21 = personDirectory.newPerson("George");
        Person p22 = personDirectory.newPerson("Hannah");

    
        ProcurerDirectory prurerDirectory=brandEnterprise.getProcurementOrganization().getProcurerDirectory();
        ProcurerProfile pricurerProfile=prurerDirectory.newProcurerProfile(p2);
        UserAccount us2=useAccountDirectory.newUserAccount(pricurerProfile, "Procurer1", "123");
        
        ProductPlannerDirectory plannerDirectory=brandEnterprise.getProductPlanningOrganization().getPlannerDirectory();
        PlannerProfile planner1=plannerDirectory.addNewPlanner(p3);
        UserAccount us3=useAccountDirectory.newUserAccount(planner1, "Planner1", "123");
        
        StyleDirectory styleDirectory =designEnterprise.getStyleDirectory();
        Style style1=styleDirectory.addANewStyle("Modern");
        Style style2=styleDirectory.addANewStyle("Modern");
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
        RawMaterial rawmaterial1=rawMaterialDirectory.addANewRawMaterial("T-shirt", random.nextInt(41) + 20);
        RawMaterial rawmaterial2=rawMaterialDirectory.addANewRawMaterial("Jeans", random.nextInt(41) + 20);
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
        ProductionMode productionmode1=productionModeDirectory.addANewProductionMode("Screen printing", random.nextInt(11) + 5);
        ProductionMode productionmode2=productionModeDirectory.addANewProductionMode("Digital printing", random.nextInt(11) + 5);
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
            
        DesignerDirectory designerDirectory=designEnterprise.getDesignOrganization().getDesignerDirectory();
        DesignerProfile designer1=designerDirectory.addANewDesignerProfile(p7, 10);
        DesignerProfile designer2=designerDirectory.addANewDesignerProfile(p8, 9);
        
        RequirementsDirectory requirementsdirectory=brandEnterprise.productPlanningOrganization.getRequirementDirectory();
        Requirement requirement1=requirementsdirectory.addANewRrequirement(rawmaterial1, designer1, productionmode1, planner1,style1);
        Requirement requirement2=requirementsdirectory.addANewRrequirement(rawmaterial2, designer2, productionmode2, planner1,style1);
        Requirement requirement3=requirementsdirectory.addANewRrequirement(rawmaterial1, designer2, productionmode1, planner1,style2);
        Requirement requirement4=requirementsdirectory.addANewRrequirement(rawmaterial2, designer1, productionmode2, planner1,style2);
        Requirement requirement5=requirementsdirectory.addANewRrequirement(rawmaterial1, designer2, productionmode2, planner1,style1);
        Requirement requirement6=requirementsdirectory.addANewRrequirement(rawmaterial2, designer1, productionmode1, planner1,style2);
        OrderDirectory orderdirectory=brandEnterprise.getProcurementOrganization().getOrderDirectory();
        Order order1=orderdirectory.addNewOrder(requirement1, 10, "material delivered");
        Order order2=orderdirectory.addNewOrder(requirement2, 10, "material delivered");
        Order order3=orderdirectory.addNewOrder(requirement3, 10, "material delivered");
        Order order4=orderdirectory.addNewOrder(requirement4, 10, "material delivered");
        
        ProductionOrganization productionOrganization = productionEnterprise.getProductionOrganization();
        ProductionOrderDirectory productionOrderDirectory = productionEnterprise.getProductionOrderDirectory();
        //把production orderdirectory 设立在production enterprise下,
        //production manager和inventory manager都能access production order
        
        ProductionManagerProfile pmp = new ProductionManagerProfile(p21,productionOrganization);
        InventoryManagerProfile imp = new InventoryManagerProfile(p22,productionOrganization);
        
        productionOrderDirectory.addNewOrder(order1);
        productionOrderDirectory.addNewOrder(order2);
        productionOrderDirectory.addNewOrder(order3);
        productionOrderDirectory.addNewOrder(order4);
        
        RawMaterialOrderDirectory rawMaterialOrderDirectory=rawMaterialEnterprise.getRawMaterialManageOrganization().getRawMaterialOrderDirectory();
        RawMaterialOrder rawMaterialOrder1 =rawMaterialOrderDirectory.addNewRawMaterialOrder(order1.getRawMaterialOrder());
        RawMaterialOrder rawMaterialOrder2 =rawMaterialOrderDirectory.addNewRawMaterialOrder(order2.getRawMaterialOrder());
        RawMaterialOrder rawMaterialOrder3 =rawMaterialOrderDirectory.addNewRawMaterialOrder(order3.getRawMaterialOrder());
        RawMaterialOrder rawMaterialOrder4 =rawMaterialOrderDirectory.addNewRawMaterialOrder(order4.getRawMaterialOrder());
        
        UserAccountDirectory uadirectory = business.getUserAccountDirectory();
        UserAccount pmpua = uadirectory.newUserAccount(pmp, "productionmanager", "****"); 
        UserAccount impua = uadirectory.newUserAccount(imp, "productionenterpriseinventorymanager", "****");
        
        
        
        return business;
  }
}
