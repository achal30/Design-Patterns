package myArrayList.util;

import java.io.BufferedReader;
//import java.io.BufferedWriter;
import java.io.FileReader;
//import java.io.FileWriter;
import java.io.IOException;

public class FileProcessor {
	
	private FileReader fr;
	private BufferedReader br;
	//private FileWriter fw;
	//private BufferedWriter bw;
	
	public FileProcessor(String input,String output){
		try {
			fr = new FileReader(input);
			br = new BufferedReader(fr);
			
			//fw = new FileWriter(output);
			//bw = new BufferedWriter(fw);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public String ReadLine() throws IOException {
		String temp=null;
		if((temp=br.readLine())!=null)
		return temp;
		else{
			temp=null;
			return temp;
		}
		}
	
	
	protected void finalize() throws Throwable {
	     try {
	         br.close();        // close open files
	     } finally {
	         super.finalize();
	     }
	 }
		
	//public String writetoFile(){
	//	bw.write();
	//	}
		
	/*public void close(){
		try {
			br.close();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}	

