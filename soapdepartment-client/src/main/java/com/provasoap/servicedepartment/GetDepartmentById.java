
package com.provasoap.servicedepartment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getDepartmentById complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getDepartmentById">
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
@XmlType(name = "getDepartmentById", propOrder = {
    "departmentId"
})
public class GetDepartmentById {

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
