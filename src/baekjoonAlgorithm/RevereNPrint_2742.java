package baekjoonAlgorithm;
import java.io.*;
import java.util.*;
public class RevereNPrint_2742 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(bf.readLine());
		
		for(int i=input; i > 0; i--) {
			bw.write(i+"\n");
		}
		bw.flush();
	}

}
