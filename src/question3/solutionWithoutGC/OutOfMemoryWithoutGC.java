package question3.solutionWithoutGC;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class OutOfMemoryWithoutGC {
	
	public static void main(String[] args) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
			int i = 0;
			do {
				writer.write("String " + i + ": sample text to apppend");
				if (i % 100000 == 0) {
	                System.out.println("Record appended: " + i);
				}
				i++;
			} while (i < Integer.MAX_VALUE);
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
			
		}
	}

}
