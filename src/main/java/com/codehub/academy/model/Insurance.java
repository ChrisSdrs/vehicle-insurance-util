package com.codehub.academy.model;

import java.time.LocalDate;

public class Insurance {

    private int insuranceId;

    private LocalDate expiryDate;

    public Insurance(int insuranceId, LocalDate expiryDate) {
        this.insuranceId = insuranceId;
        this.expiryDate = expiryDate;
    }

    public int getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(int insuranceId) {
        this.insuranceId = insuranceId;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }
}
