package com.wipro.OneOneMapping.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "traveler")
public class Traveler {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String travelerEmail;
    private String travelerPassword;
    private String travelerPhone;
    private String travelerAddress;
    @OneToOne(mappedBy="traveler",cascade = CascadeType.ALL)
    private Passport passport;

}
