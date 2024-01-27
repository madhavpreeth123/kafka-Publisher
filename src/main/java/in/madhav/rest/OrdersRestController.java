package in.madhav.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.madhav.binding.Orders;
import in.madhav.service.OrderService;

@RestController
public class OrdersRestController {

	@Autowired
	private OrderService service;
	
	@PostMapping("/order")
	public String publishOrders(@RequestBody Orders order) {
		
		return service.addMsg(order);
	}
}
