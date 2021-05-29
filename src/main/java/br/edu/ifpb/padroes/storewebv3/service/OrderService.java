package br.edu.ifpb.padroes.storewebv3.service;

import java.util.List;

import org.springframework.stereotype.Service;


import br.edu.ifpb.padroes.storewebv3.domain.Order;
import br.edu.ifpb.padroes.storewebv3.repository.OrderRepository;

@Service
public class OrderService {

    private OrderRepository orderRepository = OrderRepository.getInstance();

	public void createOrder(Order order) {
		// TODO Auto-generated method stub
		
	}

    public List<Order> getOrderList() {
        return orderRepository.getOrderList();
    }

}
