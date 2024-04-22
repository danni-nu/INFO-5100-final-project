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
import model.Personnel.AdminDirectory;
import model.Personnel.AdminProfile;
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
        
        //admin to login
        AdminDirectory addirectory=business.getAdminDirectory();
        AdminProfile admin=addirectory.newEmployeeProfile(p1);
        UserAccount us1=useAccountDirectory.newUserAccount(admin, "Admin1", "123","AdminGroup");
        
        ProcurerDirectory prurerDirectory=brandEnterprise.getProcurementOrganization().getProcurerDirectory();
        ProcurerProfile pricurerProfile=prurerDirectory.newProcurerProfile(p2);
        UserAccount us2=useAccountDirectory.newUserAccount(pricurerProfile, "Procurer1", "123","Brand Company1");
        
        ProductPlannerDirectory plannerDirectory=brandEnterprise.getProductPlanningOrganization().getPlannerDirectory();
        PlannerProfile planner1=plannerDirectory.addNewPlanner(p3);
        UserAccount us3=useAccountDirectory.newUserAccount(planner1, "Planner1", "123","Brand Company1");

        //add designer account
        DesignerDirectory designerDirectory = designEnterprise.getDesignOrganization().getDesignerDirectory();
        DesignerProfile designer1=designerDirectory.addANewDesignerProfile(p7, 100);//primary designer-Gaurav 100$/requirment
        DesignerProfile designer2=designerDirectory.addANewDesignerProfile(p8, 200);//advanced designer-Hemant 200$/requirment
        UserAccount us4=useAccountDirectory.newUserAccount(designer1,"Designer1","123","DesignCompany1");//login password
        UserAccount us5=useAccountDirectory.newUserAccount(designer2,"Designer2","123","DesignCompany1");//login password
        
        //add RawMaterial Manager account
        rawMaterialEnterprise.getRawMaterialManageOrganization().addRawMaterialManager(p20);//Fiona
        RawMaterialManager rawMaterialManager= rawMaterialEnterprise.getRawMaterialManageOrganization().getRawMaterialManager();
        UserAccount us6=useAccountDirectory.newUserAccount(rawMaterialManager,"Raw1","123","Raw Material Company1");//login password
        
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
        RawMaterial rawmaterial3=rawMaterialDirectory.addANewRawMaterial("Dress shirt", random.nextInt(41) + 20);
        RawMaterial rawmaterial4=rawMaterialDirectory.addANewRawMaterial("Skirt", random.nextInt(41) + 20);
        rawMaterialDirectory.addANewRawMaterial("Blouse", random.nextInt(41) + 20);
        rawMaterialDirectory.addANewRawMaterial("Sweater", random.nextInt(41) + 20);
        rawMaterialDirectory.addANewRawMaterial("Pants", random.nextInt(41) + 20);
        rawMaterialDirectory.addANewRawMaterial("Shorts", random.nextInt(41) + 20);
        rawMaterialDirectory.addANewRawMaterial("Jacket", random.nextInt(41) + 20);
        rawMaterialDirectory.addANewRawMaterial("Coat", random.nextInt(41) + 20);
        rawMaterialDirectory.addANewRawMaterial("Blazer", random.nextInt(41) + 20);
        rawMaterialDirectory.addANewRawMaterial("Hoodie", random.nextInt(41) + 20);
        rawMaterialDirectory.addANewRawMaterial("Leggings", random.nextInt(41) + 20);
        rawMaterialDirectory.addANewRawMaterial("Cardigan", random.nextInt(41) + 20);
        rawMaterialDirectory.addANewRawMaterial("Jumpsuit", random.nextInt(41) + 20);
        rawMaterialDirectory.addANewRawMaterial("Romper", random.nextInt(41) + 20);
        rawMaterialDirectory.addANewRawMaterial("Tank top", random.nextInt(41) + 20);
        rawMaterialDirectory.addANewRawMaterial("Polo shirt", random.nextInt(41) + 20);
        rawMaterialDirectory.addANewRawMaterial("Suit", random.nextInt(41) + 20);
        rawMaterialDirectory.addANewRawMaterial("Tunic", random.nextInt(41) + 20);
        
        ProductionModeDirectory productionModeDirectory=productionEnterprise.getProductionOrganization().getProductionModeDirectory();
        ProductionMode productionmode1=productionModeDirectory.addANewProductionMode("Screen printing", random.nextInt(11) + 5);
        ProductionMode productionmode2=productionModeDirectory.addANewProductionMode("Digital printing", random.nextInt(11) + 5);
        ProductionMode productionmode3=productionModeDirectory.addANewProductionMode("Heat transfer printing", random.nextInt(11) + 5);
        ProductionMode productionmode4=productionModeDirectory.addANewProductionMode("Sublimation printing", random.nextInt(11) + 5);
