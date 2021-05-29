package br.edu.ifpb.padroes.storewebv3.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifpb.padroes.storewebv3.domain.Order;
import facade.OrderFacade;

@RestController
@RequestMapping("/api/order")
public class OrderResource {

    private final OrderFacade orderFacade;

    public OrderResource() {
        orderFacade = new OrderFacade(null, null);
    }

    @PostMapping("/")
    public ResponseEntity<Void> createOrder(@RequestBody Order order) {
        orderFacade.createOrder(order);
        return ResponseEntity.ok().build();
    }

}
