package com.brian.users.persistance;

import org.springframework.data.repository.CrudRepository;


public interface UsersRepository extends CrudRepository<UserEntity, Long> {

}
