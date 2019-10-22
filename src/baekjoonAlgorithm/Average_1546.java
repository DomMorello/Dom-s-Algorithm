package baekjoonAlgorithm;
import java.io.*;
import java.util.*;
/**
 * @author Dom_Morello
 * @Project Algorithm
 * @Date 2019. 10. 21.
 */
public class Average_1546 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int size = Integer.parseInt(br.readLine());
		int[] score = new int[size];
		int max = score[0];	//실제로 세준이의 기말고사 성적 중 가장 잘 받은 성적 .즉, 최댓값
		
		String scores = br.readLine();
		StringTokenizer st = new StringTokenizer(scores);
		
		//입력받은 값을 score배열에 순차적으로 저장
		for(int i=0; i < score.length; i++) {
			score[i] = Integer.parseInt(st.nextToken());	//공백을 기준으로 토큰화 한 후 정수배열에 저장
		}
		
		//score배열 중 세준이 가 받은 실제 점수중 가장 높은 점수를 max에 저장
		for(int i=0; i < score.length; i++) {
			if(max < score[i])
				max = score[i];
		}

		float[] fakeScore = new float[size];	//세준이가 조작한 새로운 점수를 담는 배열 생성
		//세준이의 방법대로 조작한 새로운 가짜점수 배열 내용 저장
		for(int i=0; i < fakeScore.length; i++) {
			fakeScore[i] = (float)score[i]/max*100;	//문제에 제시된 세준이가 조작하는 방법
		}
		
		float sum = 0.0f;
		
		//가짜 점수 배열 안에 들어있는 모든 요소를 합해서 sum을 구함
		for(int i=0; i < fakeScore.length; i++) {
			sum += fakeScore[i];
		}
		float average = (float)sum/size;
		bw.write(average+"\n");
		bw.flush();
		bw.close();
		br.close();
	}

}
