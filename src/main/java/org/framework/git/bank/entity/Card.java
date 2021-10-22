package org.framework.git.bank.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Card_id")
    private long id;

    @Column(name = "card_number")
    private String cardNumber;

    @Column(name = "card_password")
    private String cardPassword;

    @Column(name = "card_type")
    private String cardType;

    @Column(name = "card_create")
    private String cardCreate;

    @Column(name = "card_status")
    private String cardStatus;

    @Column(name = "card_creditlimit")
    private BigDecimal cardCreditLimit;

    @Column(name = "card_overdraftlimit")
    private BigDecimal cardOverdraftLimit;

    @Column(name = "card_onlinepay")
    private boolean cardOnlinePay;

    @Column(name = "card_mobilepay")
    private boolean cardMobilePay;

    @Column(name = "card_cashbackpay")
    private boolean cardCashBackPay;

    @Column(name = "card_overdraft")
    private boolean cardOverdraft;

    @ManyToOne
    @JoinColumn(name = "card_user_fk")
    private Person user;

    @ManyToOne
    @JoinColumn(name = "card_account_fk")
    private Account account;

}