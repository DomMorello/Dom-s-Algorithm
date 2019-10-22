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
		int max = score[0];	//������ �������� �⸻��� ���� �� ���� �� ���� ���� .��, �ִ�
		
		String scores = br.readLine();
		StringTokenizer st = new StringTokenizer(scores);
		
		//�Է¹��� ���� score�迭�� ���������� ����
		for(int i=0; i < score.length; i++) {
			score[i] = Integer.parseInt(st.nextToken());	//������ �������� ��ūȭ �� �� �����迭�� ����
		}
		
		//score�迭 �� ������ �� ���� ���� ������ ���� ���� ������ max�� ����
		for(int i=0; i < score.length; i++) {
			if(max < score[i])
				max = score[i];
		}

		float[] fakeScore = new float[size];	//�����̰� ������ ���ο� ������ ��� �迭 ����
		//�������� ������ ������ ���ο� ��¥���� �迭 ���� ����
		for(int i=0; i < fakeScore.length; i++) {
			fakeScore[i] = (float)score[i]/max*100;	//������ ���õ� �����̰� �����ϴ� ���
		}
		
		float sum = 0.0f;
		
		//��¥ ���� �迭 �ȿ� ����ִ� ��� ��Ҹ� ���ؼ� sum�� ����
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
