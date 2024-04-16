/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Business;

import java.util.ArrayList;
import model.Personnel.PersonDirectory;
import model.UserAccountManagement.UserAccountDirectory;

/**
 *
 * @author kal bugrara
 */
public class Business {
    String name;
    EnterpriseDirectory EnterpriseDirectory;
    UserAccountDirectory userAccountDirectory;
    PersonDirectory personDirectory;
         

    public Business(String n) {
        name = n;
        this.EnterpriseDirectory=new EnterpriseDirectory();
        this.personDirectory = new PersonDirectory();
        this.userAccountDirectory = new UserAccountDirectory();
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

    public void setEnterpriseDirectory(EnterpriseDirectory EnterpriseDirectory) {
        this.EnterpriseDirectory = EnterpriseDirectory;
    }
    

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserDirctory(UserAccountDirectory userDirctory) {
        this.userAccountDirectory = userDirctory;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    
}
