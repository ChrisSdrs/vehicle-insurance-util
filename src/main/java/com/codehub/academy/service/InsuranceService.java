package com.codehub.academy.service;

import com.codehub.academy.model.Vehicle;
import com.codehub.academy.util.StringDateHelper;

import static com.codehub.academy.enumeration.MessageEnum.*;

public class InsuranceService {

    public String checkInsuranceStatus(Vehicle vehicle) {

        if (vehicle != null && vehicle.getPlateNumber() != null) {
            String expiryDate = vehicle.getInsuranceDate();
            if (StringDateHelper.isExpiredInsurance(expiryDate)) {
                return String.format(VALID_INSURANCE.getMessage(), expiryDate);
            } else {
                return String.format(INVALID_INSURANCE.getMessage(), expiryDate);
            }
        } else {
            return NO_RECORDS_FOUND.getMessage();
        }

    }
}

