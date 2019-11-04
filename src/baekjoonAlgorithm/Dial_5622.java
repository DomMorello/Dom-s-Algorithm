package baekjoonAlgorithm;
import java.io.*;

/**
 * @author Dom_Morello
 * @Project Algorithm
 * @Date 2019. 11. 3.
 */
public class Dial_5622 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char[] input = br.readLine().toCharArray();
		
		char[][] alphabet = {
				{'A','B','C'},	
				{'D','E','F'},	
				{'G','H','I'},	
				{'J','K','L'},
				{'M','N','O'},
				{'P','Q','R','S'},
				{'T','U','V'},
				{'W','X','Y','Z'}
		};
		int num = 0;
		for(int i=0; i < input.length; i++) {	//char배열을 하나씩 검사
			for(int j=0; j < alphabet.length; j++) {	
				for(int k=0; k < alphabet[j].length; k++) {	//첫 행부터 검사
					if(input[i] == alphabet[j][k]){
						num += (j+3);	//alphabet[j][k]에서 j는 가로 즉 그 문자가 
						break;			//위치한 번호-2가 적혀있다. 
										//ex)A는 j=0에 위치해 있으니 +2를 해줘야 한다. 
										//그런데 2에서 다이얼을 돌릴 때 3초 걸리니 위치값+1을 해줘야 한다.
										//즉, +3 을 해줘야 문제에서 원하는 정수합을 구할 수 있다.
					}//if 끝
				}//3중 for끝
			}//2중 for끝
		}//처음 for끝
		bw.write(num+"");
		bw.flush();
		br.close();
	}
}
