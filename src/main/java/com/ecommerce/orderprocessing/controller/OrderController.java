package com.ecommerce.orderprocessing.controller;



import com.ecommerce.orderprocessing.dto.OrderDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/order")
@Slf4j
public class OrderController {



    @PostMapping("/orderProduct")
    public List<String> orderProduct(OrderDto customerOrder)
    {
        log.info("Req for Save Customer {} ", customerOrder);
        return List.of("Order success for customer");
    }





}
