package org.softuni.fullstackapp.firstfullstackapp.web;

import lombok.AllArgsConstructor;
import org.softuni.fullstackapp.firstfullstackapp.exception.UserNotFoundException;
import org.softuni.fullstackapp.firstfullstackapp.models.entity.User;
import org.softuni.fullstackapp.firstfullstackapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {

    private UserRepository userRepository;

    @PostMapping("/user")
    User newUser(@RequestBody User newUser) {
        return userRepository.save(newUser);
    }

    @GetMapping("/users")
    List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/user/{id}")
    User getUserById(@PathVariable Long id){
        return userRepository
                .findById(id)
                .orElseThrow(()->new UserNotFoundException(id));
    }
    @PostMapping("/user/{id}")
    User updateUser(@RequestBody User newUser, @PathVariable Long id) {
        return userRepository.findById(id)
                .map(user -> {
                    if (newUser.getUsername() != null) {
                        user.setUsername(newUser.getUsername());
                    }
                    if (newUser.getPassword() != null) {
                        user.setPassword(newUser.getPassword());
                    }
                    if (newUser.getEmail() != null) {
                        user.setEmail(newUser.getEmail());
                    }

                    return userRepository.save(user);
                })
                .orElseThrow(() -> new UserNotFoundException(id));
    }

    @DeleteMapping("/user/{id}")
    String deleteUser(@PathVariable Long id){

        if(!userRepository.existsById(id)){
            throw new UserNotFoundException(id);
        }

        userRepository.deleteById(id);
        return "User with id:" + id + " deleted successfully.";
    }
}
