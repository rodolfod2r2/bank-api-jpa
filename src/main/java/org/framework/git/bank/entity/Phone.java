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
@Table(name = "phone")
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "phone_id")
    private long id;

    @Column(name = "phone_type")
    private String phoneType;

    @Column(name = "phone_preferred")
    private boolean PhonePreferred;

    @Column(name = "phone_phones")
    private String phones;

}
