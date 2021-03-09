package com.brian.users.services;


import com.brian.users.persistance.UserDto;
import com.brian.users.persistance.UserEntity;
import com.brian.users.persistance.UsersRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    UsersRepository usersRepository;

    @InjectMocks
    UserService userService;

    @Test
    public void when_findId_that_exists_it_should_return_userDto(){
        UserEntity userEntity = new UserEntity(1, "bob",
                "smith", "bob@google.com", "password");
        when(usersRepository.findById(1L)).thenReturn(Optional.of(userEntity));
        assertThat(userService.findById(1L)).isEqualTo(
                new UserDto(1, "bob",
                "smith", "bob@google.com", "password"));
    }

    @Test
    void when_findId_that_does_NOT_exist_Throw_EntityNotFoundException(){
        when(usersRepository.findById(2L)).thenReturn(Optional.empty());

        assertThrows(EntityNotFoundException.class, ()->{
            userService.findById(2L);
        });
    }

}