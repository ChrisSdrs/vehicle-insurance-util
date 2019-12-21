package com.codehub.academy.enumeration;

public enum MessageEnum {

    VALID_INSURANCE("The vehicle has valid insurance expiring on: %s"),
    INVALID_INSURANCE("The vehicle's insurance expired on: %s"),
    NO_RECORDS_FOUND("There are no records for the provided plate number");

    private final String message;

    MessageEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
