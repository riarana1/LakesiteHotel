package com.awesomesoft.lakesite.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * @author Awesomesoft
 */
@Data
public class LoginRequest {
    @NotBlank
    private String email;
    @NotBlank
    private String password;
}
