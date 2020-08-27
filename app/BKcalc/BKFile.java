package app.BKcalc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class BKFile implements IOBK {
//Legg inn filehandlere. Håndtert etter forespørsel.
	
	
	


	public void saveBKGrid(int nn,int grid) {

		
		try {
			PrintWriter bkWpn = new PrintWriter("C:/Users/Kim/Documents/Skole/bkapp/"+nn+".txt");
			
			bkWpn.println(grid);
			bkWpn.close();
		}
		
		catch(FileNotFoundException e) {
			System.out.println("File cannot be found");
		}
	}
	public String loadBKGrid(int nn) throws IOException {
		
		
		try {
			@SuppressWarnings("resource")
			BufferedReader bufferreader = new BufferedReader(new FileReader("C:/Users/Kim/Documents/Skole/bkapp/"+nn+".txt"));
		
			
			String grid = bufferreader.readLine();
			return grid;
		
		}
		catch (FileNotFoundException e) {
			System.out.println("Cannot find file");
		}
		return null;
		

	}
}
