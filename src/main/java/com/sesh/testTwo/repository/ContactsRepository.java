package com.sesh.testTwo.repository;

import com.sesh.testTwo.entity.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactsRepository extends JpaRepository<Contacts, Long> {
    Contacts findByFullName(String fullName);
    Contacts findByBirthdate(String birthdate);
}
