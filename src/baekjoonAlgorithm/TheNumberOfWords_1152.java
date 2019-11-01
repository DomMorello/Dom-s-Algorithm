package baekjoonAlgorithm;
import java.io.*;
import java.util.StringTokenizer;
/**
 * @author Dom_Morello
 * @Project Algorithm
 * @Date 2019. 11. 1.
 */
public class TheNumberOfWords_1152 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input = br.readLine().trim();
		StringTokenizer st = new StringTokenizer(input);
		bw.write(st.countTokens()+"");
		bw.flush();
		br.close();
		
		
		/*
		 * 처음에 이렇게 했었는데 문제가 없어보이지만 이렇게 split을 이용해서 공백을 기준으로 배열로 담았을 때
		 * 아무것도 입력하지 않거나 공백만 입력했을 때 input.length가 1로 나온다. 
		 * 이를 검사하기 위해서 아무것도 입력하지 않고 input.length가 null값인지 검사해봤는데 false가 나온다.
		 * 즉, null값이 아닌 무언가가 배열의 요소로 들어간다는 것을 확인했다. 그러나 StringTokenizer는 토큰으로
		 * 나누기 때문에 아무것도 입력하지 않거나 공백만 입력한 경우 토큰의 개수가 0으로 나오는 것을 알 수 있었다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input = br.readLine().trim().split(" ");
		
		bw.write(input.length+"");
		bw.flush();
		br.close();
		*/
	}

}
