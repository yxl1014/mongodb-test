package edu.tute.yxl.dao;

import edu.tute.yxl.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {

    User findByName(String name);

    User findByNameAndAge(String name, Integer age);
}
