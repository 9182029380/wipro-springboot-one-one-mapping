package com.wipro.OneOneMapping.controller;

import com.wipro.OneOneMapping.dto.TravelerDto;
import com.wipro.OneOneMapping.service.TravelerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/traveler")
public class TravelerController {
    @Autowired
    private TravelerService travelerService;

    @PostMapping
    public TravelerDto addTraveler(@RequestBody TravelerDto travelerDto){
        return travelerService.addTraveler(travelerDto);
    }
    @GetMapping("/{id}")
    public TravelerDto getTravelerById(@PathVariable Long id){
        return travelerService.getTravelerById(id);
    }
    @PutMapping("/{id}")
    public TravelerDto updateTraveler(@PathVariable Long id,@RequestBody TravelerDto travelerDto){
        return travelerService.updateTraveler(id,travelerDto);
    }
    @DeleteMapping("/{id}")
    public void deleteTraveler(@PathVariable Long id){
        travelerService.deleteTraveler(id);
    }
}
