package org.taru.dao;



import java.util.List;

public interface QueryOrderDao {
    List queryOrderDao(String orderId, String orderUserId, String orderValue);
}
