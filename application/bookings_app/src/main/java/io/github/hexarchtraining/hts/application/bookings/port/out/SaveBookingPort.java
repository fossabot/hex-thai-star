package io.github.hexarchtraining.hts.application.bookings.port.out;

import io.github.hexarchtraining.hts.domain.bookings.Booking;

public interface SaveBookingPort {

    void save(Booking booking);
}
