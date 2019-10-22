package baekjoonAlgorithm;
import java.io.*;
public class Star2_2439 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int size = Integer.parseInt(bf.readLine());
		
		for(int i=0; i < size; i++) {
			for(int j=0; j < size-i-1; j++) {
				bw.write(" ");
			}
			for(int k=0; k <= i; k++) {
				bw.write("*");
			}
			bw.newLine();
		}
		bw.flush();
	}
}
