
package com.provasoap.servicedepartment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per department complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="department">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="departmentId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="departmentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locationId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "department", propOrder = {
    "departmentId",
    "departmentName",
    "locationId"
})
public class Department {

    protected int departmentId;
    protected String departmentName;
    protected int locationId;

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

    /**
     * Recupera il valore della proprietà departmentName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * Imposta il valore della proprietà departmentName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentName(String value) {
        this.departmentName = value;
    }

    /**
     * Recupera il valore della proprietà locationId.
     * 
     */
    public int getLocationId() {
        return locationId;
    }

    /**
     * Imposta il valore della proprietà locationId.
     * 
     */
    public void setLocationId(int value) {
        this.locationId = value;
    }

}
