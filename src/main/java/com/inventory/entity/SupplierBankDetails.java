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
 * This entity has contains supplier bank details.
 */
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "SUPPLIER_BANK_DETAILS")
public class SupplierBankDetails implements Serializable {

    private static final long serialVersionUID = -4689050470956663476L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "SUPPLIER_BANK_ID")
    private Long supplierBankId;

    @Column(name = "SUPPLIER_ID")
    private Long supplierId;

    @Column(name = "SUPPLIER_BANK_NAME")
    private String supplierBankName;

    @Column(name = "SUPPLIER_BANK_ACCOUNT_NUMBER")
    private String supplierBankAccountNumber;

    @Column(name = "SUPPLIER_BANK_IFSC_CODE")
    private String supplierBankIfscCode;

    @Column(name = "SUPPLIER_BANK_BRANCH")
    private String supplierBankBranch;

    @Column(name = "SUPPLIER_PAN_NUMBER")
    private String supplierPanNumber;

}
