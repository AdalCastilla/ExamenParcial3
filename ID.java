package Examen3;

public class ID {

	public int quitarnum(int numero) {
		int longitud = String.valueOf(numero).length();
	    if (longitud <= 3) {
	      return 0;
	    }
	    String numeroString = String.valueOf(numero);
	    String resultadoString = numeroString.substring(3, longitud);
	    int resultado = Integer.parseInt(resultadoString);
	    return resultado;
	}
}
