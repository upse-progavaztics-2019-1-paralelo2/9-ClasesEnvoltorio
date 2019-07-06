import java.util.Scanner;

public class TestClasesEnvoltorio {

	public static void main(String[] args) {
		
		int i = 1;
		
		Integer enterito = i;
		
		int j = -2;
		
		if(Integer.compare(j, i)>0)
		{
			System.out.println("J es mayor");
		}else {
			System.out.println("J NO es mayor");
		}
		

		System.out.println("El mayor entero representable con byte es " + Byte.MAX_VALUE);
		System.out.println("El menor entero representable con byte es " + Byte.MIN_VALUE);
		System.out.println("El mayor entero representable con short es " + Short.MAX_VALUE);
		System.out.println("El mayor entero representable con int es " + Integer.MAX_VALUE);
		System.out.println("El mayor entero representable con long es " + Long.MAX_VALUE);
		
		System.out.println("Ingrese un numero:");
		Scanner s = new Scanner(System.in);
		String cadena = s.next();
		try {
			int numero = Integer.parseInt(cadena);
			System.out.println("Su numero ingresado se convirtio a int, es el " + numero);
		}catch(Exception e)
		{
			System.out.println("Error salvaje aparece. No es un numero su string.");
		}
		s.close();
		
		int radio = 2;
		double areaCirculo = Math.PI * Math.pow(radio, 2);
		System.out.println("El area del circulo es: " + areaCirculo );
		
	}

}
