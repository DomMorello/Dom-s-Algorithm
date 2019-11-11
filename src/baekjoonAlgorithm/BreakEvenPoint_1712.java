package baekjoonAlgorithm;
import java.io.*;
/**
 * @author Dom_Morello
 * @Project Algorithm
 * @Date 2019. 11. 8.
 */
public class BreakEvenPoint_1712 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input = br.readLine().split(" ");
		
		int fixed = Integer.parseInt(input[0]);	//고정비용
		int variable = Integer.parseInt(input[1]);	//가변비용
		int price = Integer.parseInt(input[2]);	//상품 가격
		
		/* 1)손익분기점이 있는 경우
		 * 매출 = price * n
		 * 순이익  = 매출 (price*n)- 총비용(fixed + variable*n)
		 * 	    = (price - variable)*n-fixed
		 * 즉, 순이익 > 0 인 n을 구해야 한다.
		 * 2)손익분기점이 없는 경우
		 * -아무리 팔아도 순이익이 0보다 작은 경우.
		 * price - variable <= 둘의 차가 0보다 작을 떄는 한대를 판매할 때부터 계속 판매할수록 계속 순이익이 0보다 작으므로 손익분기점이 없다.
		 * 위 둘의 차가 0이어도 판매할때 마다 이득이 하나도 없고 고정비용만 있는 상태이므로 계속 판매를 해도 손익분기점이 없다.
		 */
		
		if(price - variable <= 0) {
			bw.write("-1");
		}else if(fixed/(price - variable)+1 > 0){
			bw.write(fixed/(price - variable)+1+"");
		}
		bw.flush();
		br.close();
	}
}
