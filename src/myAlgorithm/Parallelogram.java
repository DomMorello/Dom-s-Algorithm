package myAlgorithm;

public class Parallelogram {
	public static void main(String[] args) {
		int count = 0;
		for(int i=1; i < 6; i++) {
			for(int j=5; j > i; j--) {
				System.out.print("   ");
			}
			
			for(int k=0; k < i; k++) {
				count++;
				System.out.printf("%3d",count);
			}
			System.out.println();
		}
		
		int count2 = 0;
		for(int i=1; i < 6; i++) {
			System.out.print(" ");
			for(int j=0; j < 6-i; j++) {
				count2++;
				System.out.printf("%-3d", count2);
			}
			System.out.println();
		}
	}
}