//        productionModeDirectory.addANewProductionMode("Embroidery", random.nextInt(11) + 5);
//        productionModeDirectory.addANewProductionMode("Appliqué", random.nextInt(11) + 5);
//        productionModeDirectory.addNewProductionMode("Vinyl printing", random.nextInt(11) + 5);
//        productionModeDirectory.addNewProductionMode("Foil printing", random.nextInt(11) + 5);
//        productionModeDirectory.addNewProductionMode("Water-based printing", random.nextInt(11) + 5);
//        productionModeDirectory.addNewProductionMode("Discharge printing", random.nextInt(11) + 5);
//        productionModeDirectory.addNewProductionMode("Glow-in-the-dark printing", random.nextInt(11) + 5);
//        productionModeDirectory.addNewProductionMode("Puff printing", random.nextInt(11) + 5);
//        productionModeDirectory.addNewProductionMode("Flock printing", random.nextInt(11) + 5);
//        productionModeDirectory.addNewProductionMode("Direct-to-garment printing", random.nextInt(11) + 5);
//        productionModeDirectory.addNewProductionMode("Laser printing", random.nextInt(11) + 5);
        
        //ctreate two designer move to top
//        DesignerDirectory designerDirectory=designEnterprise.getDesignOrganization().getDesignerDirectory();
//        DesignerProfile designer1=designerDirectory.addANewDesignerProfile(p7, 100);primary designer-Gaurav 100$/requirment
//        DesignerProfile designer2=designerDirectory.addANewDesignerProfile(p8, 200);advanced designer-Hemant 200$/requirment
        
        RequirementsDirectory requirementsdirectory=brandEnterprise.productPlanningOrganization.getRequirementDirectory();
        Requirement requirement1=requirementsdirectory.addANewRrequirement(rawmaterial1, designer1, productionmode1, planner1,style1,color1);
        Requirement requirement2=requirementsdirectory.addANewRrequirement(rawmaterial2, designer2, productionmode2, planner1,style1,color2);
        Requirement requirement3=requirementsdirectory.addANewRrequirement(rawmaterial1, designer2, productionmode1, planner1,style2,color1);
        Requirement requirement4=requirementsdirectory.addANewRrequirement(rawmaterial2, designer1, productionmode2, planner1,style2,color2);
        Requirement requirement5=requirementsdirectory.addANewRrequirement(rawmaterial3, designer2, productionmode3, planner1,style1,color1);
        Requirement requirement6=requirementsdirectory.addANewRrequirement(rawmaterial4, designer1, productionmode4, planner1,style1,color2);
        Requirement requirement7=requirementsdirectory.addANewRrequirement(rawmaterial3, designer1, productionmode4, planner1,style2,color1);
        Requirement requirement8=requirementsdirectory.addANewRrequirement(rawmaterial4, designer1, productionmode3, planner1,style2,color2);
        requirement1.setDeadline("05/23/2024");
        requirement2.setDeadline("11/03/2024");
        requirement3.setDeadline("04/23/2024");
        requirement4.setDeadline("06/12/2024");
        requirement5.setDeadline("08/13/2024");
        requirement6.setDeadline("09/28/2024");
        requirement7.setDeadline("10/13/2024");
        requirement8.setDeadline("10/28/2024");
        
        OrderDirectory orderdirectory=brandEnterprise.getProcurementOrganization().getOrderDirectory();
        Order order1=orderdirectory.addNewOrder(requirement1, 10);
        Order order2=orderdirectory.addNewOrder(requirement2, 20);
        Order order3=orderdirectory.addNewOrder(requirement3, 30);
        Order order4=orderdirectory.addNewOrder(requirement4, 40);
        Order order5=orderdirectory.addNewOrder(requirement5, 50);
        Order order6=orderdirectory.addNewOrder(requirement6, 60);
        Order order7=orderdirectory.addNewOrder(requirement7, 70);
        Order order8=orderdirectory.addNewOrder(requirement8, 80);
        order1.setOrderPrice(order1.getRawMaterial().getPrice()+order1.getProductionMode().getModePrice()+requirement1.getDesignerProfile().getDefaultDesignPricing());
        order2.setOrderPrice(order2.getRawMaterial().getPrice()+order2.getProductionMode().getModePrice()+requirement2.getDesignerProfile().getDefaultDesignPricing());
        order3.setOrderPrice(order3.getRawMaterial().getPrice()+order3.getProductionMode().getModePrice()+requirement3.getDesignerProfile().getDefaultDesignPricing());
        order4.setOrderPrice(order4.getRawMaterial().getPrice()+order4.getProductionMode().getModePrice()+requirement4.getDesignerProfile().getDefaultDesignPricing());
        order5.setOrderPrice(order5.getRawMaterial().getPrice()+order5.getProductionMode().getModePrice()+requirement5.getDesignerProfile().getDefaultDesignPricing());
        order6.setOrderPrice(order6.getRawMaterial().getPrice()+order6.getProductionMode().getModePrice()+requirement6.getDesignerProfile().getDefaultDesignPricing());
        order7.setOrderPrice(order7.getRawMaterial().getPrice()+order7.getProductionMode().getModePrice()+requirement7.getDesignerProfile().getDefaultDesignPricing());
        order8.setOrderPrice(order8.getRawMaterial().getPrice()+order8.getProductionMode().getModePrice()+requirement8.getDesignerProfile().getDefaultDesignPricing());
        order1.getRawMarerialOrder().setDeliverStatus("Delivered");
        order1.getRawMarerialOrder().setDeliveryDate("01/02/2024");
        order1.getRawMarerialOrder().setDeliveryaddress("230 Hungtington Ave");
        order1.getRawMarerialOrder().setDeliveryNumber("UPS1010101");
        order1.getProductOrder().setProductionOrderStatus("production ends");
        order1.setOrderstatus("Received");
        order2.getRawMarerialOrder().setDeliverStatus("Delivered");
        order2.getRawMarerialOrder().setDeliveryDate("02/02/2024");
        order2.getRawMarerialOrder().setDeliveryaddress("111 Common Street");
        order2.getRawMarerialOrder().setDeliveryNumber("UPS2022022");
        order2.getProductOrder().setProductionOrderStatus("in producing");
        order2.setOrderstatus("Not received");
        
        ProductionOrganization productionOrganization = productionEnterprise.getProductionOrganization();
        InventoryOrganization inventoryOrganization = productionEnterprise.getInventoryOrganization();
        ProductionOrderDirectory productionOrderDirectory = productionEnterprise.getProductionOrderDirectory();
        for(Order order:brandEnterprise.getProcurementOrganization().getOrderDirectory().getOrderDirectory()){
            productionOrderDirectory.addRelatedProductionOrder(order);
        }
        //把production orderdirectory 设立在production enterprise下,
        //production manager和inventory manager都能access production order
        ProductionManagerProfile pmp = productionOrganization.getProductionManagerProfile();
        //InventoryManagerProfile imp = inventoryOrganization.getInventoryManagerProfile();
        InventoryManagerProfile imp = inventoryOrganization.getInventoryManagerProfile();
        
