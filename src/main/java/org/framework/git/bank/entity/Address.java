package org.framework.git.bank.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "address_id")
    private long id;

    @Column(name = "address_type")
    private String addressType;

    @Column(name = "address_preferred")
    private boolean addressPreferred;

    @Column(name = "address_postalcode")
    private String postalCode;

    @Column(name = "address_streetLine1")
    private String streetLine1;

    @Column(name = "address_streetLine2")
    private String streetLine2;

    @Column(name = "address_streetLine3")
    private String streetLine3;

    @Column(name = "address_streetLine4")
    private String streetLine4;

    @Column(name = "address_city")
    private String city;

    @Column(name = "address_state")
    private String state;

    @Column(name = "address_country")
    private String country;

}
