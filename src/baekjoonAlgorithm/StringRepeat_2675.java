package baekjoonAlgorithm;
import java.io.*;
import java.util.Arrays;
/**
 * @author Dom_Morello
 * @Project Algorithm
 * @Date 2019. 10. 29.
 */
public class StringRepeat_2675 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int times = Integer.parseInt(br.readLine());	//테스트케이스를 몇 번 받을지를 정하는 값을 입력받음
		
		for(int k=0; k < times; k++) {	//테스트회수만큼 입력받아서 실행한다.
			String[] inputArr = br.readLine().split(" "); //입력값을 띄어쓰기를 기준으로 두 개의 배열요소로 저장
			for(int i=0; i < inputArr[1].length(); i++) {	//[1]요소가 반복할 문자열이므로 그 길이만큼 반복
				for(int j=0; j < Integer.parseInt(inputArr[0]); j++) {	//[0]요소가 문자열의 글자를 몇 번 출력할지 정함
					System.out.print(inputArr[1].charAt(i));	//문자열을 처음부터 끝까지 한 글자씩 반복 출력함
				}//가장 안 for 끝
			}//중간 for 끝
			System.out.println();
		}//바깥 for 끝
		
		br.close();
	}
}
