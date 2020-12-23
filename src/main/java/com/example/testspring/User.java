package com.example.testspring;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {

    private String userId;
    private String name;
    private String authType;

    public User(String userId, String userName, String authType) {
        this.userId = userId;
        this.name = userName;
        this.authType = authType;
    }
}
