
import java.util.Scanner;
import com.zubiri.geometria.Circulo;
import com.zubiri.geometria.Rectangulo;


public class OperacionesGeometricas  {
	
	public static void main (String[] args) {

	char opcion;

	Scanner sc = new Scanner(System.in);
	System.out.println("\nElige una opción: 'C' para círculo, 'R' para rectángulo o 'S' para salir");
	opcion = sc.next().charAt(0);
	

	while ((opcion != 'T' )&&(opcion != 't')){

		if ((opcion == 'C')||(opcion == 'c'))  {
		
			double radio, result;
			Circulo circulo = new Circulo(1);
			System.out.println("\nIntroduce el radio del círculo");
			radio = sc.nextDouble();

			circulo.setRadio(radio);
	
			result = circulo.circu();
			System.out.println("\nLa circunferencia es:" + result);

			result = circulo.area();
			System.out.println("\nEl area es:" + result);
		}

		else {
			if ((opcion == 'R')||(opcion == 'r'))  {

			double base, altura;
			Rectangulo operaciones = new Rectangulo(1,1);
			System.out.println("\nIntroduce la base del rectángulo");
			base = sc.nextDouble();

			System.out.println("\nIntroduce la altura del rectángulo");
			altura = sc.nextDouble();

			operaciones.setBase(base);
			operaciones.setAltura(altura);						
			
			System.out.println("\nEl perímetro es:" + operaciones.perimetro());
			System.out.println("\nEl área es:" + operaciones.area());
			}
		}	
	
	System.out.println("\nElige una opción: 'C' para círculo, 'R' para rectángulo o 'S' para salir");
	opcion = sc.next().charAt(0);
	
	}

}

}
