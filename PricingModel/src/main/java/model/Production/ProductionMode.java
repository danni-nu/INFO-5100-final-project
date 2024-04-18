/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Production;

/**
 *
 * @author administratorzi
 */
public class ProductionMode {
    private String modeName;
    private int modePrice;

    public ProductionMode(String modeName, int modePrice) {
        this.modeName = modeName;
        this.modePrice = modePrice;
    }

    public String getModeName() {
        return modeName;
    }

    public void setModeName(String modeName) {
        this.modeName = modeName;
    }

    public int getModePrice() {
        return modePrice;
    }

    public void setModePrice(int modePrice) {
        this.modePrice = modePrice;
    }
    
   
    @Override
    public String toString(){
        return modeName;
    }
    
}
