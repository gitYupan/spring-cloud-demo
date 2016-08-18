package com.gavin.service;

import com.gavin.model.order.OrderModel;

import java.util.List;

public interface OrderService {

    Long createOrder(OrderModel orderModel);

    OrderModel searchOrderById(Long orderId);

    List<OrderModel> searchOrdersByAccountId(Long accountId);
}