import java.util.Scanner;


/**
 * <h2>clase Main, se utiliza para solucionar el problema del Domjudge Puntuacio </h2>
 * Busca informacion de Javadoc en <a href="http://www.google.com">GOOGLE</a>
 * @see <a href="http://www.google.com"b >Google</a>
 * @version 1
 * @author Pau Barbarroja Claramunt
 * @since 21-02-2018
 */
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/**
		 * Atributo Casos de prueba, diferentes casos del problema
		 */
		int casosPrueba=0;
		/**
		 * Atributo Puntuats, carreras donde ha puntuado en todos los casos de prueba
		 */
		int puntuats=0;
		/**
		 * Atributo Resultat, puntuacion total de todos los cases de prueba
		 */
		int resultat=0;
		casosPrueba = sc.nextInt();
		while(casosPrueba>0) {
			int j=sc.nextInt();
			int h=puntu(j);
			if(j>0&&j<16) {
				resultat=resultat+h;
				puntuats++;
			}
			casosPrueba--;
		}
		System.out.println(resultat);
		System.out.println(puntuats);
	}
	
	
	/**
	 * Traduce la posicion por puntuacion
	 * @see Main
	 * @param num Valor de la posicion del piloto
	 */
	public static int puntu(int num) {
		switch(num) {
			case 1:return num=25;
			case 2:return num=20;
			case 3:return num=16;
			case 4:return num=13;
			case 5:return num=11;
			case 6:return num=10;
			case 7:return num=9;
			case 8:return num=8;
			case 9:return num=7;
			case 10:return num=6;
			case 11:return num=5;
			case 12:return num=4;
			case 13:return num=3;
			case 14:return num=2;
			case 15:return num=1;
		}
		return num;
	}

}
