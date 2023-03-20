package com.backend.controller;

import com.backend.model.Order;
import com.backend.service.CategoryService;
import com.backend.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Order/")
@CrossOrigin("")
public class OrderController {

    private OrderService orderService;

    @GetMapping("allorder")
    public List<Order> AllOrder(@RequestParam int page,@RequestParam int size){
        return orderService.AllOrder(page,size);
    }
    @GetMapping("orderbyid")
    public List<Order> GetOrderByIdCategory(@RequestParam int id,@RequestParam int page,@RequestParam int size){
        return orderService.GetOrderByIdCategory(id,page,size);
    }
    @GetMapping("GetOrderByName")
    public List<Order>GetOrderByname(@RequestParam String name,@RequestParam int page,@RequestParam int size){
        return orderService.GetOrderByname(name,page,size);
    }
    @GetMapping("GetOrderByID")
    public Order GetOrderById(@RequestParam int id){
        return orderService.GetOrderById(id);
    }
    @GetMapping("GetOrderSize")
    public Long GetOrdersize(){
        return orderService.GetOrdersize();
    }
    @GetMapping("GetOrderByCategoryId")
    public Long GetOrderByCategoryId(int id){
        return orderService.GetOrderByCategoryId(id);
    }
    @GetMapping("GetOrdersizeByname")
    public Long GetOrdersizeByname(int id){
        return orderService.GetOrdersizeByname(id);
    }
}

