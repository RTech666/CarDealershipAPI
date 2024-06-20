package com.pluralsight.dealership.dao;
import com.pluralsight.dealership.models.Contract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class ContractDataManager {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Contract> getAllContracts() {
        String sql = "SELECT * FROM sale_contracts";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Contract.class));
    }

    public List<Contract> getLastTenContracts() {
        String sql = "SELECT * FROM sale_contracts ORDER BY ContractDate DESC LIMIT 10";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Contract.class));
    }

    public void addContract(Contract contract) {
        String sql = "INSERT INTO sale_contracts (ID, ContractType, ContractDate, CustomerName, CustomerEmail, VehicleVIN, VehicleYear, VehicleMake, VehicleModel, VehicleType, VehicleColor, VehicleOdometer, VehiclePrice, TotalPrice, SalesTax, RecordingFee, ProcessingFee, LeaseFee, FinanceOption, MonthlyPayment) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql,
                contract.getID(),
                contract.getContractType(),
                contract.getDate(),
                contract.getName(),
                contract.getEmail(),
                contract.getVIN(),
                contract.getYear(),
                contract.getMake(),
                contract.getModel(),
                contract.getVehicleType(),
                contract.getColor(),
                contract.getOdometer(),
                contract.getPrice(),
                contract.getTotal(),
                contract.getTax(),
                contract.getRecordingFee(),
                contract.getProcessingFee(),
                contract.getLeaseFee(),
                contract.getFinanceOption(),
                contract.getMonthlyPayment()
            );
    }

    public Contract getContractById(int id) {
        String sql = "SELECT * FROM sale_contracts WHERE ID = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Contract.class), id);
    }

    public void updateContract(Contract contract) {
        String sql = "UPDATE sale_contracts SET ContractType = ?, ContractDate = ?, CustomerName = ?, CustomerEmail = ?, VehicleVIN = ?, VehicleYear = ?, VehicleMake = ?, VehicleModel = ?, VehicleType = ?, VehicleColor = ?, VehicleOdometer = ?, VehiclePrice = ?, TotalPrice = ?, SalesTax = ?, RecordingFee = ?, ProcessingFee = ?, LeaseFee = ?, FinanceOption = ?, MonthlyPayment = ? WHERE ID = ?";
        jdbcTemplate.update(sql,
                contract.getContractType(),
                contract.getDate(),
                contract.getName(),
                contract.getEmail(),
                contract.getVIN(),
                contract.getYear(),
                contract.getMake(),
                contract.getModel(),
                contract.getVehicleType(),
                contract.getColor(),
                contract.getOdometer(),
                contract.getPrice(),
                contract.getTotal(),
                contract.getTax(),
                contract.getRecordingFee(),
                contract.getProcessingFee(),
                contract.getLeaseFee(),
                contract.getFinanceOption(),
                contract.getMonthlyPayment(),
                contract.getID()
            );
    }

    public void deleteContract(int id) {
        String sql = "DELETE FROM sale_contracts WHERE ID = ?";
        jdbcTemplate.update(sql, id);
    }
}