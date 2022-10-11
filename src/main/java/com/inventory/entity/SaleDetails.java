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
 * This entity has contains sale details.
 */
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "SALE_DETAILS")
public class SaleDetails implements Serializable {

    private static final long serialVersionUID = 2561569746881818366L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "SALE_ID")
    private Long saleId;

    @Column(name = "PRODUCT_ID", nullable = false)
    private Long productId;//for taking product name and gst details like gst group

    @Column(name = "SUPPLIER_ID")
    private Long supplierId;//for taking supplier name and any details

    @Column(name = "COMPANY_ID")
    private Long companyId;//for taking company name

    @Transient
    private TransportDetails transportDetails;

    @Column(name = "SALE_ENTRY_DATE")
    private String saleEntryDate;

    @Column(name = "SALE_PAYMENT_TYPE")
    private String salePaymentType;

    @Column(name = "SALE_TYPE")
    private String saleType;

    @Column(name = "SALE_QUOTATION_NUMBER")
    private String saleQuotationNumber;

    @Column(name = "SALE_DELIVERY_CHALLAN_NUMBER")
    private String saleDeliveryChallanNumber;

    @Column(name = "SALE_QUANTITY")
    private String saleQuantity;

    @Column(name = "SALE_WEIGHT")
    private Double saleWeight;

    @Column(name = "SALE_LOADING_CHARGES")
    private Double saleLoadingCharges;

    @Column(name = "SALE_OTHER_CHARGES")
    private Double saleOtherCharges;

    @Column(name = "SALE_SUB_TOTAL_AMOUNT")
    private Double saleSubTotalAmount;

    @Column(name = "SALE_TOTAL_AMOUNT")
    private Double saleTotalAmount;

    @Column(name = "SALE_PAID_AMOUNT")
    private Double salePaidAmount;

    @Column(name = "SALE_REMAINING_AMOUNT")
    private Double saleRemainingAmount;

    @Column(name = "SALE_TAXABLE_AMOUNT")
    private Double saleTaxableAmount;

    @Column(name = "SALE_ROUND_FIGURE_AMOUNT")
    private Double saleRoundFigureAmount;

    @Column(name = "SALE_GRAND_TOTAL")
    private Double saleGrandTotal;

}
