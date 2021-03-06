package com.ssm.service;

import com.ssm.domain.Orders;

import java.util.List;

public interface IOrdersService {
    List<Orders> findAll(int page,int pageSize) throws Exception;

    Orders findById(String ordersId) throws Exception;
}
