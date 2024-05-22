package com.wipro.OneOneMapping.service;

import com.wipro.OneOneMapping.dto.PassportDto;
import com.wipro.OneOneMapping.dto.TravelerDto;
import com.wipro.OneOneMapping.model.Passport;
import com.wipro.OneOneMapping.model.Traveler;
import com.wipro.OneOneMapping.repository.PassportRepository;
import com.wipro.OneOneMapping.repository.TravelerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TravelerService {
    @Autowired
    private TravelerRepository travelerRepository;
    @Autowired
    private PassportRepository passportRepository;
    public TravelerDto addTraveler(TravelerDto travelerDto) {
        Traveler traveler = new Traveler();
        traveler.setName(travelerDto.getName());
        traveler.setTravelerEmail(travelerDto.getTravelerEmail());
        traveler.setTravelerPassword(travelerDto.getTravelerPassword());
        traveler.setTravelerPhone(travelerDto.getTravelerPhone());
        traveler.setTravelerAddress(travelerDto.getTravelerAddress());

        Passport passport = new Passport();
        passport.setPassportNumber(travelerDto.getPassport().getPassportNumber());
        passport.setCountryofissue(travelerDto.getPassport().getCountryofissue());
        passport.setDateofissue(travelerDto.getPassport().getDateofissue());
        passport.setDateofexpiry(travelerDto.getPassport().getDateofexpiry());
        passport.setVisainformation(travelerDto.getPassport().getVisainformation());

        passport.setTraveler(traveler);
        traveler.setPassport(passport);
        Traveler savedtraveler = travelerRepository.save(traveler);

        return mapToDto(savedtraveler);
    }

    private TravelerDto mapToDto(Traveler savedtraveler) {

            TravelerDto travelerDto = new TravelerDto();

            travelerDto.setName(savedtraveler.getName());
            travelerDto.setTravelerEmail(savedtraveler.getTravelerEmail());
            travelerDto.setTravelerPassword(savedtraveler.getTravelerPassword());
            travelerDto.setTravelerPhone(savedtraveler.getTravelerPhone());
            travelerDto.setTravelerAddress(savedtraveler.getTravelerAddress());
            PassportDto passportDto = new PassportDto();
            passportDto.setPassportNumber(savedtraveler.getPassport().getPassportNumber());
            passportDto.setCountryofissue(savedtraveler.getPassport().getCountryofissue());
            passportDto.setDateofissue(savedtraveler.getPassport().getDateofissue());
            passportDto.setDateofexpiry(savedtraveler.getPassport().getDateofexpiry());
            passportDto.setVisainformation(savedtraveler.getPassport().getVisainformation());
            travelerDto.setPassport(passportDto);
            return travelerDto;
    }
}
