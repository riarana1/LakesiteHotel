package com.awesomesoft.lakesite.exceptions;

/**
 * @author Awesomesoft
 */

public class RoleAlreadyExistException extends RuntimeException {
    public RoleAlreadyExistException(String message) {
        super(message);
    }
}