//        RawMaterialOrderDirectory rawMaterialOrderDirectory=rawMaterialEnterprise.getRawMaterialManageOrganization().getRawMaterialOrderDirectory();
//        for(Order order:brandEnterprise.getProcurementOrganization().getOrderDirectory().getOrderDirectory()){
//            rawMaterialOrderDirectory.addARelatedOrder(order);
//        }
        
//        RawMaterialOrder rawMaterialOrder1 =rawMaterialOrderDirectory.addNewRawMaterialOrder(order1.getRawMarerialOrder());
//        RawMaterialOrder rawMaterialOrder2 =rawMaterialOrderDirectory.addNewRawMaterialOrder(order2.getRawMarerialOrder());
//        RawMaterialOrder rawMaterialOrder3 =rawMaterialOrderDirectory.addNewRawMaterialOrder(order3.getRawMarerialOrder());
//        RawMaterialOrder rawMaterialOrder4 =rawMaterialOrderDirectory.addNewRawMaterialOrder(order4.getRawMarerialOrder());
        
        //ProductionOrder productionOrder4 =productionOrderDirectory.addNewProductionOrder(order1.getProductOrder());
//        ProductionOrder productionOrder3 =productionOrderDirectory.addNewProductionOrder(order2.getProductOrder());
//        ProductionOrder productionOrder2 =productionOrderDirectory.addNewProductionOrder(order3.getProductOrder());
//        ProductionOrder productionOrder1 =productionOrderDirectory.addNewProductionOrder(order4.getProductOrder());
        
        UserAccount pmpua = useAccountDirectory.newUserAccount(pmp, "productionmanager1", "123","Production Company1");
        UserAccount impua = useAccountDirectory.newUserAccount(imp, "inventorymanager1", "123","Production Company1");
         
    return business;
  }
}
