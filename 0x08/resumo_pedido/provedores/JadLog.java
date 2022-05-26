package provedores;

public class JadLog implements ProvedorFrete{

	@Override
	public Frete calcularFrete(double peso, double valor) {
		double x = 0;
		if(peso<=2000) {
			x = (valor * 0.045);
		}else {
			x = (valor * 0.07);
		}
		return new Frete (x, obterTipoProvedorFrete());
	}

	@Override
	public TipoProvedorFrete obterTipoProvedorFrete() {
		return TipoProvedorFrete.JADLOG;
		
	}

}
