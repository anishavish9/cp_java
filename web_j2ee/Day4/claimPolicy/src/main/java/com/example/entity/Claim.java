package com.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "claim")
public class Claim {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(name = "claim_number")
    private String claimNumber;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "status")
    private String status;

    // Constructors, getters, setters, and toString() method
    public Claim() {}

    public Claim(String claimNumber, Double amount, String status) {
        this.claimNumber = claimNumber;
        this.amount = amount;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClaimNumber() {
        return claimNumber;
    }

    public void setClaimNumber(String claimNumber) {
        this.claimNumber = claimNumber;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Claim [id=" + id + ", claimNumber=" + claimNumber + ", amount=" + amount + ", status=" + status + "]";
    }
}
