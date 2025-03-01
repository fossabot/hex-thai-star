package io.github.hexarchtraining.hts.awslambda;

import io.github.hexarchtraining.hts.booking.adapter.in.awslambda.ShowBookingsController;
import io.github.hexarchtraining.hts.booking.adapter.in.awslambda.common.Request;
import io.github.hexarchtraining.hts.booking.adapter.in.awslambda.common.Response;
import io.github.hexarchtraining.hts.booking.adapter.out.dynamodb.FindBookingsDynamoDbAdapter;
import io.github.hexarchtraining.hts.booking.usecase.ShowBookingsUseCase;

public class ShowBookingsRequestHandler extends AbstractRequestHandler {
    final ShowBookingsController controller = new ShowBookingsController(new ShowBookingsUseCase(new FindBookingsDynamoDbAdapter()));

    @Override
    protected Response handleRequest(Request request) {
        return controller.showTables(request);
    }
}
