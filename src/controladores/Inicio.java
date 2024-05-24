package controladores;

import java.util.Scanner;

import sercicios.feicheroImplemetacion;
import sercicios.ficheroInterfaz;
import sercicios.menuImplementacion;
import sercicios.menuInterfaz;

public class Inicio {

	public static final String rutaCompletaLog = "C:\\Users\\Profesor\\eclipse-workspace-recuperacion-java\\logs\\".concat("log.txt");

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		menuInterfaz mi = new menuImplementacion();
		ficheroInterfaz fi = new feicheroImplemetacion();
		
		int opcion;
		
		boolean cerrarMenu = false;
		
		do {
			try {
				
				String nombreQueQuerais = null;
				
				nombreQueQuerais.length();
				
				opcion = mi.menuPrincipal(sc);
				
				switch (opcion) {
				case 0: {
					
					cerrarMenu = true;
				}
				break;
				case 1: {
					
				}
				break;
				default:
					System.out.println("Opcion seleccionada no valida");
				}
				break;
			}catch (Exception e) {
				
				fi.ficheroLog(e);	
			}
		}while(cerrarMenu);
	}
}
