package com.awesomesoft.lakesite.services;

import com.awesomesoft.lakesite.entities.BookedRoom;

import java.util.List;

/**
 * @author Awesomesoft
 */

public interface IBookingService {
    void cancelBooking(Long bookingId);

    List<BookedRoom> getAllBookingsByRoomId(Long roomId);

    String saveBooking(Long roomId, BookedRoom bookingRequest);

    BookedRoom findByBookingConfirmationCode(String confirmationCode);

    List<BookedRoom> getAllBookings();

    List<BookedRoom> getBookingsByUserEmail(String email);
}
