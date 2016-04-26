package com.ejewerlystore.dao;

import com.ejewerlystore.model.Cart;
import com.ejewerlystore.model.CartItem;


public interface CartItemDao {

    void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);

    CartItem getCartItemByProductId(int productId);

}
