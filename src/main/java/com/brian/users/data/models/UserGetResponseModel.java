package com.brian.users.data.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserGetResponseModel {
    long id;
    String firstName;
    String lastName;
    String email;

}
