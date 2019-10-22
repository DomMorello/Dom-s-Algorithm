package baekjoonAlgorithm;
import java.io.*;
public class OXQuiz_8958 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int size = Integer.parseInt(br.readLine());
		String[] score = null;	//배열로 선언한 이유는 ox를 각각 하나씩 배열로 저장하기 위해서임
		
		int sum;
		//OXOXOXOXX 와 같이 문자열 하나를 받아서 문자단위로 쪼개 문자열 배열인 score에 담는다.
		for(int i=0; i < size; i++) {
			int plus = 0;	//연속된 O의 경우 값을 증가시키기 위해 선언
			sum = 0;	//매 반복마다 새로운 sum을 계산해야 하기 때문에 0으로 초기화
			score = br.readLine().split("");
			
			for(int j=0; j < score.length; j++){
				if(score[j].equals("O")) {	//score배열의 각 요소가 O와 같으면
					plus++;	//점수를 1증감하고
					sum += plus;	//이 점수들을 누적해서 sum에 더한다
				}else if(score[j].equals("X")) {	//X를 만나면
					plus = 0;	//증감되던 점수를 0으로 초기화
				}
			}//inner for끝
			bw.write(sum+"\n");
		}//outer for 끝
		bw.flush();
		br.close();
	}
}

