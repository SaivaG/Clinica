package com.example.demo.models;


import org.springframework.security.core.GrantedAuthority;

import javax.validation.constraints.NotNull;

public enum Role implements GrantedAuthority {
    USER, DOCTOR, ADMIN;

    @Override
    public String getAuthority() {
        return name();
    }
//    private long id;
//    @NotNull
//    private String name;
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }



}

