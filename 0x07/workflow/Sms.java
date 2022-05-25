
public class Sms implements CanalNotificacao{

	@Override
	public void notificar(Mensagem mensagem) {
		System.out.printf("[SMS] {%s} - %s\n", mensagem.getTipoMensagem(), mensagem.getTexto());
		// TODO Auto-generated method stub
		//[SMS] {<tipo da mensagem>} - <texto da mensagem>
	}

}
