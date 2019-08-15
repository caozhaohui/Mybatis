package org.taru.service;



import java.util.List;

public interface QueryOrderService {
    List queryOrderService(String orderId, String orderUserId, String orderValue);
}
