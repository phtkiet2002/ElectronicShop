package com.asm.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.asm.Entity.OrderDetail;
import com.asm.Reponsitory.OrderDetailReponsitory;

public interface OrderDetailService {
	List<OrderDetail> findAll();
	
	OrderDetail getOrderDetailByID(Long id);
}
