package com.brian.users.controllers;

import com.brian.users.data.models.UserGetResponseModel;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


class UsersControllerTest {

    UsersController usersController = new UsersController();

    @Test
    public void contextLoads() throws Exception {
        assertThat(usersController).isNotNull();
    }

    @Test
    void getUser_isTrue_when_userExists(){

        ResponseEntity<UserGetResponseModel> responseEntity= usersController.getUser(1);
        System.out.println(responseEntity);
        assertNotNull(responseEntity, "response entity is null");
        assertEquals(responseEntity.getBody().getId(), 1);
    }


}