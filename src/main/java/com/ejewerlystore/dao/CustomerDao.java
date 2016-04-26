package com.ejewerlystore.dao;

import com.ejewerlystore.model.Customer;

import java.util.List;


public interface CustomerDao {

    void addCustomer(Customer customer);

    Customer getCustomerById(int customerId);

    List<Customer> getAllCustomers();

    Customer getCustomerByUsername(String username);

}
