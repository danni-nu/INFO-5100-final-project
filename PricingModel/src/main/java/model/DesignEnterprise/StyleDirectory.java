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
public class StyleDirectory {
    ArrayList<Style> styleDirectory;

    public StyleDirectory() {
        this.styleDirectory = new ArrayList<>();
    }
    
    public ArrayList<Style> getStyleDirectory() {
        return styleDirectory;
    }

    public void setStyleDirectory(ArrayList<Style> styleDirectory) {
        this.styleDirectory = styleDirectory;
    }
    
    public void addNewStyle(String n){
          Style style=new Style(n);
          styleDirectory.add(style);
    }
}
