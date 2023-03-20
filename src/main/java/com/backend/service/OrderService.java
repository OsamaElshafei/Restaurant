package com.backend.service;

import com.backend.dao.OrderRepo;
import com.backend.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private OrderRepo orderRepo;
    @Autowired
    public OrderService(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    public List<Order> AllOrder(int page, int size){
        Pageable pageable= PageRequest.of(page, size);
        return orderRepo.findAll(pageable).getContent();
    }
    public List<Order>GetOrderByIdCategory(int id,int page,int size){
        Pageable pageable= PageRequest.of(page, size);
        return orderRepo.findByCategoryId(id,pageable).getContent();
    }
    public List<Order>GetOrderByname(String name,int page,int size){
        Pageable pageable= PageRequest.of(page, size);
        return orderRepo.findByNameContaining(name,pageable).getContent();
    }
    public Order GetOrderById(int id){
        return orderRepo.findById(id).get();
    }

    public Long GetOrdersize(){
        return orderRepo.count();
    }
    public Long GetOrderByCategoryId(int id){
        return orderRepo.getOrderLengthByCategoryId(id);
    }
    public Long GetOrdersizeByname(int id){
        return orderRepo.GetOrdersizeByname(id);
    }


}
