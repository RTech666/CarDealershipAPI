package com.pluralsight.dealership.dao;
import com.pluralsight.dealership.models.Dealership;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DealershipDataManager {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Dealership> getAllDealerships() {
        String sql = "SELECT * FROM dealerships";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Dealership.class));
    }

    public void addDealership(Dealership dealership) {
        String sql = "INSERT INTO dealerships (DealershipID, Name, Address, Phone) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, dealership.getDealershipID(), dealership.getName(), dealership.getAddress(), dealership.getPhone());
    }

    public Dealership getDealershipById(int id) {
        String sql = "SELECT * FROM dealerships WHERE DealershipID = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Dealership.class), id);
    }

    public void updateDealership(Dealership dealership) {
        String sql = "UPDATE dealerships SET Name = ?, Address = ?, Phone = ? WHERE DealershipID = ?";
        jdbcTemplate.update(sql, dealership.getName(), dealership.getAddress(), dealership.getPhone(), dealership.getDealershipID());
    }

    public void deleteDealership(int id) {
        String sql = "DELETE FROM dealerships WHERE DealershipID = ?";
        jdbcTemplate.update(sql, id);
    }
}