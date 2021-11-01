package br.com.liudimilla;

import java.util.ArrayList;

import java.util.List;


import javax.faces.bean.ManagedBean;


import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlCommandButton;

/**
 Dados Pessoal
 */
@ViewScoped
@ManagedBean(name = "pessoaBean")
public class DadosBean {

private String nome;
private HtmlCommandButton commandButton;
private String numero;
private String dia;
private String hora;
private String assunto;
private String tarefaCompleta;
private String contatoCompleta;

public void mostrarTarefa() {
	tarefaCompleta = dia + " | "+ hora  + "  | " + assunto;
	
}

public void mostrarContato() {
	contatoCompleta = nome + numero;
	
}

private List<String> nomes = new ArrayList<String>();

public String addNome() {
	nomes.add(nome);
	return nome;
	
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public HtmlCommandButton getCommandButton() {
	return commandButton;
}

public void setCommandButton(HtmlCommandButton commandButton) {
	this.commandButton = commandButton;
}

public String getNumero() {
	return numero;
}

public void setNumero(String numero) {
	this.numero = numero;
}

public List<String> getNomes() {
	return nomes;
}

public void setNomes(List<String> nomes) {
	this.nomes = nomes;
}

public String getDia() {
	return dia;
}

public void setDia(String dia) {
	this.dia = dia;
}

public String getHora() {
	return hora;
}

public void setHora(String hora) {
	this.hora = hora;
}

public String getTarefaCompleta() {
	return tarefaCompleta;
}

public void setTarefaCompleta(String tarefaCompleta) {
	this.tarefaCompleta = tarefaCompleta;
}

public String getAssunto() {
	return assunto;
}

public void setAssunto(String assunto) {
	this.assunto = assunto;
}

public String getContatoCompleta() {
	return contatoCompleta;
}

public void setContatoCompleta(String contatoCompleta) {
	this.contatoCompleta = contatoCompleta;
}



}
