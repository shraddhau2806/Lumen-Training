package com.example.demo.model;

 

import org.hibernate.validator.constraints.Range;
import org.springframework.stereotype.Component;

 

import lombok.Data;

 

@Component
@Data
public class BloodDonor {
    
    @Range(min=11111,max=999999,message="Phone no should be 5 digit")
    long phoneNumber;
    String firstName;
    String bloodGroup;

 

}