package io.github.hexarchtraining.hts.application.bookings.port.in;

/**
 * Books a table of given size and for given period of time.
 */
public interface CreateBookingUseCase {
    void createBooking(CreateBookingCommand command);
}