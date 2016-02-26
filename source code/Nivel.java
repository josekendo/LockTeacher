import java.util.*;

public class Nivel {
	private Vector<Pregunta> aPreguntas;// array con las preguntas del nivel
	private int iNivel; // integer con el nivel

	public Nivel() { // constructor
		aPreguntas = new Vector<Pregunta>();
		iNivel = 0;

	}

	/**
	 *  Añade una pregunta
	 * @param preg - Clase Pregunta
	 * @return Booleano que confirma si no falla
	 */
	public boolean anyadirPregunta(Pregunta preg) {
		boolean anyadida = false;
		anyadida = aPreguntas.add(preg);
		return (anyadida);

	}

	/**
	 * borra la pregunta
	 * @param preg - Clase pregunta
	 * @return Booleano que confirma si no falla
	 */
	public boolean borrarPregunta(Pregunta preg) {
		boolean borrada = false;
		borrada = aPreguntas.remove(preg);
		return (borrada);
	}

	/**
	 * 
	 * @return Objeto pregunta aleatorio (entre 0 y 8)
	 */
	public Pregunta getPregRandom() { // devuelve una pregunta random de
										// cualquier asignatura
		Random randomGenerator = new Random();
		int aSacar = randomGenerator.nextInt(9); // entre 0 y 8
		if (aSacar >= aPreguntas.size()) {
			aSacar = aPreguntas.size() - 1;
		}
		return (aPreguntas.get(aSacar));
	}

	/**
	 * 
	 * @param asignatura - String Asignatura de la que se quieren las preguntas
	 * @return devuelve una pregunta random de la asignatura pasada por parametro
	 */
	public Pregunta getPregRandom(String asignatura) { 
		Random randomGenerator = new Random();
		int aSacar = -1;

		switch (asignatura) { // calcular variable aleatoria dentro de los
								// limites de cada asignatura
		case "Matemáticas":
			aSacar = randomGenerator.nextInt(3); // entre 0 y 2
			break;
		case "Castellano":
			aSacar = randomGenerator.nextInt(3) + 3; // entre 3 y 5
			break;
		case "Inglés":
			aSacar = randomGenerator.nextInt(3) + 6; // entre 6 y 8
			break;
		}
		if (aSacar != -1) {
			return (aPreguntas.get(aSacar));
		} else {
			return (null);
		}
	}
}
