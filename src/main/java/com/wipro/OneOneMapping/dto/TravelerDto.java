package com.wipro.OneOneMapping.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TravelerDto {
    private String name;
    private String travelerEmail;
    private String travelerPassword;
    private String travelerPhone;
    private String travelerAddress;
    private PassportDto passport;
}
