package com.EGclock.EGclock.Model.response;

import com.EGclock.EGclock.Service.UserService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserResponse {
    private LocalTime openTime;
    private LocalTime closeTime;
    private String location;
    private List<String> brands;
}
