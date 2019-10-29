package baekjoonAlgorithm;
import java.io.*;
import java.util.Arrays;
/**
 * @author Dom_Morello
 * @Project Algorithm
 * @Date 2019. 10. 29.
 */
public class FindingAlphabet_10809 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine(); //string배열로 전환
		char[] inputArr = input.toCharArray(); //입력 받은 값을 char[]로 변환
		
		int[] alphabet = new int[26];
		//알파벳 정수 배열에 a~z까지 char에 해당하는 정수를 저장
		for(int i=0; i < alphabet.length; i++) {
			alphabet[i] = i+97;
		}
		
		int[] check = new int[26];	//배열에 변화가 없는 부분을 -1로 바꾸기 위해 검사하는 배열
		
		for(int i=0; i < inputArr.length; i++) {
			for(int j=0; j < alphabet.length; j++) {
				if((int)inputArr[i] == alphabet[j]) {	//inputArr의 i번째 요소가 알파벳배열의 j번째 요소와 같다면
					alphabet[j] = i;	//i가 그 위치를 의미하므로 알파벳 배열에 그 위치를 나타내도록 저장
					check[j] = 1;	//알파벳 배열과 크기가 같은 배열을 생성하고 기본으로 전부 0으로 저장돼있지만 변화가 있으면 1을 저장함
					break;
				}
			} 
		}
		//변화가 없는 부분은 -1로 바꾼다.
		for(int i=0; i < check.length; i++) {
			if(check[i] == 0) {	//변화가 있는 부분을 1로 변경했으니 변화가 없던, 즉, 0으로 남아있는 요소들의 위치에 있는 알파벳 배열을 -1로 바꾼다
				alphabet[i] = -1;
			}
		}
		//정답 출력
		for(int i=0; i < alphabet.length; i++) {
			System.out.print(alphabet[i]+" ");
		}
	}
}
