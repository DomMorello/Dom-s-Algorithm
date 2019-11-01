package baekjoonAlgorithm;
import java.io.*;
/**
 * @author Dom_Morello
 * @Project Algorithm
 * @Date 2019. 11. 1.
 */
public class SangSu_2908 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] inputArr = br.readLine().split(" ");	//첫 줄에 입력하는 값을 띄어쓰기를 구분으로 배열에 담는다.
		char[] firstArr = inputArr[0].toCharArray();	//첫번째 A와 두번째 B를 각각 char배열에 담는다.
		char[] secondArr = inputArr[1].toCharArray();
		
		//char배열을 역순으로 재구성함
		reverseArr(firstArr);
		reverseArr(secondArr);
		
		//String으로 반환된 char배열을 int로 변환(int의 크기를 비교하기 위해서 int로 변환함)
		int first = Integer.parseInt(charArrToString(firstArr));		
		int second = Integer.parseInt(charArrToString(secondArr));
		
		if(first > second) {
			bw.write(first+"");
		}else {
			bw.write(second+"");
		}
	
		bw.flush();
		br.close();
	}
	
	//char배열을 전부 더해서 string으로 반환하는 메서드
	public static String charArrToString(char[] chArr) {
		String result ="";
		for(int i=0; i < chArr.length; i++) {
			result += chArr[i];
		}
		return result;
	}
	
	//char배열을 매개변수로 받아 안에 요소를 역순으로 재구성하는 메서드
	public static void reverseArr(char[] chArr) {
		for(int i=0; i < chArr.length/2; i++) {	//반복을 배열길이의 절반까지만 해야 완벽하게 역순이 됨
			//맨 처음과 맨 마지막 요소의 위치를 바꾸고 그 다음과 마지막-1번째 바꾸는 것을 반복
			char tmp = chArr[i];
			chArr[i] = chArr[chArr.length-1-i];
			chArr[chArr.length-1-i] = tmp;
		}
	}
}
