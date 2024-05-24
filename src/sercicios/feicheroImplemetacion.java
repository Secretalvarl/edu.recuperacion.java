package sercicios;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import controladores.Inicio;

public class feicheroImplemetacion implements ficheroInterfaz{
	
	@Override
	public void ficheroLog(Exception e) {
		try {
			BufferedWriter escribir = new BufferedWriter(new FileWriter(new File(Inicio.rutaCompletaLog)));
				
				escribir.write("ERROR" + e);

			
			escribir.close();
		    }catch (Exception e2) {
		    
		    }
	}
}
