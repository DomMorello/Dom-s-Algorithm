package baekjoonAlgorithm;
import java.io.*;
import java.util.*;

/**
 * @author Dom_Morello
 * @Project Algorithm
 * @Date 2019. 10. 22.
 */
public class SelfNumber_4673 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer> allNum = new ArrayList<>(10000);
		//1부터 10000까지 수를 ArrayList에 일단 저장
		for(int i=1; i <= 10000; i++) {
			allNum.add(i);	
		}
		int digitSum;	//각 자릿수의 합
		int plus;	//원래 수에 각 자릿수의 합을 더한 값
		int digit;	//각 자릿수를 저장하기 위한 변수
		int number;	//1~10000까지의 수
		
		for(int i=1; i <= 10000; i++) {
			digitSum = 0;	//매 반복마다 0으로 초기화
			plus = 0;	//매 반복마다 0으로 초기화
			number = i;	//매 반복마다 i로 초기화(반복 실행시마다 다음 숫자를 검사하기 위해 i로 초기화)
			while(number != 0) {	//
				digit = number % 10;	//number의 마지막 자릿수 ex)1456 --> 6
				digitSum += digit;	//각 자릿수를 계속 더함
				number /= 10;	//다음 자릿수를 구하기 위해 10으로 나눠줌 ex)1456 --> 145
			}//while 끝
			
			plus = i + digitSum;	//ex) 1456 --> plus = 1456 + (1+4+5+6)
			if(allNum.contains(new Integer(plus))) {	//allNum ArrayList에 plus값과 일치하는 값이 있으면 이는 생성자가 있으므로 셀프넘버가 아님
				allNum.remove(new Integer(plus));	//그래서 리스트에서 이 값을 제거해줌
			}
		}//for 끝
		Iterator it = allNum.iterator();
		
		//모든 반복문을 끝내서 생성자가 있는 셀프넘버가 아닌 숫자들을 리스트에서 제거하고 남아있는 셀프넘버들만 출력
		while(it.hasNext()) {
			bw.write(it.next()+"\n");
		}
		bw.flush();
	}
}
