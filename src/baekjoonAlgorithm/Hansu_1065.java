package baekjoonAlgorithm;
import java.io.*;
import java.util.Arrays;
/**
 * @author Dom_Morello
 * @Project Algorithm
 * @Date 2019. 10. 23.
 */
public class Hansu_1065 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String size1 = br.readLine();
		int size = Integer.parseInt(size1);
		int[] digitArr = new int[size1.length()];
		int[] num = new int[size];
		int[] gap = new int[size1.length()-1];
		int digit;
		int count=0;
		
		//1부터 입력받는 값까지 배열의 내용을 초기화 ex) 1,2,3,4,...,89,99,100,...,1000
		for(int i=0; i < num.length; i++) {
			num[i] = i+1;
		}
		
		if(size < 100) {	//100미만의 수는 전부 다 한수
			count = size;
			System.out.println(count);
		}else if(size >= 100 && size < 1000){
			
			for(int i=99; i < num.length; i++) {
				
				//각 요소의 자릿수를 나눠서 배열에 저장(이후에 각 자릿수가 등차수열을 이루는지 검사하기 위해 저장 )
				int j = 0;
				while(num[i] != 0) {
					digit = num[i] % 10;
					digitArr[j] = digit;	
					j++;
					num[i] /= 10;
					
				}//while 끝
				//각 자릿수의 차를 gap배열에 저장
				for(int k=0; k < gap.length; k++) {
					gap[k] = digitArr[k]-digitArr[k+1];
				}
				
				//각 자릿수끼리 차를 구하고 이 값이 전부 같으면 count를 1증가시킴
				int check=0;
				for(int l=0; l < gap.length; l++) {
					if(gap[0] == gap[l]) {
						check++;
					}
				}
				if(check == gap.length) {
					count++;
				}
			}//outer for 끝
			System.out.println(count+99);	//99는 1~99까지 모두 한수이기 때문에 더해줌
			
		}else {	//1000을 입력받으면 위 논리에 outofindexException발생해서 따로 처리
			count = 144;
			System.out.println(count);
		}
	}
}
