package br.edu.ifpb.padroes.storewebv3.rest;

import br.edu.ifpb.padroes.storewebv3.command.CreateOrderCommand;
import br.edu.ifpb.padroes.storewebv3.command.Invoker;
import br.edu.ifpb.padroes.storewebv3.facade.OrderFacade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifpb.padroes.storewebv3.domain.Order;

@RestController
@RequestMapping("/api/order")
public class OrderResource {

    private final OrderFacade orderFacade;
    private final Invoker invoker;

    public OrderResource(OrderFacade orderFacade, Invoker invoker) {
    	this.orderFacade = orderFacade;
    	this.invoker = invoker;
    }

    @PostMapping("/")
    public ResponseEntity<Void> createOrder(@RequestBody Order order) {
        CreateOrderCommand c = new CreateOrderCommand(orderFacade);
        c.setOrder(order);
        this.invoker.addCommand(c);
        this.invoker.executeCommands();
        return ResponseEntity.ok().build();
    }

}
