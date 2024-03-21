
package com.provasoap.servicedepartment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per deleteDepartment complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="deleteDepartment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="departmentId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteDepartment", propOrder = {
    "departmentId"
})
public class DeleteDepartment {

    protected int departmentId;

    /**
     * Recupera il valore della proprietà departmentId.
     * 
     */
    public int getDepartmentId() {
        return departmentId;
    }

    /**
     * Imposta il valore della proprietà departmentId.
     * 
     */
    public void setDepartmentId(int value) {
        this.departmentId = value;
    }

}
