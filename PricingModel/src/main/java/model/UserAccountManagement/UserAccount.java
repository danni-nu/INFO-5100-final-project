/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.UserAccountManagement;

import model.Personnel.Profile;

/**
 *
 * @author kal bugrara
 */
public class UserAccount {
    Profile profile;
    String username;
    String password;
    String companyName;
    
    public UserAccount (Profile profile, String un, String pw,String companyName){
         username = un;
         password = pw;
         this.companyName = companyName;
         this.profile = profile;
    }

    public String getPersonName(){
        return profile.getPerson().getPersonName();
    }

        public boolean isMatch(String id){
        if(getPersonName().equals(id)) {
            return true;}
        return false;
    }
        public boolean IsValidUser(String un, String pw){
            if (username.equalsIgnoreCase(un) && password.equals(pw)) {
                return true;
            }
            else {
                return false;
            }
        }
        
        
    public String getRole(){
        return profile.getRole();
    }
        
    public Profile getAssociatedPersonProfile(){
        return profile;
    }    

    @Override
    public String toString() {
        return this.username;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
    
    
        
}
