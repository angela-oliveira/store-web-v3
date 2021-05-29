package facade;

import br.edu.ifpb.padroes.storewebv3.domain.Order;
import br.edu.ifpb.padroes.storewebv3.repository.ProductRepository;
import br.edu.ifpb.padroes.storewebv3.service.OrderService;

public class OrderFacade {

    private final OrderService orderService;

    public OrderFacade(OrderService orderService, ProductRepository productRepository) {
        this.orderService  = orderService;
    }

	public void createOrder(Order order) {

        this.orderService.createOrder(order);
		
	}


}
