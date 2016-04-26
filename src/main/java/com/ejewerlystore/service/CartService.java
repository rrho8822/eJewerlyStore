package com.ejewerlystore.service;

import com.ejewerlystore.model.Cart;


public interface CartService {

    Cart getCartById(int cartId);

    void update(Cart cart);
}
