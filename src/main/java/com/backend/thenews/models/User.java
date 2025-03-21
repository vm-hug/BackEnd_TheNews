package com.backend.thenews.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {
    private long id ;
    private String username;
    private String password;
    private String email;

}
