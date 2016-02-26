
public class Pregunta{
	private String sAsignatura;
	private String sPregunta;//enunciado
	private int iRespuesta;//indica la posición de la respuesta correcta en el array de respuestas
	private String sRuta; //ruta del background
	private String[] aRespuestas;//conjunto de Strings con las 4 respuestas. 
/**
 * Constructor de la clase pregunta
 * @param Asignatura: Asignatura a la que pertenece la pregunta
 * @param Pregunta: Enunciado de la pregunta
 * @param Ruta: Ruta de la imagen que aparecerá como background en la pregunta
 * @param Respuesta: Posicion que ocupa la respuesta correcta en el array de posibles respuestas
 * @param opciones: Array de Strings con todas las posibles respuestas
 */
public Pregunta(String Asignatura,String Pregunta, String Ruta, int Respuesta,String[] opciones){ //constructor avanzado
	sAsignatura=Asignatura;
	sPregunta=Pregunta;
	iRespuesta=Respuesta;
	sRuta=Ruta;
	aRespuestas=new String[4];
	aRespuestas[0]=opciones[0];
	aRespuestas[1]=opciones[1];
	aRespuestas[2]=opciones[2];
	aRespuestas[3]=opciones[3];
}

/**
 * constructor basico que ajusta todo a null y no necesita parametros 
 */
public Pregunta(){ 
	sAsignatura=null;
	sPregunta=null;
	iRespuesta=-1;
	sRuta=null;
}

/**
 * devuelve el string en el array de respuestas posibles segun el numero que se le pasa
 * @param posOpcion - int
 * @return String con la opcion
 */

public String getOpcion(int posOpcion){ 
	return(aRespuestas[posOpcion]);
}

/**
 * reemplaza el string en la posicion indicada de las posibles respuestas por el string pasado por parametro
 * @param posOpcion - int
 * @param Opcion - opcion
 */

public void setOpcion(int posOpcion,String Opcion){ 
	aRespuestas[posOpcion]=Opcion;
}

/**
	 * Cambia el enunciado de la pregunta
	 * @param Pregunta - String
	 */
public void setPregunta(String Pregunta){ 
	sPregunta=Pregunta;
}
/**
 * devuelve el enunciado de la pregunta
 * @return String con el enunciado
 */
public String getPregunta(){ 
	return(sPregunta);
}
/**
 * cambia el numero posicion en el que se encuentra la respuesta correcta dentro del array de posibles respuestas
 * @param Respuesta - String 
 */
public void setRespuesta(int Respuesta){ 
	iRespuesta=Respuesta;
}
/**
 * devuelve el string que corresponde a la respuesta correcta
 * @return String
 */
public String getRespuesta(){ 
	return(aRespuestas[iRespuesta]);
}
/**
 * cambia el string ruta de imagen
 * @param Ruta - String
 */

public void setRuta(String Ruta){ 
	sRuta=Ruta;
}
/**
 * devuelve el string ruta de imagen
 * @return String
 */
public String getRuta(){
	return(sRuta);
}
/**
 * cambia el string que indica la asignatura de la pregunta
 * @param Asignatura - String
 */
public void setAsignatura(String Asignatura){
	sAsignatura=Asignatura;
}
/**
 * devuelve el string que indica la asignatura de la pregunta
 * @return String
 */
public String getAsignatura(){
	return(sAsignatura);
}
}