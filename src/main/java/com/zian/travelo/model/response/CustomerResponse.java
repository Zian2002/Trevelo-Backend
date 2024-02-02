package com.zian.travelo.model.response;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class CustomerResponse {
    private Long id;
    private String name;
    private String email;
    private String phone;
}
