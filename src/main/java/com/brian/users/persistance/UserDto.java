package com.brian.users.persistance;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class UserDto {
    long id;
    String firstName;
    String lastName;
    String email;
    String password;
}
