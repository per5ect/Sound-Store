package com.Shoppingproject.Shopping.services.cart;

import com.Shoppingproject.Shopping.dto.AddProductInCartDto;
import com.Shoppingproject.Shopping.dto.OrderDto;
import com.Shoppingproject.Shopping.dto.PlaceOrderDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CartService {
    ResponseEntity<?> addProductToCart(AddProductInCartDto addProductInCartDto);

    OrderDto getCardByUserId(Long userId);

    OrderDto increaseProductQuantity(AddProductInCartDto addProductInCartDto);

    OrderDto decreaseProductQuantity(AddProductInCartDto addProductInCartDto);

    OrderDto placeOrder(PlaceOrderDto placeOrderDto);

    List<OrderDto> getMyPlacedOrders(Long userId);
}
