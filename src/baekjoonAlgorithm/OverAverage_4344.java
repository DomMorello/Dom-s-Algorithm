package baekjoonAlgorithm;
import java.io.*;
import java.util.Arrays;
/**
 * @author Dom_Morello
 * @Project Algorithm
 * @Date 2019. 10. 22.
 */
public class OverAverage_4344 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		int sum;
		float average;
		int students;	//평균을 넘는 학생수
		
		//테스트 case만큼의 반복을 실행
		for(int i=0; i < size; i++) {
			sum = 0;
			average = 0.0f;
			students = 0;	//이 변수들은 케이스마다 다 다른 값이 저장돼야 하기 때문에 매 반복마다 0으로 초기화함
			
			String[] input = br.readLine().split(" ");	//공백을 기준으로 입력값을 문자열배열에 저장
			//String배열을 int배열로 변환
			int[] arr = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
			
			for(int j=1; j <= arr[0]; j++) {
				sum += arr[j];	//평균을 구하기 위해서 합을 구함
			}
			average = (float)sum/arr[0];	//평균을 구한 후
			
			for(int k=1; k <= arr[0]; k++) {
				if(arr[k] > average)	//평균보다 높은 학생의 수를 구하고
					students++;
			}
			System.out.printf("%.3f%%\n", (float)students/arr[0]*100);	//그 학생들의 비율을 출력한다.
		}//outer for 끝
	}
}
