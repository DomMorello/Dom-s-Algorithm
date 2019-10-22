package baekjoonAlgorithm;
import java.io.*;

public class Googoodan_2739 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(bf.readLine());
		
		for(int i=1; i < 10; i++) {
			System.out.println(input+" * "+i+" = "+i*input);
		}
	}

}
