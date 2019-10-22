package baekjoonAlgorithm;
import java.io.*;
import java.util.*;
public class NPrint_2741 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(bf.readLine());
		
		for(int i=1; i <= input; i++) {
			bw.write(i+"\n");
		}
		bw.flush();
	}

}
