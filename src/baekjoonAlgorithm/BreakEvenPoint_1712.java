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
		
		int fixed = Integer.parseInt(input[0]);	//�������
		int variable = Integer.parseInt(input[1]);	//�������
		int price = Integer.parseInt(input[2]);	//��ǰ ����
		
		/* 1)���ͺб����� �ִ� ���
		 * ���� = price * n
		 * ������  = ���� (price*n)- �Ѻ��(fixed + variable*n)
		 * 	    = (price - variable)*n-fixed
		 * ��, ������ > 0 �� n�� ���ؾ� �Ѵ�.
		 * 2)���ͺб����� ���� ���
		 * -�ƹ��� �ȾƵ� �������� 0���� ���� ���.
		 * price - variable <= ���� ���� 0���� ���� ���� �Ѵ븦 �Ǹ��� ������ ��� �Ǹ��Ҽ��� ��� �������� 0���� �����Ƿ� ���ͺб����� ����.
		 * �� ���� ���� 0�̾ �Ǹ��Ҷ� ���� �̵��� �ϳ��� ���� ������븸 �ִ� �����̹Ƿ� ��� �ǸŸ� �ص� ���ͺб����� ����.
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
