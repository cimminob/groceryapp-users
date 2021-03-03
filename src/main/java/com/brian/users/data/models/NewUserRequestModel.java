package com.brian.users.data.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NewUserRequestModel {
//    id will be generated automatically

    @NotNull(message="must enter first name")
    @Size(min=0, max=30)
    private String firstName;

    @NotNull(message="must enter last name")
    @Size(min=0, max=30)
    private String lastName;

    @NotNull(message="must enter last name")
    private String email;

    @NotNull(message="must enter password")
    @Size(min=8, max=30)
    private String password;
}
