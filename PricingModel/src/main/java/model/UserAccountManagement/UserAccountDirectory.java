/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.UserAccountManagement;

import java.util.ArrayList;

import model.Personnel.*;

/**
 *
 * @author kal bugrara
 */
public class UserAccountDirectory {
      ArrayList<UserAccount> useraccountlist ;
    
      public UserAccountDirectory (){
       useraccountlist = new ArrayList<>();

    }

    public UserAccount newUserAccount(Profile p, String userAccount, String passWord) {
        UserAccount ua = new UserAccount (p,  userAccount,  passWord);
        useraccountlist.add(ua);
        return ua;
    }

    public UserAccount findUserAccount(String personName) {
        for (UserAccount ua : useraccountlist) {
            if (ua.isMatch(personName)) {
                return ua;
            }
        }
            return null; //not found after going through the whole list
         }
     public UserAccount AuthenticateUser(String userAccount, String passWord) {
        for (UserAccount ua : useraccountlist) {
            if (ua.IsValidUser(userAccount, passWord)) {
                return ua;
            }
        }
            return null; //not found after going through the whole list
         }  

    public ArrayList<UserAccount> getUseraccountlist() {
        return useraccountlist;
    }

    public void setUseraccountlist(ArrayList<UserAccount> useraccountlist) {
        this.useraccountlist = useraccountlist;
    }
     
     
}
