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
 * This entity has contains purchase details.
 */
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PURCHASE_DETAILS")
public class PurchaseDetails implements Serializable {

    private static final long serialVersionUID = -7786491901793136150L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PURCHASE_ID")
    private Long purchaseId;

    @Column(name = "PRODUCT_ID", nullable = false)
    private Long productId;//for taking product name and gst details like gst group

    @Column(name = "SUPPLIER_ID")
    private Long supplierId;//for taking supplier name and any details

    @Column(name = "COMPANY_ID")
    private Long companyId;//for taking company name

    @Transient
    private TransportDetails transportDetails;

    @Column(name = "PURCHASE_ENTRY_DATE")
    private String purchaseEntryDate;

    @Column(name = "PAYMENT_TYPE")
    private String paymentType;

    @Column(name = "PURCHASE_TYPE")
    private String purchaseType;

    @Column(name = "QUOTATION_NUMBER")
    private String quotationNumber;

    @Column(name = "DELIVERY-CHALLAN_NUMBER")
    private String deliveryChallanNumber;

    @Column(name = "PURCHASE_QUANTITY")
    private String purchaseQuantity;

    @Column(name = "PURCHASE_WEIGHT")
    private Double purchaseWeight;

    @Column(name = "PURCHASE_LOADING_CHARGES")
    private Double purchaseLoadingCharges;

    @Column(name = "PURCHASE_OTHER_CHARGES")
    private Double purchaseOtherCharges;

    @Column(name = "PURCHASE_SUB_TOTAL_AMOUNT")
    private Double purchaseSubTotalAmount;

    @Column(name = "PURCHASE_TOTAL_AMOUNT")
    private Double purchaseTotalAmount;

    @Column(name = "PURCHASE_PAID_AMOUNT")
    private Double purchasePaidAmount;

    @Column(name = "PURCHASE_REMAINING_AMOUNT")
    private Double purchaseRemainingAmount;

    @Column(name = "PURCHASE_TAXABLE_AMOUNT")
    private Double purchaseTaxableAmount;

    @Column(name = "PURCHASE_ROUND_FIGURE_AMOUNT")
    private Double purchaseRoundFigureAmount;

    @Column(name = "PURCHASE_GRAND_TOTAL")
    private Double purchaseGrandTotal;

}
