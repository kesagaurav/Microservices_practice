package com.gaurav.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gaurav.model.Address;
@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
