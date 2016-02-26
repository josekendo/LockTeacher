import java.util.*;
public class tests {

	public static void main(String[] args) {
		Pregunta pr;
		Nivel nivelaso=new Nivel();
		String[] stringaso=new String[4];
		stringaso[0]="u";
		stringaso[1]="freaking";
		stringaso[2]="wot";
		stringaso[3]="m8?";
		pr=new Pregunta("Matemáticas","Dale ar mlg?","rutasa",2,stringaso);
		nivelaso.anyadirPregunta(pr);
		System.out.println(pr.getOpcion(0));
		System.out.println(pr.getOpcion(1));
		System.out.println(pr.getOpcion(2));
		System.out.println(pr.getOpcion(3));
		pr.setOpcion(0, "WTF");
		System.out.println(pr.getOpcion(0));
		System.out.println(pr.getRespuesta());
}
}