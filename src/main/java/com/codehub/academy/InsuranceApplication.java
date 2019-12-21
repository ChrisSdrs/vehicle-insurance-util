package com.codehub.academy;

import com.codehub.academy.input.InputHandler;
import com.codehub.academy.model.Vehicle;
import com.codehub.academy.service.InsuranceService;
import com.codehub.academy.service.VehicleService;

public class InsuranceApplication {

    public static void main(String[] args) {

        InputHandler inputHandler = new InputHandler();
        String licencePlate = inputHandler.getLicencePlateFromInput();

        VehicleService service = new VehicleService();
        Vehicle vehicle = service.checkVehicleStatus(licencePlate);

        InsuranceService insuranceService = new InsuranceService();
        String status = insuranceService.checkInsuranceStatus(vehicle);

        System.out.println(status);

    }
}
