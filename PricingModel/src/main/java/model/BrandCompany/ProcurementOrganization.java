/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.BrandCompany;

/**
 *
 * @author qiaohui
 */
public class ProcurementOrganization {
    OrderDirectory orderDirectory;
    ProcurerDirectory procurerDirectory;

    public ProcurementOrganization(OrderDirectory orderDirectory, ProcurerDirectory procurerDirectory) {
        this.orderDirectory = orderDirectory;
        this.procurerDirectory = procurerDirectory;
    }

    public OrderDirectory getOrderDirectory() {
        return orderDirectory;
    }

    public void setOrderDirectory(OrderDirectory orderDirectory) {
        this.orderDirectory = orderDirectory;
    }

    public ProcurerDirectory getProcurerDirectory() {
        return procurerDirectory;
    }

    public void setProcurerDirectory(ProcurerDirectory procurerDirectory) {
        this.procurerDirectory = procurerDirectory;
    }
    
    
}
