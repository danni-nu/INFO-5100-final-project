/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DesignEnterprise;

import java.util.ArrayList;
import model.Business.DesignEnterprise;
import model.Personnel.Person;

/**
 *
 * @author tianlyu
 */
public class DesignerDirectory {
    public ArrayList<DesignerProfile> DesignerProfileList;

    public DesignerDirectory() {
        this.DesignerProfileList = new ArrayList<>();
    }

    public ArrayList<DesignerProfile> getDesignerProfileList() {
        return DesignerProfileList;
    }

    public void setDesignerProfileList(ArrayList<DesignerProfile> DesignerProfileList) {
        this.DesignerProfileList = DesignerProfileList;
    }
    
    public void addNewDesignerProfile(Person profile,int price) {
        DesignerProfile newdesigner=new DesignerProfile(profile, price);
        DesignerProfileList.add(newdesigner);
    }
    public DesignerProfile addANewDesignerProfile(Person profile,int price) {
        DesignerProfile newdesigner=new DesignerProfile(profile, price);
        DesignerProfileList.add(newdesigner);
        return newdesigner;
    }
    
    public void deleteDesignerProfile(DesignerProfile profile) {
        DesignerProfileList.remove(profile);
    }
    
    public DesignerProfile findDesignerProfile(String designName){
        for(DesignerProfile designer: DesignerProfileList){
            if(designer.getPerson().getPersonName().equals(designName)){
                return designer;
            }
            }
        return null;
        }
    
}
