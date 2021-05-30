package br.edu.ifpb.padroes.storewebv3.mediator;

import br.edu.ifpb.padroes.storewebv3.payment.StripeApi;
import br.edu.ifpb.padroes.storewebv3.service.OrderService;

/**
 * @author andreia
 *
 */
public class ConcreteMediator implements Mediator {
	
	private StripeApi stripeApi;

	@Override
	public void notify(OrderService orderService) {
		if (orderService instanceof OrderService) {
			stripeApi.notify(orderService);
		}		
	}
	
	
}
