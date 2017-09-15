package myArrayList.util;

import java.io.IOException;

public class Results implements FileDisplayInterface, StdoutDisplayInterface {

	private FileProcessor fp;

	public Results(FileProcessor fpIn) {

		fp = fpIn;

	}

	@Override
	public void writeToFile(String s) {
		try {
			fp.write(s);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	@Override
	public void writeToStdout(String s) {
		// TODO Auto-generated method stub

	}
	
	public void storeNewResult(String testName, boolean result) throws IOException{
		if(result){
			fp.write("test "+testName+" passed");
		}
		else{
			fp.write("test "+testName+" failed");
		}
	}

}
