package br.edu.ifpb.padroes.storewebv3.mediator;

public interface Mediator {
	/**
	 * @param ConcreteMediator
	 */
	void notify(Componente component);
}
