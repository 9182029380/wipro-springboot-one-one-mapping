package com.wipro.OneOneMapping.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "passport")
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    public String passportNumber;
    public String countryofissue;
    public String dateofissue;
    public String dateofexpiry;
    public String visainformation;
    @OneToOne
    @JoinColumn(name = "traveler_id")
    public Traveler traveler;



}
