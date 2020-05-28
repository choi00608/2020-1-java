package week3;

public class MultiplicationTable {
	public static void main(String[] args) {

		int j;
		int i;
		for(i=1;i<10;i++) {
			for(j=1;j<10;j++) {

				System.out.print(i + "x" + j + "=" + i*j + "\t");
				if(j==9) {
					System.out.println("\n");
				}
			}
		}

	}

}
