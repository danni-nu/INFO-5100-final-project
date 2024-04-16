/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Business;
import model.BrandCompany.ProcurementOrganization;
import model.BrandCompany.ProductPlanningOrganization;

/**
 *
 * @author qiaohui
 */
public class BrandEnterprise extends Enterprise {
    String enterpriseType="Brand Company";
    String companyName;
    ProductPlanningOrganization  productPlanningOrganization;
    ProcurementOrganization procurementOrganization;

    public BrandEnterprise(String companyName) {
        this.enterpriseType="Brand Company";
        this.companyName = companyName;
        this.productPlanningOrganization= new ProductPlanningOrganization();
        this.procurementOrganization=new ProcurementOrganization();
    }

    @Override
    public String getEnterpriseType() {
        return "Brand Company";
    }

    public void setEnterpriseType(String enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public ProductPlanningOrganization getProductPlanningOrganization() {
        return productPlanningOrganization;
    }

    public void setProductPlanningOrganization(ProductPlanningOrganization productPlanningOrganization) {
        this.productPlanningOrganization = productPlanningOrganization;
    }

    public ProcurementOrganization getProcurementOrganization() {
        return procurementOrganization;
    }

    public void setProcurementOrganization(ProcurementOrganization procurementOrganization) {
        this.procurementOrganization = procurementOrganization;
    }
    
}
