package question3.solutionWithGC;

public class OutOfMemoryWithGC {
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		int i = 0;
		do {
			sb.append("String ").append(i).append(": sample text to apppend");
			if (i % 100000 == 0) {
				sb = new StringBuffer();
				System.gc();
                System.out.println("Record appended: " + i);
			}
			i++;
		} while (i < Integer.MAX_VALUE);
	}

}
