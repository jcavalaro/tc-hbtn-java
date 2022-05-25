
public class Teams implements CanalNotificacao{

	@Override
	public void notificar(Mensagem mensagem) {
		System.out.printf("[TEAMS] {%s} - %s\n", mensagem.getTipoMensagem(), mensagem.getTexto());
		// TODO Auto-generated method stub
		//[TEAMS] {<tipo da mensagem>} - <texto da mensagem>
	}

}
