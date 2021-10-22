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
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "person_id")
    private long id;

    @Column(name = "person_idnational")
    private String idNational;

    @Column(name = "person_name")
    private String name;

    @Column(name = "person_gender")
    private String gender;

    @ManyToOne
    @JoinColumn(name = "person_addresses_fk")
    private Address addresses;

    @ManyToOne
    @JoinColumn(name = "person_phone_fk")
    private Phone phone;

}