package com.wipro.OneOneMapping.controller;

import com.wipro.OneOneMapping.dto.TravelerDto;
import com.wipro.OneOneMapping.service.TravelerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/traveler")
public class TravelerController {
    @Autowired
    private TravelerService travelerService;

    @PostMapping
    public TravelerDto addTraveler(@RequestBody TravelerDto travelerDto){
        return travelerService.addTraveler(travelerDto);
    }
}
