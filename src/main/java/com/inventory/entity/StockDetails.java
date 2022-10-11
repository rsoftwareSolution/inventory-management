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
 * This entity has contains stock details.
 */
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "STOCK_DETAILS")
public class StockDetails implements Serializable {

    private static final long serialVersionUID = 8176747353251732815L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "STOCK_ID")
    private Long stockId;

    @Column(name = "PRODUCT_ID")
    private Long productId;

    @Transient
    private QuantityOfGoods quantity;

    @Column(name = "STORED_LOCATION")
    private String storedLocation;

    @Column(name = "RATE_OF_ONE_NOS")
    private Double rateOfOneNos;

    @Column(name = "TOTAL_VALUE")
    private Double totalValue;

}
