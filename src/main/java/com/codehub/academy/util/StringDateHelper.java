package com.codehub.academy.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringDateHelper {

    public static final String DATE_FORMAT = "d/M/yyyy";

    public static boolean isExpiredInsurance(String stringDate) {
        return LocalDate.parse(stringDate, DateTimeFormatter.ofPattern(DATE_FORMAT)).compareTo(LocalDate.now()) > 0;
    }

}
