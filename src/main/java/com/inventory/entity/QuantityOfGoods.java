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
 * This entity has contains quantity of goods details.
 */
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "QUANTITY_OF_GOODS")
public class QuantityOfGoods implements Serializable {

    private static final long serialVersionUID = -1790506479827653856L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "QUANTITY_ID")
    private Long quantityId;

    @Column(name = "OPENING_BALANCE")
    private Double openingBalance;

    @Column(name = "CLOSING_BALANCE")
    private Double closingBalance;

    @Column(name = "PURCHASED")
    private String purchased;

    @Column(name = "SOLED")
    private String soled;

}
