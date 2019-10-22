package baekjoonAlgorithm;
import java.io.*;
import java.util.*;
public class Hab_10952 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		
		while(true) {
			String input = bf.readLine();
			StringTokenizer st = new StringTokenizer(input);
			
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());
			
			if(first == 0 && second == 0)
				break;
			
			bw.write(first + second +"\n");
		}
		bw.flush();
		bw.close();
		bf.close();
	}
}
