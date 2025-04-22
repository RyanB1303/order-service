package com.polarbookshop.order_service.order.event;

public record OrderDispatchedMessage(
        Long orderId
) {
}
