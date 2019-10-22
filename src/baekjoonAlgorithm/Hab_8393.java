package baekjoonAlgorithm;
import java.io.*;
import java.util.*;
public class Hab_8393 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(bf.readLine());
		int sum = 0;
		
		for(int i=1; i <= input; i++) {
			sum += i;
		}
		
		bw.write(String.valueOf(sum));
		bw.close();
	}

}
