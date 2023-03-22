package com.sesh.testTwo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "phoneNumber")
public class PhoneNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "phoneNumberValue")
    private String value;

    @Column(name = "isActive")
    private boolean isActive;

    @ManyToOne (cascade=CascadeType.ALL)
    @JoinColumn (name="phoneNumbers")
    private Contacts contact;

}
