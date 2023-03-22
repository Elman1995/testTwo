package com.sesh.testTwo.service.impl;

import com.sesh.testTwo.entity.Contacts;
import com.sesh.testTwo.service.ContactService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@AllArgsConstructor
@Transactional(readOnly = true)
public class ContactServiceImpl implements ContactService {
    @Override
    public List<Contacts> getContacts() {
        return null;
    }

    @Override
    public Optional<Contacts> getContact(Long id) {
        return Optional.empty();
    }

    @Override
    @Transactional
    public void save(Contacts contacts) {

    }

    @Override
    @Transactional
    public void delete(Long id) {

    }

    @Override
    public Contacts findByFullName(String fullName) {
        return null;
    }

    @Override
    public Contacts findByBirthdate(String birthdate) {
        return null;
    }
}
