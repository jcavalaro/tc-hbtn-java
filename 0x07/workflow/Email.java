import java.io.PrintStream;

public class Email implements CanalNotificacao{

	
	@Override
	public void notificar(Mensagem mensagem) {
		System.out.printf("[EMAIL] {%s} - %s\n", mensagem.getTipoMensagem(), mensagem.getTexto());
		// TODO Auto-generated method stub
		//[EMAIL] {<tipo da mensagem>} - <texto da mensagem>
	}

}
