/**
 * @author dixon
 *
 */
package com.dixon.springboot2crudh2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dixon.springboot2crudh2.model.Customer;

/**
 * @author dixon
 *
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
