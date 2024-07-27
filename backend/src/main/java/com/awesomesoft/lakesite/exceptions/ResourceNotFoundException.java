package com.awesomesoft.lakesite.exceptions;

/**
 * @author Awesomesoft
 */

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
