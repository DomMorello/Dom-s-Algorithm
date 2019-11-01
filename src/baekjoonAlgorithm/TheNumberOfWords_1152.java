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
		 * ó���� �̷��� �߾��µ� ������ ��������� �̷��� split�� �̿��ؼ� ������ �������� �迭�� ����� ��
		 * �ƹ��͵� �Է����� �ʰų� ���鸸 �Է����� �� input.length�� 1�� ���´�. 
		 * �̸� �˻��ϱ� ���ؼ� �ƹ��͵� �Է����� �ʰ� input.length�� null������ �˻��غôµ� false�� ���´�.
		 * ��, null���� �ƴ� ���𰡰� �迭�� ��ҷ� ���ٴ� ���� Ȯ���ߴ�. �׷��� StringTokenizer�� ��ū����
		 * ������ ������ �ƹ��͵� �Է����� �ʰų� ���鸸 �Է��� ��� ��ū�� ������ 0���� ������ ���� �� �� �־���.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input = br.readLine().trim().split(" ");
		
		bw.write(input.length+"");
		bw.flush();
		br.close();
		*/
	}

}
