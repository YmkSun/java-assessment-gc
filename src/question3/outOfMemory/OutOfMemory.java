package question3.outOfMemory;

public class OutOfMemory {
	
	public static void main(String[] args) {
		try {
			StringBuffer sb = new StringBuffer();
			int i = 0;
			do {
				sb.append("String ").append(i).append(": sample text to apppend");
				i++;
			} while (i < Integer.MAX_VALUE);
		} catch (OutOfMemoryError oome) {
			System.out.println("Out of Memory with String Buffer: " + oome.getMessage());
		}
	}

}
