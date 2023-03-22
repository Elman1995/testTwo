package com.sesh.testTwo.controllers;

import com.sesh.testTwo.entity.Contacts;
import com.sesh.testTwo.service.ContactService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class ContactRESTController {

    private ContactService contactService;

    @GetMapping("/contacts")
    public ResponseEntity<List<Contacts>> getContact() {
        log.info("Обработка запроса на получение всех контактов");
        return new ResponseEntity<>(contactService.getContacts(), HttpStatus.OK);
    }

    @GetMapping("/contact")
    public ResponseEntity<Contacts> getContact(@RequestParam Long id) {
        log.info("Обработка запроса на получение контакта по id - " + id.toString());
        return new ResponseEntity<>(contactService.getContact(id).get(), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> createContact(@RequestBody Contacts contacts){
        log.info("Обработка запроса на сохранение нового контакта");
        contactService.save(contacts);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/contacts")
    public ResponseEntity<?> updateContact(@RequestBody Contacts contacts, Long id){
        log.info("Обработка запроса на обновление контакта по id - " + contacts.getId().toString());
        contactService.save(contacts);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/contactsSearchFN")
    public ResponseEntity<Contacts> getContactSearchFN(@RequestParam String fullName) {
        log.info("Обработка запроса на поиск контакта по ФИО - " + fullName);
        return new ResponseEntity<>(contactService.findByFullName(fullName), HttpStatus.OK);
    }

    @GetMapping("/contactsSearchBD")
    public ResponseEntity<Contacts> getContactSearchBD(@RequestParam String birthdate) {
        log.info("Обработка запроса на поиск контакта по дате рождения - " + birthdate);
        return new ResponseEntity<>(contactService.findByBirthdate(birthdate), HttpStatus.OK);
    }

}
