/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DesignEnterprise;

/**
 *
 * @author tianlyu
 */
public class Style {
    
      private String styleName;
      private String description;
//    public static final String MODERN = "Modern";
//    public static final String CLASSIC = "Classic";
//    public static final String VINTAGE = "Vintage";
//    public static final String CONTEMPORARY = "Contemporary";
//    public static final String MINIMALIST = "Minimalist";
//    public static final String INDUSTRIAL = "Industrial";
//    public static final String SCANDINAVIAN = "Scandinavian";
//    public static final String ART_DECO = "Art Deco";
//    public static final String BOHEMIAN = "Bohemian";
//    public static final String TRANSITIONAL = "Transitional";

    public Style(String styleName) {
        this.styleName = styleName;
    }
    
    public String getStyleName() {
        return styleName;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
