package io.github.MatheusFSantos.Entities;

public enum OrderStatus {
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private Integer code;
	
	private OrderStatus(Integer code) {
		this.code = code;
	}
	
	public Integer getCode() {
		return code;
	}
	
	public static OrderStatus valueOf(Integer code) {
		for(OrderStatus order : OrderStatus.values()) {
			if(order.getCode() == code) 
				return order;
		}
		
		throw new IllegalArgumentException("Invalid OrderStatus Code!");
	}
}