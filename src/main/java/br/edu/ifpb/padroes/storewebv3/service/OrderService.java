package br.edu.ifpb.padroes.storewebv3.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.edu.ifpb.padroes.storewebv3.domain.DescontoV;
import br.edu.ifpb.padroes.storewebv3.domain.Order;
import br.edu.ifpb.padroes.storewebv3.domain.OrderItem;
import br.edu.ifpb.padroes.storewebv3.domain.Product;
import br.edu.ifpb.padroes.storewebv3.repository.OrderRepository;

@Service
public class OrderService {

    private OrderRepository orderRepository = OrderRepository.getInstance();

	public void createOrder(Order order) {
			
		 for (OrderItem item: order.getItems()) {
	            Product product = item.getProduct();
	            product.accept(new DescontoV());
	        }
		 System.out.println(order.getId().toString());
	}

    

}
