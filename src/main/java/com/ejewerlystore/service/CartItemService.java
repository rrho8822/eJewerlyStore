package com.ejewerlystore.service;

import com.ejewerlystore.model.Cart;
import com.ejewerlystore.model.CartItem;


public interface CartItemService {

    void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);

    CartItem getCartItemByProductId(int productId);
}
