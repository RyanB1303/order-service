package com.polarbookshop.order_service.order.event;

public record OrderAcceptedMessage(
        Long orderId
) {
}
