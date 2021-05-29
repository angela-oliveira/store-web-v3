package br.edu.ifpb.padroes.storewebv3.repository;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifpb.padroes.storewebv3.domain.Order;
import br.edu.ifpb.padroes.storewebv3.domain.Product;

public class OrderRepository {

    private List<Order> orderList = new ArrayList<>();

    public List<Order> getOrderList() {
        return orderList;
    }

    public boolean add(Order element) {
        return orderList.add(element);
    }

    public boolean remove(Order product) {
        return orderList.remove(product);
    }

	public static OrderRepository getInstance() {
		// TODO Auto-generated method stub
		return null;
	}

}
