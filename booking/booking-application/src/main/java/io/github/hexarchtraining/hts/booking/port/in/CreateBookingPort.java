package io.github.hexarchtraining.hts.booking.port.in;

/**
 * Books a table of given size and for given period of time.
 */
public interface CreateBookingPort {
    CreateBookingResult createBooking(CreateBookingCommand command);
}
