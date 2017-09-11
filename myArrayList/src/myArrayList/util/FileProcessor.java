package myArrayList.util;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileProcessor {
	
	public static void main(String args[]) throws IOException
	{
		try{
			FileInputStream fstream = new FileInputStream("input.txt");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			readLine(br);
		}
		catch(Exception e){
			System.err.println("Error: " + e.getMessage());
		}
		
		
	}

	private static String readLine(BufferedReader br) throws IOException {
		
		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
		br.close();
		return line;	
	}
	
		
}
