package com.codehub.academy.input;

import com.codehub.academy.validator.InputValidator;

import java.util.Scanner;

public class InputHandler {

    private Scanner scanner = new Scanner(System.in);

    public String getLicencePlateFromInput() {

        System.out.println("---Please provide plate number in ABC-1234 pattern: ");

        String plateNumber = scanner.next();

        while (!InputValidator.validatePlateNumber(plateNumber)) {
            System.out.println(String.format("Provided plate %s does not match ABC-1234 format, please provide valid format plate: ", plateNumber));
            plateNumber = scanner.next();
        }
        return plateNumber;
    }
}
