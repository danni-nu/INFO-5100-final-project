/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Business;

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
import model.DesignEnterprise.Color;
import model.DesignEnterprise.ColorDirectory;
import model.DesignEnterprise.DesignerDirectory;
import model.DesignEnterprise.DesignerProfile;
import model.DesignEnterprise.Style;
import model.DesignEnterprise.StyleDirectory;
import model.Personnel.Person;
import model.Personnel.PersonDirectory;
import model.Production.InventoryManagerProfile;
import model.Production.InventoryOrganization;
import model.Production.ProductionManagerProfile;
import model.Production.ProductionMode;
import model.Production.ProductionModeDirectory;
import model.Production.ProductionOrder;
import model.Production.ProductionOrderDirectory;
import model.Production.ProductionOrganization;
import model.RawMaterialEnterprise.RawMaterial;
import model.RawMaterialEnterprise.RawMaterialDirectory;
import model.RawMaterialEnterprise.RawMaterialManager;
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
      PersonDirectory personDirectory=business.getPersonDirectory();
      UserAccountDirectory useAccountDirectory=business.getUserAccountDirectory();
    
        Person p1 = personDirectory.newPerson("Archil");
        Person p2 = personDirectory.newPerson("Bhargav");
        Person p3 = personDirectory.newPerson("Chaitanya");
        Person p4 = personDirectory.newPerson("Dhruv");
        Person p5 = personDirectory.newPerson("Esha");
        Person p6 = personDirectory.newPerson("Fenil");
        
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
        
        //Designers
        Person p7 = personDirectory.newPerson("Gaurav");
        Person p8 = personDirectory.newPerson("Hemant");

        
        //RawMaterial Manager
        Person p20 = personDirectory.newPerson("Fiona");
        
        //production enterprise managers
        Person p21 = personDirectory.newPerson("George");
        Person p22 = personDirectory.newPerson("Hannah");
        
    
    EnterpriseDirectory enterpriseDirectory =business.getEnterpriseDirectory();
    BrandEnterprise brandEnterprise= enterpriseDirectory.addBrandEnterprise("Brand Company1");
    DesignEnterprise designEnterprise= enterpriseDirectory.addDesignEnterprise("DesignCompany1");
    ProductionEnterprise productionEnterprise= enterpriseDirectory.addProductionEnterprise("Production Company1", p22, p21);
    RawMaterialEnterprise rawMaterialEnterprise=enterpriseDirectory.addRawMaterialEnterprise("Raw Material Company1");
    
        
        ProcurerDirectory prurerDirectory=brandEnterprise.getProcurementOrganization().getProcurerDirectory();
        ProcurerProfile pricurerProfile=prurerDirectory.newProcurerProfile(p2);
        UserAccount us2=useAccountDirectory.newUserAccount(pricurerProfile, "Procurer1", "123");
        
        ProductPlannerDirectory plannerDirectory=brandEnterprise.getProductPlanningOrganization().getPlannerDirectory();
        PlannerProfile planner1=plannerDirectory.addNewPlanner(p3);
        UserAccount us3=useAccountDirectory.newUserAccount(planner1, "Planner1", "123");

        //add designer account
        DesignerDirectory designerDirectory = designEnterprise.getDesignOrganization().getDesignerDirectory();
        DesignerProfile designer1=designerDirectory.addANewDesignerProfile(p7, 100);//primary designer-Gaurav 100$/requirment
        DesignerProfile designer2=designerDirectory.addANewDesignerProfile(p8, 200);//advanced designer-Hemant 200$/requirment
        UserAccount us4=useAccountDirectory.newUserAccount(designer1,"designer1","123");//login password
        UserAccount us5=useAccountDirectory.newUserAccount(designer2,"designer2","123");//login password
        
        //add RawMaterial Manager account
        rawMaterialEnterprise.getRawMaterialManageOrganization().addRawMaterialManager(p20);//Fiona
        RawMaterialManager rawMaterialManager= rawMaterialEnterprise.getRawMaterialManageOrganization().getRawMaterialManager();
        UserAccount us6=useAccountDirectory.newUserAccount(rawMaterialManager,"rawMaterialManager","123");//login password
        
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
        
        
        ColorDirectory colorDirectory=designEnterprise.getColorDirectory();
        Color color1 =colorDirectory.addANewColor("Cobalt Blue");
        Color color2 =colorDirectory.addANewColor("Charcoal Gray");
        colorDirectory.addNewColor("Sky Blue");
        colorDirectory.addNewColor("Mint Green");
        colorDirectory.addNewColor("Coral");
        colorDirectory.addNewColor("Lavender");
        colorDirectory.addNewColor("Peach");
        colorDirectory.addNewColor("Lemon Yellow");
        colorDirectory.addNewColor("Salmon");
        colorDirectory.addNewColor("Navy Blue");
        colorDirectory.addNewColor("Olive Green");
        colorDirectory.addNewColor("Maroon");
        colorDirectory.addNewColor("Plum");
        colorDirectory.addNewColor("Beige");
        colorDirectory.addNewColor("Mustard");
        colorDirectory.addNewColor("Teal");
        colorDirectory.addNewColor("Rust");
        colorDirectory.addNewColor("Ivory");
        colorDirectory.addNewColor("Turquoise");
        
        
        

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
        
        //ctreate two designer move to top
