package com.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "policy")
public class Policy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(name = "policy_number")
    private String policyNumber;

    @Column(name = "policy_holder")
    private String policyHolder;

    @Column(name = "coverage_amount")
    private Double coverageAmount;

    // Constructors, getters, setters, and toString() method
    public Policy() {}

    public Policy(String policyNumber, String policyHolder, Double coverageAmount) {
        this.policyNumber = policyNumber;
        this.policyHolder = policyHolder;
        this.coverageAmount = coverageAmount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getPolicyHolder() {
        return policyHolder;
    }

    public void setPolicyHolder(String policyHolder) {
        this.policyHolder = policyHolder;
    }

    public Double getCoverageAmount() {
        return coverageAmount;
    }

    public void setCoverageAmount(Double coverageAmount) {
        this.coverageAmount = coverageAmount;
    }

    @Override
    public String toString() {
        return "Policy [id=" + id + ", policyNumber=" + policyNumber + ", policyHolder=" + policyHolder + ", coverageAmount=" + coverageAmount + "]";
    }
}
