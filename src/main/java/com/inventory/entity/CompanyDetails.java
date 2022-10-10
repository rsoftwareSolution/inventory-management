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
 * This entity has contains company details.
 */
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "COMPANY_DETAILS")
public class CompanyDetails implements Serializable {

    private static final long serialVersionUID = 520719604144197018L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "COMPANY_ID")
    private Long companyId;

    @Column(name = "COMPANY_NAME")
    private String companyName;

    @Column(name = "COMPANY_ADDRESS")
    private String companyAddress;

    @Column(name = "COMPANY_CONTACT_NUMBER")
    private String companyContactNumber;

    @Column(name = "GST_NUMBER")
    private String gstNumber;

}
