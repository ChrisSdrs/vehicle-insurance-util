package com.codehub.academy.mapper;

import com.codehub.academy.model.Vehicle;

import java.sql.ResultSet;
import java.sql.SQLException;

public class VehicleMapper {

    private static final String PLATE_NUMBER = "PLATE_NUMBER";
    private static final String EXPIRY_DATE = "EXPIRY_DATE";
    private static final String OWNER_ID = "OWNER_ID";

    public Vehicle mapVehicleToRs(ResultSet resultSet) throws SQLException {
        return new Vehicle(
                resultSet.getString(PLATE_NUMBER),
                resultSet.getString(EXPIRY_DATE),
                resultSet.getInt(OWNER_ID)
        );
    }

}
