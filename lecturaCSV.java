package Examen3;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
public class lecturaCSV {

	public void ejecutar(int ID) {
		
		ID num = new ID();
		int newID=num.quitarnum(ID);
		List<String> renglones=null;
		String ArchivoCSV = "C:/Users/adalc/Downloads/emails.csv/emails.csv";
		try {
			renglones=Files.readAllLines(Paths.get(ArchivoCSV));
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		int suma [] = new int[3000];
		for(int i=newID;i<=newID+49;i++) {
			String []correos=renglones.get(i).split(",");
			for(int j=1;j<correos.length-1;j++) {
				suma[j-1]+=Integer.parseInt(correos[j]);
			}
		}
		
		String[] palabras=renglones.get(0).split(",");
		
		try {
			FileWriter wr=new FileWriter("C:/Users/adalc/Downloads/eclipse/Parcial1/src/Examen3/Sumas.txt");	
		for(int i =0;i<suma.length;i++) {
			wr.write((palabras[i+1])+" = ");
			wr.write(Integer.toString(suma[i])+"\n");
			}
		System.out.println("Se guardo la suma");
		wr.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
