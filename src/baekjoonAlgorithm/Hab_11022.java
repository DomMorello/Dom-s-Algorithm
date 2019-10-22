package baekjoonAlgorithm;
import java.io.*;
import java.util.*;

public class Hab_11022 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int times = Integer.parseInt(bf.readLine());
		
		for(int i=0; i < times; i++) {
			String inputNum = bf.readLine();
			StringTokenizer st = new StringTokenizer(inputNum);
			String first = st.nextToken();
			String second = st.nextToken();
			
			bw.write("Case #"+(i+1)+": "+first+" + "+second+" = "+String.valueOf(Integer.parseInt(first) + Integer.parseInt(second))+"\n");
		}
		bw.flush();
	}
}
