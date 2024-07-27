package com.awesomesoft.lakesite.exceptions;

/**
 * @author Awesomesoft
 */

public class UserAlreadyExistsException extends RuntimeException{
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}
