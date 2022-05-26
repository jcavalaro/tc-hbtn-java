package provedores;

public class Loggi implements ProvedorFrete{

	@Override
	public Frete calcularFrete(double peso, double valor) {
		double x = 0;
		if(peso<=5000) {
			x = (valor * 0.04);
		}else {
			x = (valor * 0.12);
		}
		return new Frete (x, obterTipoProvedorFrete());
		
	}

	@Override
	public TipoProvedorFrete obterTipoProvedorFrete() {
		return TipoProvedorFrete.LOGGI;
		
	}

}
