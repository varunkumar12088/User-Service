package com.learning.user.dto;

import lombok.Data;

@Data
public class UserDto {


    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;
    private String role;
    // Additional fields can be added as needed
}
