/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DesignEnterprise;

/**
 *
 * @author tianlyu
 */
public class Color {
    private String colorName;
    private String colordescription;
//    public static final String RED = "Red";
//    public static final String BLUE = "Blue";
//    public static final String GREEN = "Green";
//    public static final String YELLOW = "Yellow";
//    public static final String ORANGE = "Orange";
//    public static final String PURPLE = "Purple";
//    public static final String PINK = "Pink";
//    public static final String GRAY = "Gray";
//    public static final String BROWN = "Brown";
//    public static final String BLACK = "Black";
//    public static final String WHITE = "White";

    public Color(String colorName) {
        this.colorName = colorName;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public String getColordescription() {
        return colordescription;
    }

    public void setColordescription(String colordescription) {
        this.colordescription = colordescription;
    }
    
    public String toString(){
        return colorName;
    }
    
}
