/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Business;

import java.util.ArrayList;
import model.UserAccountManagement.UserAccountDirectory;


/**
 *
 * @author kal bugrara
 */
public class Business {

          String name;
          EnterpriseDirectory EnterpriseDirectory;
          UserAccountDirectory userAccountDirectory;
          

    public Business(String n) {
          name = n;
          EnterpriseDirectory enterprisedirectroy=new EnterpriseDirectory();
//        masterorderlist = new MasterOrderList();
//        suppliers = new SupplierDirectory();
////      solutionoffercatalog = new SolutionOfferCatalog();
//        persondirectory = new PersonDirectory();
//        customerdirectory = new CustomerDirectory(this);
//        salespersondirectory = new SalesPersonDirectory(this);
          userAccountDirectory = new UserAccountDirectory();
//        marketingpersondirectory = new MarketingPersonDirectory(this);
//        employeedirectory = new EmployeeDirectory(this);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return EnterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory Enterprise) {
        this.EnterpriseDirectory = Enterprise;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserDirctory(UserAccountDirectory userDirctory) {
        this.userAccountDirectory = userDirctory;
    }

}
