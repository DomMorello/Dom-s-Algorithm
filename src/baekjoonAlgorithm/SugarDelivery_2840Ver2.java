package baekjoonAlgorithm;
import java.io.*;
/**
 * @author Dom_Morello
 * @Project Algorithm
 * @Date 2019. 11. 24.
 */
public class SugarDelivery_2840Ver2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int input = Integer.parseInt(br.readLine());	//총 운반해야 하는 설탕량
		br.close();
		
		int result = 0;	//박스개수
		while(true) {
			if(input % 5 == 0) {
				result += input/5;	//5로 나눠지면 그냥 5로 나눈 박스개수가 제일 효율적, 3씩 빼다가 5로 나눠지면 박스에 5로 나눈 값을 추가
				break;
			}
			input -= 3;	//반복하면서 입력값(운반해야할 설탕량)에서 3kg씩 빼고 
			result += 1;	//3키로를 뺐으니 1개의 box를 추가한다.
			if(input < 0) {
				result = -1;	//만약 이런식으로 차감을 반복했는데 딱 나누어 떨어지지 않고 0보다 작아지면 운반할 수 없는 양이 된다.
				break;
			}
		}
		
		bw.write(result+"");
		bw.flush();
	}
}
