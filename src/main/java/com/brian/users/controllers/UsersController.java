package com.brian.users.controllers;

import com.brian.users.data.models.NewUserRequestModel;
import com.brian.users.data.models.NewUserResponseModel;
import com.brian.users.data.models.UserGetResponseModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("users")
public class UsersController {




    @PostMapping( value = "/",
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE },
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    ResponseEntity<NewUserResponseModel> createNewUser(@RequestBody
                                                       NewUserRequestModel newUserInfo){
        return new ResponseEntity<>(new NewUserResponseModel(1, "bob",
                "smith", "bob@bob.com"), HttpStatus.OK);

    }


    //get user with id
    @GetMapping(value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE },
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    @ResponseBody
    public ResponseEntity<UserGetResponseModel> getUser(@PathVariable long id) {
          return new ResponseEntity<>(new UserGetResponseModel(1, "bob",
                  "smith", "bob@bob.com"), HttpStatus.OK);
    }

//    @PostMapping( value = "/")
//    @ResponseBody
//    public ResponseEntity<UserPostResponseModel>{
//        return new ResponseEntity<>(new UserPostResponseModel, HttpStatus.OK);
//    }

}
