package baekjoonAlgorithm;
import java.io.*;
public class Star_2438 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int size = Integer.parseInt(bf.readLine());
		
		for(int i=0; i < size; i++) {
			for(int j=0; j <= i; j++) {
				bw.write("*");
			}
			bw.newLine();
		}
		bw.flush();
	}

}
