/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DesignEnterprise;

import java.util.ArrayList;

/**
 *
 * @author tianlyu
 */
public class DesignerDirectory {
    public ArrayList<DesignerProfile> DesignerProfile;

    public DesignerDirectory(ArrayList<DesignerProfile> DesignerProfile) {
        this.DesignerProfile = DesignerProfile;
    }

    public ArrayList<DesignerProfile> getDesignerProfile() {
        return DesignerProfile;
    }

    public void setDesignerProfile(ArrayList<DesignerProfile> DesignerProfile) {
        this.DesignerProfile = DesignerProfile;
    }
    
    public void addNewDesignerProfile(DesignerProfile profile) {
        DesignerProfile.add(profile);
    }
    
    public void deleteDesignerProfile(DesignerProfile profile) {
        DesignerProfile.remove(profile);
    }
}
