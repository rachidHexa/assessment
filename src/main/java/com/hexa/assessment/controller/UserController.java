package com.hexa.assessment.controller;

import com.hexa.assessment.myexception.ResourceNotFoundException;
import com.hexa.assessment.myexception.UnauthorizedException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/testExceptionHandling")
    public String testExceptionHandling(@RequestParam int code) {
        switch (code) {
            case 401:
                throw new UnauthorizedException("You are not authorized");
            case 404:
                throw new ResourceNotFoundException("resource not found");
            default:
                return "No Exception.";

        }
    }
    
}
