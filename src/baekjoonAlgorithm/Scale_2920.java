package baekjoonAlgorithm;
import java.io.*;
/**
 * @author Dom_Morello
 * @Project Algorithm
 * @Date 2019. 10. 21.
 */
public class Scale_2920 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split(" ");
		int[] arr = new int[input.length];
		
		//String배열에 있는 요소들을 int로 캐스팅한 후 int배열에 복제함.
		for(int i=0; i < input.length; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		String answer = "";	//출력할 값을 만들기 위해 생성
		
		//배열의 바로 다음 값이 전 값에서 1을 더한 것이 맞다면 오름차순, 1을 뺀 값과 같으면 내림차순
		for(int i=0; i < arr.length-1; i++) {
			if(arr[i+1] == arr[i]+1) {
				answer = "ascending";
			}else if(arr[i+1] == arr[i]-1) {
				answer = "descending";
			}else {	//그 두 가지 상황이 하나라도 아니면 mixed를 저장하고 바로 break;
				answer = "mixed";
				break;
			}
		}
		bw.write(answer);
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
