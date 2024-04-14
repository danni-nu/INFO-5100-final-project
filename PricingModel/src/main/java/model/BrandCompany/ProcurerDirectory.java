/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.BrandCompany;

import java.util.ArrayList;

/**
 *
 * @author qiaohui
 */
public class ProcurerDirectory {
    ArrayList<Procurer> procurerDirectory;

    public ProcurerDirectory(ArrayList<Procurer> procurerDirectory) {
        this.procurerDirectory = procurerDirectory;
    }

    public ArrayList<Procurer> getProcurerDirectory() {
        return procurerDirectory;
    }

    public void setProcurerDirectory(ArrayList<Procurer> procurerDirectory) {
        this.procurerDirectory = procurerDirectory;
    }
   
}
