package com.brian.users.persistance;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Objects;

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

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDto userDto = (UserDto) o;
        return id == userDto.id && firstName.equals(userDto.firstName) &&
                lastName.equals(userDto.lastName) &&
                email.equals(userDto.email) &&
                password.equals(userDto.password);
    }

    @Override public int hashCode() {
        return Objects.hash(id, firstName, lastName, email, password);
    }
}
