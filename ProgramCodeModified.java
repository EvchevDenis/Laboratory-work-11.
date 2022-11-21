/**
* Package info
*/
package com.nuop.mobileProject.model.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSettings {

  /**
  * userRepository
  */
  private final UserRepository userRepository;

  /**
  * public UserSettings method
  */
  @Autowired
  public final UserSettings(final UserRepository repository) {
    this.repository = userRepository;
  }

  /**
  * public createUser method
  */
  public final User createUser(final UserForm userForm) {

    User user = new User();

    user.setName(userForm.getName());
    user.setSurname(userForm.getSurname());
    user.setEmail(userForm.getEmail());
    user.setEmail(userForm.getMobile());

    return user;
  }

  /**
  * public saveUser method
  */
  public User saveUser(final User user) {
    return userRepository.save(user);
  }

  /**
  * public getAllUsers method
  */
  public List<User> getAllUsers() {
    return userRepository.findAll();
  }
}
