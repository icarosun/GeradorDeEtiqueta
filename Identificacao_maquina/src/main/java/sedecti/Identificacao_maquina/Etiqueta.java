package sedecti.Identificacao_maquina;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Etiqueta {
	private String secretaria = "";
	private String tombo = "";
	private String configuracao = "";
	private String setor = "";
	private Date data;
	private String responsavel = "";
	private String observacao = "";
	
	public Etiqueta(String secretaria, String tombo, String configuracao, String setor, String responsavel, String observacao) {
		this.setSecretaria(secretaria);
		this.tombo = tombo;
		this.configuracao = configuracao;
		this.setor = setor;
		this.responsavel = responsavel;
		this.observacao = observacao; 
		
		this.data = new Date();
	}
	
	
	public String getTombo() {
		return tombo;
	}


	public void setTombo(String tombo) {
		this.tombo = tombo;
	}


	public String getConfiguracao() {
		return configuracao;
	}


	public void setConfiguracao(String configuracao) {
		this.configuracao = configuracao;
	}


	public String getSetor() {
		return setor;
	}


	public void setSetor(String setor) {
		this.setor = setor;
	}


	public Date getData() {
		return data;
	}
	
	public String getDataFormatoBrasil() {
		SimpleDateFormat formatoBrasil = new SimpleDateFormat("dd/MM/yyyy");
		return formatoBrasil.format(data);
	}


	public void setData(Date data) {
		this.data = data;
	}


	public String getResponsavel() {
		return responsavel;
	}


	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}


	public String getObservacao() {
		return observacao;
	}


	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}


	public String getSecretaria() {
		return secretaria;
	}


	public void setSecretaria(String secretaria) {
		this.secretaria = secretaria;
	}

}
