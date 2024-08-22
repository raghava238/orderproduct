package com.ecommerce.orderprocessing.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class OrderDto {

    private String orderId;
    private String customerId;
    private String productId;
    private String quantity;
    private String price;
    public OrderDto() {};
}
