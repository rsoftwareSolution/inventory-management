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
 * This entity has contains bank details.
 */
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CUSTOMER_BANK_DETAILS")
public class CustomerBankDetails implements Serializable {

    private static final long serialVersionUID = -1040621401723312351L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CUSTOMER_BANK_ID")
    private Long customerBankId;

    @Column(name = "CUSTOMER_ID")
    private Long customerId;

    @Column(name = "CUSTOMER_BANK_NAME")
    private String customerBankName;

    @Column(name = "CUSTOMER_BANK_ACCOUNT_NUMBER")
    private String customerBankAccountNumber;

    @Column(name = "CUSTOMER_BANK_IFSC_CODE")
    private String customerBankIfscCode;

    @Column(name = "CUSTOMER_BANK_BRANCH")
    private String customerBankBranch;

    @Column(name = "CUSTOMER_BANK_PAN_NUMBER")
    private String customerBankPanNumber;

}
