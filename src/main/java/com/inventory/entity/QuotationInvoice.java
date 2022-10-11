package com.inventory.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Transient;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author rsoftware
 * Dated : 10/10/2022
 * This entity has contains quotation details.
 */
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "QUOTATION_INVOICE")
public class QuotationInvoice implements Serializable {

    private static final long serialVersionUID = 806817123955120571L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "QUOTATION_ID")
    private Long quotationId;

    @Column(name = "CUSTOMER_ID", nullable = false)
    private Long customerId;//for getting customer name, address, phone, GSTIN no.

    @Transient
    private TransportDetails transportDetails;//getting transport id, transport name, vehicle number.

    @Column(name = "PRODUCT_ID", nullable = false)
    private Long productId;//product name, hsn number, rate, gst group

    @Column(name = "QUOTATION_NUMBER", nullable = false)
    private String quotationNumber;

    @Column(name = "PLACE_OF_SUPPLY")
    private String placeOfSupply;

    @Column(name = "QUOTATION_DATE", nullable = false)
    private String quotationDate;

    @Column(name = "LR_NUMBER")
    private String lrNumber;

    @Column(name = "QUOTATION_QUANTITY", nullable = false)
    private String quotationQuantity;

    @Column(name = "TAXABLE_AMOUNT", nullable = false)
    private Double taxableAmount;

    @Column(name = "SUB_TOTAL", nullable = false)
    private Double subTotal;

    @Column(name = "TOTAL_AMOUNT", nullable = false)
    private Double totalAmount;

}
