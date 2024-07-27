package com.awesomesoft.lakesite.exceptions;

/**
 * @author Awesomesoft
 */

public class InternalServerException extends RuntimeException {
    public InternalServerException(String message) {
        super(message);
    }
}
