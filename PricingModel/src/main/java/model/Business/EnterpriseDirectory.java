/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Business;

import java.util.ArrayList;
import java.lang.String;
import model.Business.Enterprise;
import model.RawMaterialEnterprise.RawMaterial;

/**
 *
 * @author qiaohui
 */
public class EnterpriseDirectory {
    ArrayList<Enterprise> enterpriseDirectory;
    ArrayList<RawMaterialEnterprise> rawMaterialEnterpriseList;
    ArrayList<DesignEnterprise> designEnterpriseList;
    ArrayList<BrandEnterprise> brandEnterpriseList;
    ArrayList<ProductionEnterprise> productionEnterpriseList;
    
    public EnterpriseDirectory() {
        rawMaterialEnterpriseList=new ArrayList<>();
        designEnterpriseList=new ArrayList<>();
        brandEnterpriseList=new ArrayList<>();
        productionEnterpriseList=new ArrayList<>();
    }

    public ArrayList<RawMaterialEnterprise> getRawMaterialEnterpriseList() {
        return rawMaterialEnterpriseList;
    }

    public void setRawMaterialEnterpriseList(ArrayList<RawMaterialEnterprise> rawMaterialEnterpriseList) {
        this.rawMaterialEnterpriseList = rawMaterialEnterpriseList;
    }

    public ArrayList<DesignEnterprise> getDesignEnterpriseList() {
        return designEnterpriseList;
    }

    public void setDesignEnterpriseList(ArrayList<DesignEnterprise> designEnterpriseList) {
        this.designEnterpriseList = designEnterpriseList;
    }

    public ArrayList<BrandEnterprise> getBrandEnterpriseList() {
        return brandEnterpriseList;
    }

    public void setBrandEnterpriseList(ArrayList<BrandEnterprise> brandEnterpriseList) {
        this.brandEnterpriseList = brandEnterpriseList;
    }

    public ArrayList<ProductionEnterprise> getProductionEnterpriseList() {
        return productionEnterpriseList;
    }

    public void setProductionEnterpriseList(ArrayList<ProductionEnterprise> productionEnterpriseList) {
        this.productionEnterpriseList = productionEnterpriseList;
    }

 
    public BrandEnterprise addBrandEnterprise(String name){
        BrandEnterprise e = new BrandEnterprise( name);
        brandEnterpriseList.add(e); 
        return e;
    }  
    
    public DesignEnterprise addDesignEnterprise(String n){
        DesignEnterprise e=new DesignEnterprise(n);
        designEnterpriseList.add(e); 
        return e;
    }
    
    public ProductionEnterprise addProductionEnterprise(String name){
        ProductionEnterprise e = new ProductionEnterprise( name);
        productionEnterpriseList.add(e); 
        return e;
    
    }
    
    public RawMaterialEnterprise addRawMaterialEnterprise(String name){
        RawMaterialEnterprise e = new RawMaterialEnterprise( name);
        rawMaterialEnterpriseList.add(e); 
        return e;
    }
    
    public RawMaterialEnterprise getRawMaterialEnterprise(String companyName){
        for(RawMaterialEnterprise e:rawMaterialEnterpriseList){
            if (e.getCompanyName().equals(companyName)) {
                return e;
            }else
            {
            return null;
            } 
        }
        return null;
    }
    

    public DesignEnterprise getDesignEnterprise(String s) {
        for(DesignEnterprise e:designEnterpriseList){
            if (e.getCompanyName().equals(s)) {
            return e;
            }
        }
        return null;
    }
    
    public ProductionEnterprise getProductionEnterprise(String s) {
        for(ProductionEnterprise e:productionEnterpriseList){
            if (e.getCompanyName().equals(s)) {
            return e;
            }
        }
        return null;
    }

    public BrandEnterprise getBrandCompany(String s) {
        for(BrandEnterprise e:brandEnterpriseList){
            if (e.getCompanyName().equals(s)) {
            return e;
            }
        }
        return null;
    }

}
