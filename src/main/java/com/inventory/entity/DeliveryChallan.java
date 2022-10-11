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
 * This entity has contains delivery challan details.
 */
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "DELIVERY_CHALLAN")
public class DeliveryChallan implements Serializable {

    private static final long serialVersionUID = 3814023133819751531L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "DELIVERY_CHALLAN_ID")
    private Long deliveryChallanId;

    @Column(name = "PRODUCT_ID")
    private Long productId;//for getting delivery product details

    @Column(name = "CUSTOMER_ID")
    private Long customerId;//getting customer details

    @Column(name = "COMPANY_ID")
    private Long companyId;//getting company details like name, address, phone, GSTIN

    @Column(name = "ORDER_DATE")
    private String orderDate;

    @Column(name = "DELIVERY_DATE")
    private String deliveryDate;

    @Column(name = "DISPATCH_DATE")
    private String dispatchDate;

    @Column(name = "PLACE_OF_SUPPLY")
    private String placeOfSupply;

    @Column(name = "QUANTITY")
    private String quantity;

    @Column(name = "TAXABLE_VALUE")
    private String taxableValue;

    @Column(name = "CGST")
    private Double cgst;

    @Column(name = "SGST")
    private Double sgst;

    @Column(name = "IGST")
    private Double igst;

    @Column(name = "SUB_TOTAL")
    private Double subTotal;

    @Column(name = "TOTAL_TAX")
    private Double totalTax;

    @Column(name = "ROUND_OFF")
    private Double roundOff;

    @Column(name = "GRAND_TOTAL")
    private String grandTotal;

}
