package com.EGclock.EGclock.Controller;

import com.EGclock.EGclock.Model.response.UserResponse;
import com.EGclock.EGclock.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/EGclock")
public class UserController {
    private final UserService userService;

    @GetMapping("/{brands}")
    public UserResponse getEGC(@PathVariable List<String> brands){
        return userService.getEGC(brands);

    }
}
