package baekjoonAlgorithm;
import java.io.*;
import java.util.*;
public class PlusCycle_1110 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = bf.readLine();
		String copyInput = input;
		int cnt=0;
		
		while(true) {
			int intInput = Integer.parseInt(input);
			
			if(intInput >= 0 && intInput < 10) {
				input = "0"+intInput;
			}
			String[] splitedNum = input.split("");
			int first = Integer.parseInt(splitedNum[0]);
			int second = Integer.parseInt(splitedNum[1]);
			String hab = String.valueOf(first + second);
			int intHab = Integer.parseInt(hab);
			
			if(intHab > 9) {
				hab = String.valueOf(intHab % 10);
			}
			
			input = second + hab;
			cnt++;
			
			if(input.equals(copyInput)) {
				System.out.println(cnt);
				break;
			}
			int intInputFinal = Integer.parseInt(input);
			if(intInputFinal >= 0 && intInputFinal < 10) {
				if(input.equals("0" + copyInput)) {
					System.out.println(cnt);
					break;
				}
			}
			
		}//while ³¡
		bf.close();
		
	}

}
