package provedores;

public class Sedex implements ProvedorFrete{

	@Override
	public Frete calcularFrete(double peso, double valor) {
		double x = 0;
		if(peso<=1000) {
			x = (valor * 0.05);
		}else {
			x = (valor * 0.10);
		}
		return new Frete (x, obterTipoProvedorFrete());
	}

	@Override
	public TipoProvedorFrete obterTipoProvedorFrete() {
		return TipoProvedorFrete.SEDEX;
		
	}

}
