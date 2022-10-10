package com.inventory.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author rsoftware
 * Dated : 10/10/2022
 * This entity has contains user details.
 */
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "USER")
public class UserLogin implements Serializable {

    private static final long serialVersionUID = -6307192679802092879L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USER_ID")
    private Long userId;

    @Column(name = "USER_NAME", nullable = false)
    private String userName;

    @Column(name = "USER_EMAIL_ID", nullable = false)
    private String userEmailId;

    @Column(name = "USER_PASSWORD", nullable = false)
    private String userPassword;

    @Column(name = "USER_REGISTER_DATE", nullable = false)
    private String userRegisterDate;

    @Column(name = "LAST_LOGIN")
    private String lastLogin;

    @Column(name = "DEVICE_NAME")
    private String deviceName;

    @Column(name = "DEVICE_VERSION")
    private String deviceVersion;

    @Column(name = "REGISTER_LOCATION")
    private String registerLocation;

    @Column(name = "GSTIN_NUMBER")
    private String gstinNumber;

}
