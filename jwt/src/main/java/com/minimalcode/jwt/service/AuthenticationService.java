package com.minimalcode.jwt.service;

import com.minimalcode.jwt.DTO.AuthenticationRequest;
import com.minimalcode.jwt.DTO.AuthenticationResponse;
import com.minimalcode.jwt.DTO.RegisterRequest;

public interface AuthenticationService {
    AuthenticationResponse register(RegisterRequest request);

    AuthenticationResponse authenticate(AuthenticationRequest request);
}
