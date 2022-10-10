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
 * This entity has contains address details.
 */
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ADDRESS")
public class Address implements Serializable {

    private static final long serialVersionUID = -8201659146291201951L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ADDRESS_ID")
    private Long addressId;

    @Column(name = "CUSTOMER_ID")
    private Long customerId;

    @Column(name = "STATE")
    private String state;

    @Column(name = "DISTRICT")
    private String district;

    @Column(name = "HOUSE_NUMBER_OR_BUILDING_NAME")
    private String houseNumberOrBuildingName;

    @Column(name = "ROAD_NAME_OR_AREA")
    private String rodeNameOrArea;

    @Column(name = "LANDMARK")
    private String landmark;

    @Column(name = "PIN_CODE")
    private String pinCode;

}
