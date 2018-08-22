import java.util.HashMap;
import java.util.Map;

public class Tradutor {

	private Map<String,String[]> traducoes = new HashMap<>();
	
	public int idxIdioma = 0; 
	
	public boolean estaVazia() {
		return (traducoes.isEmpty());
	}

	public void adicionarTraducao(String palavra, String[] traducao) {
		traducoes.put(palavra, traducao);
	}

	public String traduzir(String palavra) {
		carregarTraducoes();
		String[] palavras = palavra.split(" ");
		String traducao = "";
		for(String p : palavras) {
			String[] aux = traducoes.get(p);
			if(aux!=null) {
				traducao += aux[idxIdioma].concat(Constantes.SEPARADOR_FRASE);
			}else {
				traducao += Constantes.SEM_TRADUCAO.concat(p).concat(Constantes.SEPARADOR_FRASE);
			}
		}
		return traducao.trim();
	}
	
	public void carregarTraducoes() {
		traducoes = Constantes.LISTA_TRADUCOES;
	}
	
	public void setarIdioma(int idioma) {
		idxIdioma = idioma;
	}
}
