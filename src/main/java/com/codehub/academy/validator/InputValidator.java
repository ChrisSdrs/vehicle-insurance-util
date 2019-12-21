package com.codehub.academy.validator;

import java.util.regex.Pattern;

public class InputValidator {

    public static final String PLATE_NUMBER_FORMAT = "[ABEHIKMNOPTOXYZ]{3}-[0123456789]{4}";

    public static boolean validatePlateNumber(String plateNumber) {
        final Pattern pattern = Pattern.compile(PLATE_NUMBER_FORMAT);
        if (!pattern.matcher(plateNumber).matches()) {
            return false;
        }
        return true;
    }

}
