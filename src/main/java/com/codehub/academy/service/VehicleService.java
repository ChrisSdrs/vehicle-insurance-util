package com.codehub.academy.service;

import com.codehub.academy.model.Vehicle;
import com.codehub.academy.repository.VehicleRepository;
import com.codehub.academy.util.StringDateHelper;

import static com.codehub.academy.enumeration.MessageEnum.*;

public class VehicleService {

    public Vehicle checkVehicleStatus(String plateNumber) {
        VehicleRepository vehicleRepository = new VehicleRepository();

        Vehicle vehicle = vehicleRepository.getVehicleByPlateNumber(plateNumber);

        return vehicle;

    }

}
