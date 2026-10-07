package com.app.daos;



import java.util.List;

//DAO = Data Access Object

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojos.Customer;


@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer> // Integer is an wrapper class, Id should always be wrapper class. 
{
	
	Customer findByUserid(String userid);
	
	List<Customer> findByCity(String city);
	
	
	
}
