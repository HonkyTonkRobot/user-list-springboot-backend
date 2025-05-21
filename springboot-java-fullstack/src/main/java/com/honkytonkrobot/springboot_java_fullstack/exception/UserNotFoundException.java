package com.honkytonkrobot.springboot_java_fullstack.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("Could not found the user with id"+ id);
    }
}
