package com.zian.travelo.model.response;

import com.zian.travelo.entity.Role;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AuthenticationResponse {
    private String email;
    private String role;
    private String type = "Bearer";
    private String token;
}
