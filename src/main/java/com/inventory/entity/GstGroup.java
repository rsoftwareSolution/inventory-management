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

/**
 * @author rsoftware
 * Dated : 10/10/2022
 * This entity has contains gst group details.
 */
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "GST_GROUP")
public class GstGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "GST_GROUP_ID")
    private Long gstGroupId;

    @Column(name = "PRODUCT_ID")
    private Long productId;

    @Column(name = "GST_GROUP_NAME")
    private String gstGroupName;

    @Column(name = "GST_PERCENTAGE")
    private String gstPercentage;

    @Column(name = "IGST_PERCENTAGE")
    private String igstPercentage;

    @Column(name = "SGST_PERCENTAGE")
    private String sgstPercentage;

    @Column(name = "CGST_PERCENTAGE")
    private String cgstPercentage;

}
