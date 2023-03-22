package com.sesh.testTwo.repository;

import com.sesh.testTwo.entity.PhoneNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneNumberRepository extends JpaRepository<PhoneNumber, Long> {
    PhoneNumber findByValue(String value);
}
