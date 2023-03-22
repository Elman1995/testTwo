package com.sesh.testTwo.service;

import com.sesh.testTwo.entity.Contacts;
import java.util.List;
import java.util.Optional;

public interface ContactService {
    public List<Contacts> getContacts();

    public Optional<Contacts> getContact(Long id);

    public void save(Contacts contacts);

    public void delete(Long id);

    public Contacts findByFullName(String fullName);

    public Contacts findByBirthdate(String birthdate);
}
