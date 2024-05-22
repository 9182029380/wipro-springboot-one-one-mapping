package com.wipro.OneOneMapping.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PassportDto {
    public String passportNumber;
    public String countryofissue;
    public String dateofissue;
    public String dateofexpiry;
    public String visainformation;
}
