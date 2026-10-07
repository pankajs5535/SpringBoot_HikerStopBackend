package com.app.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojos.Address;

@Repository
public interface AddressDao extends JpaRepository<Address, Integer> {

}

/*
 * 
 * DAO (Data Access Object): Purpose: The primary purpose of DAO is to abstract
 * and encapsulate the interaction with the underlying data source, such as a
 * database. It provides a layer of separation between the business logic and
 * the data access logic. Responsibilities: DAOs typically contain methods for
 * CRUD (Create, Read, Update, Delete) operations on entities. They handle the
 * details of querying and updating the database, allowing the rest of the
 * application to work with higher-level business objects. Example: In a Spring
 * Boot application, you might have a UserDAO that contains methods like
 * saveUser, findUserById, deleteUser, etc., for managing user-related data in
 * the database.
 * 
 * 
 */