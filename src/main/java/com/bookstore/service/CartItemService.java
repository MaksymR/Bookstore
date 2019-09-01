package com.bookstore.service;

import com.bookstore.domain.CartItem;
import com.bookstore.domain.ShoppingCart;

import java.util.List;

public interface CartItemService {

    List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);

    CartItem updateCartItem(CartItem cartItem);

}
