package br.edu.ifpb.padroes.storewebv3.domain;



public class DescontoV implements VisitorV {
	private final Double descontoLivros = 0.2;
  
 
	@Override
	public void visit(LivrosV livrosV) {
		Long newPrice = applyDesconto(livrosV.getPrice(), descontoLivros);
        livrosV.setPrice(newPrice);
		
	}
  

    @Override
    public void visit(Product product) {
        
    }

    private Long applyDesconto(Long price, Double porcentagem) {
        Double desconto = price * porcentagem;
        Long newPrice =  price - desconto.longValue();
        return newPrice;
    }

  
	@Override
	public void visit(CelularV celularV) {
		
		
	}

	

	

	






	


}
