package com.sesh.testTwo.service.impl;

import com.sesh.testTwo.entity.PhoneNumber;
import com.sesh.testTwo.service.PhoneNumberService;
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
public class PhoneNumberServiceImpl implements PhoneNumberService {
    @Override
    public List<PhoneNumber> getPhoneNumbers() {
        return null;
    }

    @Override
    public Optional<PhoneNumber> getPhoneNumber(Long id) {
        return Optional.empty();
    }

    @Override
    @Transactional
    public void save(PhoneNumber phoneNumber) {

    }

    @Override
    @Transactional
    public void delete(Long id) {

    }

    @Override
    public PhoneNumber findByValue(String value) {
        return null;
    }
}
