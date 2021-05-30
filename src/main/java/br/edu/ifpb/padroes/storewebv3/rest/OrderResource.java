package br.edu.ifpb.padroes.storewebv3.rest;

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

    public OrderResource(OrderFacade orderFacade) {
    	this.orderFacade = orderFacade;
    }

    @PostMapping("/")
    public ResponseEntity<Void> createOrder(@RequestBody Order order) {
        orderFacade.createOrder(order);
        return ResponseEntity.ok().build();
    }

}
