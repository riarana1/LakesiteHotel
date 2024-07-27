package com.awesomesoft.lakesite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.awesomesoft.lakesite.entities.BookedRoom;

import java.util.List;
import java.util.Optional;

/**
 * @author Awesomesoft
 */

public interface BookingRepository extends JpaRepository<BookedRoom, Long> {

    List<BookedRoom> findByRoomId(Long roomId);

 Optional<BookedRoom> findByBookingConfirmationCode(String confirmationCode);

    List<BookedRoom> findByGuestEmail(String email);
}
