package org.softuni.fullstackapp.firstfullstackapp.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id) {
        super("User with id:" + id + " doesn't exist.");
    }
}
