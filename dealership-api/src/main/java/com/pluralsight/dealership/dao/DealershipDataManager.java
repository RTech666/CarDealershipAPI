package com.pluralsight.dealership.dao;
import com.pluralsight.dealership.models.Dealership;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class DealershipDataManager {
    // Initalize the variable, as private.
    @Autowired
    private JdbcTemplate jdbcTemplate;

    // Create getAllDealerships method.
    public List<Dealership> getAllDealerships() {
        String sql = "SELECT * FROM dealerships";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Dealership.class));
    }

    // Create addDealership method.
    public void addDealership(Dealership dealership) {
        String sql = "INSERT INTO dealerships (DealershipID, Name, Address, Phone) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, dealership.getDealershipID(), dealership.getName(), dealership.getAddress(), dealership.getPhone());
    }

    // Create getDealershipById method.
    public Dealership getDealershipById(int id) {
        String sql = "SELECT * FROM dealerships WHERE DealershipID = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Dealership.class), id);
    }

    // Create updateDealership method.
    public void updateDealership(Dealership dealership) {
        String sql = "UPDATE dealerships SET Name = ?, Address = ?, Phone = ? WHERE DealershipID = ?";
        jdbcTemplate.update(sql, dealership.getName(), dealership.getAddress(), dealership.getPhone(), dealership.getDealershipID());
    }

    // Create deleteDealership method.
    public void deleteDealership(int id) {
        String sql = "DELETE FROM dealerships WHERE DealershipID = ?";
        jdbcTemplate.update(sql, id);
    }
}