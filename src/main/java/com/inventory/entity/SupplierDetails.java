package com.inventory.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

/**
 * @author rsoftware
 * Dated : 10/10/2022
 * This entity has contains supplier details.
 */
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "SUPPLIER_DETAILS")
public class SupplierDetails implements Serializable {

    private static final long serialVersionUID = 599278416359744768L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "SUPPLIER_ID")
    private Long supplierId;

    @Column(name = "SUPPLIER_NAME")
    private String supplierName;

    @Column(name = "SUPPLIER_ADDRESS")
    private String supplierAddress;

    @Column(name = "SUPPLIER_CONTACT_NUMBER")
    private String supplierContactNumber;

    @Column(name = "SUPPLIER_STATE")
    private String supplierState;

    @Column(name = "SUPPLIER_DISTRICT")
    private String supplierDistrict;

    @Column(name = "SUPPLIER_PIN_CODE")
    private String supplierPinCode;

    @Column(name = "SUPPLIER_TYPE")
    private String supplierType;

}