//        DesignerDirectory designerDirectory=designEnterprise.getDesignOrganization().getDesignerDirectory();
//        DesignerProfile designer1=designerDirectory.addANewDesignerProfile(p7, 100);primary designer-Gaurav 100$/requirment
//        DesignerProfile designer2=designerDirectory.addANewDesignerProfile(p8, 200);advanced designer-Hemant 200$/requirment
        
        RequirementsDirectory requirementsdirectory=brandEnterprise.productPlanningOrganization.getRequirementDirectory();
        Requirement requirement1=requirementsdirectory.addANewRrequirement(rawmaterial1, designer1, productionmode1, planner1,style1,color1);
        Requirement requirement2=requirementsdirectory.addANewRrequirement(rawmaterial2, designer2, productionmode2, planner1,style1,color2);
        Requirement requirement3=requirementsdirectory.addANewRrequirement(rawmaterial1, designer2, productionmode1, planner1,style2,color1);
        Requirement requirement4=requirementsdirectory.addANewRrequirement(rawmaterial2, designer1, productionmode2, planner1,style2,color2);
        Requirement requirement5=requirementsdirectory.addANewRrequirement(rawmaterial1, designer2, productionmode2, planner1,style1,color1);
        Requirement requirement6=requirementsdirectory.addANewRrequirement(rawmaterial2, designer1, productionmode1, planner1,style2,color2);
        requirement1.setDeadline("05/23/2024");
        requirement2.setDeadline("11/03/2024");
        requirement3.setDeadline("04/23/2024");
        requirement4.setDeadline("06/12/2024");
        requirement5.setDeadline("08/13/2024");
        requirement6.setDeadline("09/28/2024");
        
        OrderDirectory orderdirectory=brandEnterprise.getProcurementOrganization().getOrderDirectory();
        Order order1=orderdirectory.addNewOrder(requirement1, 10);
        Order order2=orderdirectory.addNewOrder(requirement2, 10);
        Order order3=orderdirectory.addNewOrder(requirement3, 10);
        Order order4=orderdirectory.addNewOrder(requirement4, 10);
        order1.setOrderPrice(order1.getRawMaterial().getPrice()+order1.getProductionMode().getModePrice()+requirement1.getDesignerProfile().getDefaultDesignPricing());
        order2.setOrderPrice(order2.getRawMaterial().getPrice()+order2.getProductionMode().getModePrice()+requirement2.getDesignerProfile().getDefaultDesignPricing());
        order3.setOrderPrice(order3.getRawMaterial().getPrice()+order3.getProductionMode().getModePrice()+requirement3.getDesignerProfile().getDefaultDesignPricing());
        order4.setOrderPrice(order4.getRawMaterial().getPrice()+order4.getProductionMode().getModePrice()+requirement4.getDesignerProfile().getDefaultDesignPricing());
        
        
        ProductionOrganization productionOrganization = productionEnterprise.getProductionOrganization();
        InventoryOrganization inventoryOrganization = productionEnterprise.getInventoryOrganization();
        ProductionOrderDirectory productionOrderDirectory = productionEnterprise.getProductionOrderDirectory();
        //把production orderdirectory 设立在production enterprise下,
        //production manager和inventory manager都能access production order
        //ProductionManagerProfile pmp = new ProductionManagerProfile(p21,productionOrganization);
        //InventoryManagerProfile imp = inventoryOrganization.getInventoryManagerProfile();
        InventoryManagerProfile imp = inventoryOrganization.getInventoryManagerProfile();
        
        RawMaterialOrderDirectory rawMaterialOrderDirectory=rawMaterialEnterprise.getRawMaterialManageOrganization().getRawMaterialOrderDirectory();
        RawMaterialOrder rawMaterialOrder1 =rawMaterialOrderDirectory.addNewRawMaterialOrder(order1.getRawMarerialOrder());
        RawMaterialOrder rawMaterialOrder2 =rawMaterialOrderDirectory.addNewRawMaterialOrder(order2.getRawMarerialOrder());
        RawMaterialOrder rawMaterialOrder3 =rawMaterialOrderDirectory.addNewRawMaterialOrder(order3.getRawMarerialOrder());
        RawMaterialOrder rawMaterialOrder4 =rawMaterialOrderDirectory.addNewRawMaterialOrder(order4.getRawMarerialOrder());
        
        ProductionOrder productionOrder4 =productionOrderDirectory.addNewProductionOrder(order1.getProductOrder());
        ProductionOrder productionOrder3 =productionOrderDirectory.addNewProductionOrder(order2.getProductOrder());
        ProductionOrder productionOrder2 =productionOrderDirectory.addNewProductionOrder(order3.getProductOrder());
        ProductionOrder productionOrder1 =productionOrderDirectory.addNewProductionOrder(order4.getProductOrder());
        
        //UserAccount pmpua = uadirectory.newUserAccount(pmp, "productionmanager", "****");
        UserAccount impua = useAccountDirectory.newUserAccount(imp, "inventorymanager1", "****");
        
        
        
    return business;
  }
}
