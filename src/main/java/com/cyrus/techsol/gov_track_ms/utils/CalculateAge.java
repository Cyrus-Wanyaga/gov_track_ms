package com.cyrus.techsol.gov_track_ms.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CalculateAge {

    @NonNull
    public String getAge(@NonNull Date dateOfBirth){
        Date date = new Date();
        int currentYear = date.getYear();
        int birthYear = dateOfBirth.getYear();
        if (date.getMonth() < dateOfBirth.getMonth()) {
            return Integer.toString((currentYear - birthYear) - 1);
        } else {
            return Integer.toString(currentYear - birthYear);
        }
    }

}
