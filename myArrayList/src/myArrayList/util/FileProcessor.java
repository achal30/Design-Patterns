package myArrayList.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * @author Achal
 *
 */
public class FileProcessor {
	 
	private BufferedReader br;
	private BufferedWriter bw;

	/**
	 * 
	 * @param input
	 * @param output
	 */
	public FileProcessor(String input, String output) {
		try {
			br = new BufferedReader(new FileReader(input));
			File f = new File(output);
			if (f.exists()) {
				f.delete();
			}
			f.createNewFile();

			bw = new BufferedWriter(new FileWriter(f));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(1);
		}

	}

	/**
	 * reads line from the file
	 * @return
	 * @throws IOException
	 */
	public String ReadLine() throws IOException {
		return br.readLine();
	}

	/**
	 * writes a line to the file
	 * @param line
	 * @throws IOException
	 */
	public void write(String line) throws IOException {
		bw.write(line+"\n");
		// System.out.println(line);
	}


	/**
	 * closes the file
	 * @throws IOException
	 */
	public void close() throws IOException {
		br.close();
		bw.close();
	}
}
