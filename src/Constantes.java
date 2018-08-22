import java.util.HashMap;

public class Constantes {
	
	public static final String SEM_TRADUCAO = "SEM TRADUÇÃO "; 
	public static final String SEPARADOR_TRADUCAO = ", "; 
	public static final String SEPARADOR_FRASE = " "; 
	public static final HashMap<String, String[]> LISTA_TRADUCOES = new HashMap<>();
	static {
		LISTA_TRADUCOES.put("bom", 		new String[] {"good"	,"bon", 		"gut"});
		LISTA_TRADUCOES.put("mau", 		new String[] {"bad"		,"mauvais",		"schlecht"});
		LISTA_TRADUCOES.put("guerra", 	new String[] {"war"		,"la guerre",	"krieg"});
		LISTA_TRADUCOES.put("é", 		new String[] {"is"		,"et",			"und"});
		LISTA_TRADUCOES.put("paz", 		new String[] {"peace"	,"la paix",		"frieden"});
		LISTA_TRADUCOES.put("ruim", 	new String[] {"bad"		,"mauvais",		"schlecht"});
		LISTA_TRADUCOES.put("a", 		new String[] {"the"		,"à",			"zu"});
	}
	
	public static final int IDX_INGLES 	= 0;
	public static final int IDX_FRANCES = 1;
	public static final int IDX_ALEMAO 	= 2;
}
