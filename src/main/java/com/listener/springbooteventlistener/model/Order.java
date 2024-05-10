package com.listener.springbooteventlistener.model;

import lombok.Data;

@Data
public class Order {
 private String orderName;

    public Order(String orderName) {
        this.orderName = orderName;
    }
}
