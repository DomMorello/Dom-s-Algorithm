package baekjoonAlgorithm;
import java.io.*;
/**
 * @author Dom_Morello
 * @Project Algorithm
 * @Date 2019. 11. 24.
 */
public class SugarDelivery_2839 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int input = Integer.parseInt(br.readLine());
		
		int result = -1;	//아래 코드에 모두 해당하지 않으면 -1 을 출력
		int tmp = 0;	//5를 하나씩 빼면서 계산하기 위한 임시공간
		//일단 5로 나눠지면 5로 나눈 값이 최대효율
		if(input%5 == 0) {
			result = input/5;
		//5로 나눈 나머지가 3이면 5로 다 나누고 나머지 3을 한 봉지로 처리하면 됨
		}else if((input%5)%3 == 0){
			result = input/5 + (input%5)/3;
		//그 외에 경우에는
		}else if((input%5)%3 != 0) {	
			for(int i=0; i < input/5; i++) {	//그대로 있는 상태부터 계산을 하는데 5를 하나씩 빼면서 계산
				tmp = input - 5*i;
				if(tmp == 12) {	//5를 i개 빼서 12가 남으면 아래와 같이 해결하면 최대효율
					result = i + 4;
					break;
				}else if(tmp == 9) {	//5를 i개 빼서 9가 남으면 아래와 같이 해결하면 최대효율
					result = i + 3;
					break;
				}else if(tmp == 6) {	//5를 i개 빼서 6이 남으면 아래와 같이 해결하면 최대효율
					result = i + 2;
					break;
				}
			}//for 끝
		}
		bw.write(result+"");
		bw.flush();
		br.close();
	}
}
