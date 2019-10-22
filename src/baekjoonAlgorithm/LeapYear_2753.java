package baekjoonAlgorithm;
import java.io.*;
import java.util.*;
/**
 * @author Dom_Morello
 * @Project Algorithm
 * @Date 2019. 10. 17.
 */
public class LeapYear_2753 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(bf.readLine());
		
		if(input % 4 == 0 && (input % 100 != 0 || input % 400 == 0)) {
			//¿±≥‚¿Ã∏È
			System.out.println("1");
		}else {
			//¿±≥‚¿Ã æ∆¥œ∏È
			System.out.println("0");
		}
		
		
	}

}
