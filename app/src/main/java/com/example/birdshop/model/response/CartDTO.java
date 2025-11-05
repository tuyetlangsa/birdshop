package com.example.birdshop.model.response;

import com.example.birdshop.model.CartItemDTO;

import java.util.List;

public class CartDTO {
    private int totalQuantity;
    private List<CartItemDTO> items;

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public List<CartItemDTO> getItems() {
        return items;
    }
}
