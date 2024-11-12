package com.EGclock.EGclock.Service;

import com.EGclock.EGclock.Model.response.UserResponse;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.List;

@Service
public class UserService {
    public UserResponse getEGC(List<String> brands){
        System.out.println("Axtardiqiniz brendler;"+brands);
        return UserResponse.builder()
                .openTime(LocalTime.of(10,00))
                .closeTime(LocalTime.of(22,00))
                .location("Elmler Akademiyasi")
                .brands(List.of("ROLEX","OMEGA","HUBLOT","CARTIER","LONGINES","BREITLING"))
                .build();
    }
}
