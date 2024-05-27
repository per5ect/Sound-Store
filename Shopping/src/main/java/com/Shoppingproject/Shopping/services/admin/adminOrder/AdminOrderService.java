package com.Shoppingproject.Shopping.services.admin.adminOrder;

import com.Shoppingproject.Shopping.dto.OrderDto;

import java.util.List;

public interface AdminOrderService {
    List<OrderDto> getAllPlacedOrders();

    OrderDto changeOrderStatus(Long orderId, String status);
}
