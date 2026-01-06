package com.xworkz.jdbcDto.internal;

import com.xworkz.jdbcDto.dto.AjayDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AjayDetails {

    String url = "jdbc:mysql://localhost:3306/Ajay_db";
    String username = "root";
    String password = "root";
    String query = "insert into ajay_tb values (?,?,?,?,?,?,?,?)";
    int rows;

    public int addAjayDetails(AjayDto dto){

        try {
            Connection connection = DriverManager.getConnection(url,username,password);
            PreparedStatement ps = connection.prepareStatement(query);

            ps.setInt(1,dto.getId());
            ps.setString(2,dto.getName());
            ps.setInt(3,dto.getSerialNumber());
            ps.setLong(4,dto.getPhoneNumber());
            ps.setDouble(5,dto.getPercentage());
            ps.setFloat(6,dto.getPassingRate());
            ps.setBoolean(7,dto.isRegular());
            ps.setString(8, String.valueOf(dto.getAcademicRating()));
            rows = ps.executeUpdate();

            if (rows==1){
                System.out.println("Update Success & rows affected : "+rows);
            }


        } catch (SQLException e){
            e.printStackTrace();
        }
        return rows;
    }

}
