package io.github.hexarchtraining.hts.bookings.port.in;

import lombok.Value;

@Value
public class ShowTablesResult {
    long id;
    int maxSeats;
}