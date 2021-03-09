package com.brian.users.services;

import com.brian.users.persistance.UserDto;
import com.brian.users.persistance.UserEntity;
import com.brian.users.persistance.UsersRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
public class UserService {
    private UsersRepository usersRepository;

    public UserService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }
    
    public UserDto findById(Long id){
          Optional<UserEntity> userEntityOpt=usersRepository.findById(id);

          if (userEntityOpt.isPresent()){
              UserDto userDto=new ModelMapper().map(
                      userEntityOpt.get(), UserDto.class);
              return userDto;
          } else {
              throw new EntityNotFoundException(id.toString());
          }
    }
}
