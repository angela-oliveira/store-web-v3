package br.edu.ifpb.padroes.storewebv3.domain;

public class CelularV extends Product {
	public void accept(VisitorV visitorV) {
        visitorV.visit(this);
    }

}
