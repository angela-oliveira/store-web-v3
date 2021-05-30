package br.edu.ifpb.padroes.storewebv3.mediator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.edu.ifpb.padroes.storewebv3.payment.StripeApi;
import br.edu.ifpb.padroes.storewebv3.service.OrderService;

/**
 * @author andreia
 *
 */
@Component
public class ConcreteMediator implements Mediator {

	@Autowired
	private StripeApi stripeApi;
	@Autowired
	private OrderService orderService;

	@Override
	public void notify(Componente component) {
		if (component instanceof OrderService) {
			this.reagirOrderService();
		}
	}

	public void reagirOrderService() {
		this.stripeApi.createOrder();
	}
//
//	@Override
//	public void notify(OrderService orderService) {
//		if (orderService instanceof OrderService) {
//			stripeApi.notify(orderService);
//		}		
//	}

}
