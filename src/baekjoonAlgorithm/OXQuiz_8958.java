package baekjoonAlgorithm;
import java.io.*;
public class OXQuiz_8958 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int size = Integer.parseInt(br.readLine());
		String[] score = null;	//�迭�� ������ ������ ox�� ���� �ϳ��� �迭�� �����ϱ� ���ؼ���
		
		int sum;
		//OXOXOXOXX �� ���� ���ڿ� �ϳ��� �޾Ƽ� ���ڴ����� �ɰ� ���ڿ� �迭�� score�� ��´�.
		for(int i=0; i < size; i++) {
			int plus = 0;	//���ӵ� O�� ��� ���� ������Ű�� ���� ����
			sum = 0;	//�� �ݺ����� ���ο� sum�� ����ؾ� �ϱ� ������ 0���� �ʱ�ȭ
			score = br.readLine().split("");
			
			for(int j=0; j < score.length; j++){
				if(score[j].equals("O")) {	//score�迭�� �� ��Ұ� O�� ������
					plus++;	//������ 1�����ϰ�
					sum += plus;	//�� �������� �����ؼ� sum�� ���Ѵ�
				}else if(score[j].equals("X")) {	//X�� ������
					plus = 0;	//�����Ǵ� ������ 0���� �ʱ�ȭ
				}
			}//inner for��
			bw.write(sum+"\n");
		}//outer for ��
		bw.flush();
		br.close();
	}
}

