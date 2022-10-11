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
 * This entity has contains product details.
 */
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PRODUCT_DETAILS")
public class ProductDetails implements Serializable {

    private static final long serialVersionUID = -694169952472326560L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PRODUCT_ID")
    private Long productId;

    @Column(name = "PRODUCT_NAME", nullable = false)
    private String productName;

    @Column(name = "PRODUCT_COMPANY_NAME")
    private String productCompanyName;

    @Column(name = "PRODUCT_DETAILS")
    private String productDetails;

    @Column(name = "MRP_RATE", nullable = false)
    private Double mrpRate;

    @Column(name = "SALE_RATE")
    private Double saleRate;

    @Column(name = "PURCHASE_RATE")
    private Double purchaseRate;

    @Column(name = "HSN_CODE")
    private String hsnCode;

}
