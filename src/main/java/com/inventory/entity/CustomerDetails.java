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
import javax.persistence.Transient;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

/**
 * @author rsoftware
 * Dated : 10/10/2022
 * This entity has store customer details.
 */
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CUSTOMER_DETAILS")
public class CustomerDetails implements Serializable {

    private static final long serialVersionUID = -4286189283657327909L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CUSTOMER_ID", nullable = false)
    private Long customerId;

    @Column(name = "CUSTOMER_NAME", nullable = false)
    private String customerName;

    @Transient
    private Address customerAddress;

    @Column(name = "CONTACT_NUMBER", nullable = false)
    private String customerContactNumber;

    @Column(name = "EMAIL", nullable = false)
    private String customerEmail;

    @Column(name = "CUSTOMER_TYPE")
    private String customerType;

    @Column(name = "CUSTOMER_GST_NUMBER")
    private String customerGstNumber;

}
