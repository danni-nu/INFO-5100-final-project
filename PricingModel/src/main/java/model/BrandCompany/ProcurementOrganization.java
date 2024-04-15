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

    public ProcurementOrganization() {
        this.orderDirectory = new OrderDirectory();
        this.procurerDirectory = new ProcurerDirectory();
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
