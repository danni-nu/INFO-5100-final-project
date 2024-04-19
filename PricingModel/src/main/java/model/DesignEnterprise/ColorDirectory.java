/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DesignEnterprise;

import java.util.ArrayList;

/**
 *
 * @author qiaohui
 */
public class ColorDirectory {
    ArrayList <Color> corlorlist;

    public ColorDirectory() {
        this.corlorlist=new ArrayList<>();
    }
    
    public ArrayList<Color> getCorlorlist() {
        return corlorlist;
    }

    public void setCorlorlist(ArrayList<Color> corlorlist) {
        this.corlorlist = corlorlist;
    }

    public Color addANewColor(String string) {
        Color c= new Color(string);
        corlorlist.add(c);
        return c;
    }
    
    public void addNewColor(String string) {
        Color c= new Color(string);
        corlorlist.add(c);
    }

    public Color findColor(String s) {
        for(Color c:corlorlist){
            if(c.getColorName().equals(s)){
                return c;
            }
        }
        return null;
    }
    
}
