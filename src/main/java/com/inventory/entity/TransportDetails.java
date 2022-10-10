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
 * This entity has contains transport details.
 */
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TRANSPORT_DETAILS")
public class TransportDetails implements Serializable {

    private static final long serialVersionUID = 7259484079752913422L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TRANSPORT_ID")
    private Long transportId;

    @Column(name = "DELIVERY_CHALLAN_ID")
    private Long deliveryChallanId;

    @Column(name = "TRANSPORT_NAME")
    private String transportName;

    @Column(name = "TRANSPORT_ADDRESS")
    private String transportAddress;

    @Column(name = "TRANSPORT_CONTACT_NUMBER")
    private String transportContactNumber;

    @Column(name = "DRIVER_CONTACT_NUMBER")
    private String driverContactNumber;

    @Column(name = "VEHICLE_NUMBER")
    private String vehicleNumber;

}
