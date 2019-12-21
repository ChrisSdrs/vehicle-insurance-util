package com.codehub.academy.repository;

import com.codehub.academy.mapper.VehicleMapper;
import com.codehub.academy.model.Vehicle;
import com.codehub.academy.util.DBConnectionFactory;

import java.sql.*;

public class VehicleRepository {

    private VehicleMapper mapper = new VehicleMapper();
    private Connection connection = DBConnectionFactory.getConnection();

    private final String GET_VEHICLE_BY_PLATE_NUMBER_QUERY = "SELECT A.PLATE_NUMBER, B.EXPIRY_DATE, C.OWNER_ID  " +
            "FROM VEHICLE A, INSURANCE B, OWNER C " +
            "WHERE A.INSURANCE_ID = B.INSURANCE_ID AND A.OWNER_ID = C.OWNER_ID AND A.PLATE_NUMBER=?";


    public Vehicle getVehicleByPlateNumber(String plateNumber) {

        try {
            PreparedStatement stmt = connection.prepareStatement(GET_VEHICLE_BY_PLATE_NUMBER_QUERY);
            stmt.setString(1, plateNumber);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return mapper.mapVehicleToRs(rs);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
