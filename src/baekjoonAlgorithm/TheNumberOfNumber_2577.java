package baekjoonAlgorithm;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
/**
 * @author Dom_Morello
 * @Project Algorithm
 * @Date 2019. 10. 21.
 */
public class TheNumberOfNumber_2577 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input1 = Integer.parseInt(br.readLine());
		int input2 = Integer.parseInt(br.readLine());
		int input3 = Integer.parseInt(br.readLine());
		
		String multiply = String.valueOf(input1*input2*input3);	//곱한 수를 문자열로 저장한 후
		int[] arr = new int[multiply.length()];	//정수 배열에 담으려고 배열 생성
		
		//곱해서 나온 문자열을 정수로 변환하여 정수배열에 저장
		for(int i=0; i < multiply.length(); i++) {
			arr[i] = multiply.charAt(i)-'0';	//char 타입의 요소를 정수형으로 바꿔서 int배열에 담음
		}
		
		int[] count = new int[10];	//각 0~9가 몇번 나오는지 세기 위한 배열
		
		//각 요소가 0~9까지 일치하면 count배열의 요소를 하나씩 증가시키면서 센다.
		for(int i=0; i < arr.length; i++) {
			if(arr[i]==0) count[0]++;
			if(arr[i]==1) count[1]++;
			if(arr[i]==2) count[2]++;
			if(arr[i]==3) count[3]++;
			if(arr[i]==4) count[4]++;
			if(arr[i]==5) count[5]++;
			if(arr[i]==6) count[6]++;
			if(arr[i]==7) count[7]++;
			if(arr[i]==8) count[8]++;
			if(arr[i]==9) count[9]++;
		}
		//한 줄에 한 요소씩 출력
		for(int i=0; i < count.length; i++) {
			bw.write(count[i]+"\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
