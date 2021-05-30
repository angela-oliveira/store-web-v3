package br.edu.ifpb.padroes.storewebv3.mediator;

import br.edu.ifpb.padroes.storewebv3.service.OrderService;

public interface Mediator {
	/**
	 * @param ConcreteMediator
	 */
	void notify(OrderService orderService);
}
