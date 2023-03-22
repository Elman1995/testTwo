package com.sesh.testTwo.service;

import com.sesh.testTwo.entity.PhoneNumber;
import java.util.List;
import java.util.Optional;

public interface PhoneNumberService {
    public List<PhoneNumber> getPhoneNumbers();

    public Optional<PhoneNumber> getPhoneNumber(Long id);

    public void save(PhoneNumber phoneNumber);

    public void delete(Long id);

    public PhoneNumber findByValue(String value);
}
