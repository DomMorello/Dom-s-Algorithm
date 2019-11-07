package baekjoonAlgorithm;

import java.io.*;
import java.util.*;

/**
 * @author Dom_Morello
 * @Project Algorithm
 * @Date 2019. 11. 6.
 */
public class GroupWordChecker_1316 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int times = Integer.parseInt(br.readLine()); // ù °�ٿ� �� ���� �ܾ �Է¹����� ���Ѵ�.
		int copyTimes = times;
		for (int i = 0; i < times; i++) { // �Է� �޴� ���� ù°�ٿ� �־��� ������ŭ �ݺ��Ѵ�.
			List<String> list = new LinkedList<>();
			String[] input = br.readLine().split("");
			list.add(input[0]); // ù ��° ��Ҵ� �ϴ� list�� �־�д�
			// �ι�° ��Һ��� ù��° ��ҿ� ���ؼ� ���� ���ڰ� ���ӵǸ� �����ϰ� �ߺ��� �� �ǰ� �� ���ھ��� list�� �ִ´�.
			//ex) happy -> h,a,p,y  hhhaappyyh -> h,a,p,y,h
			for (int j = 1; j < input.length; j++) {
				if (!input[j].equals(input[j - 1])) {
					list.add(input[j]);
				}
			}
			// ���ο� �迭�� ���� ���� ������ list������� ���ο� �迭 input2�� ��´�.
			Iterator<String> it = list.iterator();
			String[] input2 = new String[list.size()];
			for (int k = 0; k < list.size(); k++) {
				if (it.hasNext()) {
					input2[k] = (String) it.next();
				}
			}
			//input2�迭�� �˻��Ͽ� �׷�ܾ �ƴϸ� ó�� �Է��� �ܾ��� �������� 1��ŭ ���ҽ�Ų��.
			Loop1: for (int l = 2; l < input2.length; l++) {	//ù��°, �ι�°�� �˻��� �ʿ䰡 ��� 2��° ���� �˻� ����
				for (int m = 0; m <= l - 2; m++) {	//�ش� ������ �������� �񱳸� �ؼ� �ش� ���ڰ� �־����� �׷�ܾ �ƴ�
					if (input2[l].equals(input2[m])) {	//��, � �� ���ڰ� �ߺ��ż� ��Ÿ���� �׷�ܾ �ƴ� ����. 
						copyTimes--;	//�׷�ܾ �ƴϹǷ� ó���� �Է��� �ܾ��� �������� 1�� �����Ѵ�.
						break Loop1;
					}
				}
			}
		}
		bw.write(copyTimes + "");
		bw.flush();
		br.close();
	}
}
