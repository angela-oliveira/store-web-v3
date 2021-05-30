package br.edu.ifpb.padroes.storewebv3.domain;

public interface VisitorV {

	void visit(LivrosV livrosV);
    void visit(Product product);
	void visit(CelularV celularV);
}
