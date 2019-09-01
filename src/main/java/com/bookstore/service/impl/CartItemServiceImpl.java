package com.bookstore.service.impl;

import com.bookstore.domain.CartItem;
import com.bookstore.domain.ShoppingCart;
import com.bookstore.service.CartItemService;

import java.util.List;

public class CartItemServiceImpl implements CartItemService {

    @Override
    public List<CartItem> findByShoppingCart(ShoppingCart shoppingCart) {
        return cartItemRepository.findByShoppingCart(shoppingCart);
    }
}
