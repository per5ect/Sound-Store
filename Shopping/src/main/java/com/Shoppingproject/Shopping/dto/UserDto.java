package com.Shoppingproject.Shopping.dto;

import com.Shoppingproject.Shopping.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String email;
    private String name;
    private UserRole userRole;
}
