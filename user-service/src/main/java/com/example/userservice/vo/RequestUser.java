package com.example.userservice.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class RequestUser {
    @NotNull
    private String email;
    @NotNull
    private String name;
    @NotNull
    private String pwd;
}
