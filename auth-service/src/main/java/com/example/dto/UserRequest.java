package com.example.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
    String email;
    int id;
    String name;
    String role;
    String password;
    String address;
    String addressType;
    String phoneNumber;
}
