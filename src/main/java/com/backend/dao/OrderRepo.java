package com.backend.dao;

import com.backend.model.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderRepo extends JpaRepository<Order, Integer> {
    public Page<Order> findByCategoryId(int id, Pageable pageable);
    public Page<Order>findByNameContaining(String name, Pageable pageable);
    @Query("select count (id) from Order where category.id=?1")
    public Long getOrderLengthByCategoryId(int id);
    @Query("select count (id) from Order where name LIKE %?1%")
    public Long GetOrdersizeByname(int id);


}
