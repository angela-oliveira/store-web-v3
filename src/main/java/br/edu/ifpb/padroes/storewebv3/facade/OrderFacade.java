package br.edu.ifpb.padroes.storewebv3.facade;

import java.util.List;

import br.edu.ifpb.padroes.storewebv3.domain.Order;
import br.edu.ifpb.padroes.storewebv3.repository.ProductRepository;
import br.edu.ifpb.padroes.storewebv3.service.OrderService;
import org.springframework.stereotype.Component;

@Component
public class OrderFacade {

    private final OrderService orderService;

    public OrderFacade(OrderService orderService) {
        this.orderService  = orderService;
    }

	public void createOrder(Order order) {

        this.orderService.createOrder(order);
        this.orderService.processPayment();
		
	}
    public List<Order> getOrders() {
        return orderService.getOrderList();
    }


}
