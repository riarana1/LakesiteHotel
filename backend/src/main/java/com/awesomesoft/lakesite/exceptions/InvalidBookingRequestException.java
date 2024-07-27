package com.awesomesoft.lakesite.exceptions;

/**
 * @author Awesomesoft
 */

public class InvalidBookingRequestException extends RuntimeException {
    public InvalidBookingRequestException(String message) {
        super(message);
    }
}
