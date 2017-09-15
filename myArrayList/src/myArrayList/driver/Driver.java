package myArrayList.driver;

import java.io.IOException;

import myArrayList.MyArrayList;
import myArrayList.test.MyArrayListTest;
import myArrayList.util.FileProcessor;
import myArrayList.util.Results;

/**
 * 
 * @author Achal
 *
 */
public class Driver {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		
		try {
			MyArrayList list = new MyArrayList();
			FileProcessor fp = new FileProcessor(args[0], args[1]);
			Results result = new Results(fp);
			String line;
			if (args == null || args.length != 2) {
				System.out.println("Invalid number of arguments");
				System.exit(1);
			}

			while ((line = fp.ReadLine()) != null) {
				try {
					list.insertSorted(Integer.parseInt(line));
				} catch (NumberFormatException nfe) {
					System.err.println(nfe.getMessage());
					System.exit(1);
				}
			}
			result.writeToFile("The sum of all the values in arrayList is: " + list.sum());
			MyArrayListTest test = new MyArrayListTest();
			test.testMe(new MyArrayList(), result);
			fp.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
			System.exit(1);
		}
	}

}
