package com.inventory.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@ToString
@Getter
@Setter
@Table(name = "CUSTOMER")
@AllArgsConstructor
@NoArgsConstructor
public class Customer implements Serializable {

    private static final long serialVersionUID = -4286189283657327909L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CUSTOMER_ID")
    private Long customerId;

    @Column(name = "CUSTOMER_NAME")
    private String customerName;

}
