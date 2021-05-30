package br.edu.ifpb.padroes.storewebv3.command;

import br.edu.ifpb.padroes.storewebv3.domain.Order;
import br.edu.ifpb.padroes.storewebv3.facade.OrderFacade;
import br.edu.ifpb.padroes.storewebv3.payment.StripeApi;
import org.springframework.beans.factory.annotation.Autowired;

public class CreateOrderCommand extends Command
{
    private Order order;

    @Autowired
    StripeApi stripe;

    public CreateOrderCommand(OrderFacade facade, Order order)
    {
        super(facade);
        this.order = order;
    }

    @Override
    public boolean execute()
    {
        this.order.setProcessed(true);
        this.stripe.createOrder();
        this.facade.createOrder(this.order);
        return true;
    }
}
