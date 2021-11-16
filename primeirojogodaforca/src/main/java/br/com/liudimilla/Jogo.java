package br.com.liudimilla;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.liudimilla.model.LetraPalavra;

@SessionScoped
@ManagedBean(name = "jogoBean")
public class Jogo {
	private String palavra;
	private LetraPalavra letrapalavra;
	private List<LetraPalavra> letras = new ArrayList<LetraPalavra>();
	private String letraJogada;
	private int chances = 7;

	public void gerarPalavras() {
		letras.clear();
		chances = 7;
		palavra = palavra.toUpperCase();

		for (int i = 0; i < palavra.length(); i++) {
			letrapalavra = new LetraPalavra();
			letrapalavra.setLetra(palavra.substring(i, i + 1));
			letras.add(letrapalavra);
		}
		palavra = "";
	}

	public void mostrarLetra() {
		boolean acertou = false;

		for (int i = 0; i < letras.size(); i++) {
			if (letras.get(i).getLetra().equalsIgnoreCase(letraJogada)) {
				acertou = true;
				letras.get(i).setContem(true);
			}

		}

		if (!acertou) {
			chances--;
		}
		letraJogada = "";
	}

	public boolean isAcertou() {
		if(letras.isEmpty()) {
			return false;
		}
		for (int i = 0; i < letras.size(); i++) {
			if (!letras.get(i).isContem() ) {
				return false;
			}
   
		}
         return true;
	}
	
	
	
	
	

	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}

	public LetraPalavra getLetrapalavra() {
		return letrapalavra;
	}

	public void setLetrapalavra(LetraPalavra letrapalavra) {
		this.letrapalavra = letrapalavra;
	}

	public List<LetraPalavra> getLetras() {
		return letras;
	}

	public void setLetras(List<LetraPalavra> letras) {
		this.letras = letras;
	}

	public String getLetraJogada() {
		return letraJogada;
	}

	public void setLetraJogada(String letraJogada) {
		this.letraJogada = letraJogada;
	}

	public int getChances() {
		return chances;
	}

	public void setChances(int chances) {
		this.chances = chances;
	}

}
