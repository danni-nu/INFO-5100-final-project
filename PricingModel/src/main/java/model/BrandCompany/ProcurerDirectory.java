/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.BrandCompany;

import java.util.ArrayList;
import model.Personnel.Person;

/**
 *
 * @author qiaohui
 */
public class ProcurerDirectory {
    ArrayList<ProcurerProfile> procurerDirectory;

    public ProcurerDirectory() {
        this.procurerDirectory = new ArrayList<>();
    }

    public ArrayList<ProcurerProfile> getProcurerDirectory() {
        return procurerDirectory;
    }

    public void setProcurerDirectory(ArrayList<ProcurerProfile> procurerDirectory) {
        this.procurerDirectory = procurerDirectory;
    }

    public ProcurerProfile newProcurerProfile(Person p2) {
        ProcurerProfile procurer=new ProcurerProfile(p2);
        procurerDirectory.add(procurer);
        return procurer;
    }
   
}
