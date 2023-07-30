package com.asm.Services;

import java.util.List;

import com.asm.Entity.OrderDetail;

public interface OrderDetailService {
	List<OrderDetail> findAll();
	
	OrderDetail getOrderDetailByID(Long id);
}
