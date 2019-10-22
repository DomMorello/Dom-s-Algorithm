package baekjoonAlgorithm;
import java.io.*;
import java.util.*;
public class BaekJoon_10950 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int times = Integer.parseInt(bf.readLine());
		
		
		
		for(int i=0; i < times; i++) {
			String num = bf.readLine();
			StringTokenizer st = new StringTokenizer(num);
			System.out.println(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
		}
	}

}
