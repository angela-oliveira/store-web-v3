package br.edu.ifpb.padroes.storewebv3.command;

import br.edu.ifpb.padroes.storewebv3.domain.Order;
import br.edu.ifpb.padroes.storewebv3.facade.OrderFacade;
import br.edu.ifpb.padroes.storewebv3.payment.StripeApi;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateOrderCommand extends Command
{
    private Order order;

    public CreateOrderCommand(OrderFacade facade)
    {
        super(facade);
        
    }
    
    public void setOrder(Order o)
    {
    	this.order = o;
    }

    @Override
    public boolean execute()
    {   	
        this.order.setProcessed(true);
        this.facade.createOrder(this.order);
        return true;
    }
}
