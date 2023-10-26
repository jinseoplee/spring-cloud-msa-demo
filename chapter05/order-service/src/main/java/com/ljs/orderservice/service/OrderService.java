package com.ljs.orderservice.service;

import com.ljs.orderservice.dto.OrderDto;
import com.ljs.orderservice.entity.OrderEntity;

public interface OrderService {
    OrderDto createOrder(OrderDto orderDto);

    OrderDto getOrderByOrderId(String orderId);

    Iterable<OrderEntity> getOrderByUserId(String userId);
}
