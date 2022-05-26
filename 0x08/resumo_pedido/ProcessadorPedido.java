//package resumo_pedido;

import provedores.Frete;
import provedores.ProvedorFrete;

public class ProcessadorPedido {
	protected ProvedorFrete provedorFrete;

	public ProcessadorPedido(ProvedorFrete provedorFrete) {
		super();
		this.provedorFrete = provedorFrete;
	}
	
	public void processar(Pedido pedido) {
		pedido.setFrete(this.provedorFrete.calcularFrete(pedido.getPeso(), pedido.getTotal()));
		//preencher o atributo frete com a chamada de calcularFrete
	}

	public ProvedorFrete getProvedorFrete() {
		return provedorFrete;
	}

	public void setProvedorFrete(ProvedorFrete provedorFrete) {
		this.provedorFrete = provedorFrete;
	}
	
}
