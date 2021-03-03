package com.brian.users.persistance;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
    long id;
    String firstName;
    String lastName;
    String email;
    String password;

}