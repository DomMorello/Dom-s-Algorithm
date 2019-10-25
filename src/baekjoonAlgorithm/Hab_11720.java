package baekjoonAlgorithm;
import java.io.*;
import java.util.*;
public class Hab_11720 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String size = br.readLine();	//다음으로 숫자 몇개 쓸지 받는 것
		String[] num = br.readLine().split("");	// 입력받는 숫자들을 한 자리씩 나눠서 배열에 담음
		
		int[] intNum = Arrays.stream(num).mapToInt(Integer::parseInt).toArray();	//String배열을 int배열로 변환
		
		int result = 0;
		for(int i=0; i < intNum.length; i++) {
			result += intNum[i];
		}
		
		System.out.println(result);
	}

}
