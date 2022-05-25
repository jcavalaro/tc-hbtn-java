
import java.util.*;

public class ProcessadorVideo {

	List<CanalNotificacao> canais = new ArrayList<CanalNotificacao>();
	//protected CanalNotificacao[] canais;
	
	//adiciona a lista canais
	public void registrarCanal (CanalNotificacao notificaCanais) {
		canais.add(notificaCanais);
	}
	
	public void processar (Video video) {
		String msgNotifica = video.getArquivo() + " - " + video.getFormato();
		Mensagem mensagem = new Mensagem(msgNotifica, TipoMensagem.LOG);
		for(CanalNotificacao canal : canais) {
			canal.notificar(mensagem);
		}
		
	}
	/* Contém uma lista de objetos do tipo CanalNotificacao chamado canais
Contém o método registrarCanal que recebe um valor objeto do tipo CanalNotificação e adiciona a lista canais
Contém método processar que recebe um objeto do tipo Video. Esse método deve percorrer por todos os canais registros e notificar a mensagem <nome do video> - <formato> do tipo LOG*/
	
}
