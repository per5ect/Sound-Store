package com.Shoppingproject.Shopping.services.auth;

import com.Shoppingproject.Shopping.dto.SignupRequest;
import com.Shoppingproject.Shopping.dto.UserDto;

public interface AuthService {

    UserDto createUser(SignupRequest signupRequest);
    Boolean hasUserWithEmail(String email);


}
