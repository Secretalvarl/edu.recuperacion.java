package sercicios;

import java.util.Scanner;

public class menuImplementacion implements menuInterfaz{
	
	Scanner sc = new Scanner(System.in);
	@Override
	public int menuPrincipal(Scanner sc) {
		
		int opcion;
		
		System.out.println("------------------");
		System.out.println("|0. Cerrar menu  |");
		System.out.println("|1. Dar alta     | ");
		System.out.println("------------------");
		
		opcion = sc.nextInt();
		
		return opcion;
		
	}

}
