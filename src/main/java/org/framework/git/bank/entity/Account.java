package org.framework.git.bank.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "account_id")
    private long id;

    @Column(name = "account_banknumber")
    private String accountBankNumber;

    @Column(name = "account_number")
    private String accountNumber;

    @Column(name = "account_type")
    private String accountType;

    @Column(name = "account_create")
    private String accountCreate;

    @Column(name = "account_status")
    private String accountStatus;

    @Column(name = "account_creditlimit")
    private BigDecimal accountCreditLimit;

    @Column(name = "account_overdraftlimit")
    private BigDecimal accountOverdraftLimit;

    @Column(name = "account_onlinepay")
    private boolean accountOnlinePay;

    @Column(name = "account_mobilepay")
    private boolean accountMobilePay;

    @Column(name = "account_cashbackpay")
    private boolean accountCashBackPay;

    @Column(name = "account_overdraft")
    private boolean accountOverdraft;

    @ManyToOne
    @JoinColumn(name = "account_user_fk")
    private Person accountUser;

    @ManyToMany
    @JoinColumn(name = "account_bankaddress_fk")
    private List<Address> accountBankAddress;

    @ManyToMany
    @JoinColumn(name = "account_bankphones_fk")
    private List<Phone> accountBankPhones;

}