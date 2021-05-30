package br.edu.ifpb.padroes.storewebv3.domain;

public class LivrosV extends Product  {
	
	 public void accept(VisitorV visitorV) {
	        visitorV.visit(this);
	    }
}
