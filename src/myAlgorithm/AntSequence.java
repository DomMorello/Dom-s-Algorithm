package myAlgorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class AntSequence {
	
	public static String getNextSequence(String previous) {
		//"���� + �ش����"�� ������ ������ �迭�� ũ�⸦ ���� ���Ѵ�. 
		String result = "";	//return�� �����
		int repeat = 1;	//�ݺ���
		int size = 1;	//�迭�� ũ��
		if(previous.length() == 1) {	//ó�� ���ڰ� �� �ڸ� ���ڸ� result�� �ٷ� "1 + �ش����"�� ��ȯ
			result += repeat + "" + previous;
		}else {	//���ڿ��� 2�� �̻��̸�
			for(int i=1; i < previous.length(); i++) {
				if(previous.charAt(i-1) != previous.charAt(i)) {
					size++;	//���� ���� ���ڰ� ������ �迭�� ũ�⸦ �ϳ��� �÷��ش�. 
				}
			}//for ��
			String[] pieceArr = new String[size];
			//���ڿ��� �˻��ؼ� "���� + �ش����"�� �̾Ƴ��� �迭�� �����Ѵ�. 
			int idxArr = 0;	//�迭�� �ε���
			String piece = "";	//�迭�� ���� ��� �ϳ�
			repeat = 1;	//�ݺ��Ǹ� �÷��༭ "����+�ش����"���� "����"�� �ش���
			for(int i=1; i < previous.length(); i++) {
				if(previous.charAt(i-1) == previous.charAt(i)) {	//�迭�� i��° ��ҿ� i-1��° ��Ұ� ������ repeat�� �����Ѵ�
					repeat++;
					if(i == previous.length()-1) {	//i�� ������ ����̰� �� ��ҿ� ������ 
						piece = repeat + "" + previous.charAt(i-1);	//�ݺ��� �� + ���������� �ϳ� �� ��Ҹ� piece ���ڿ��� ���
						pieceArr[idxArr] = piece;	//piece�� �迭�� ��´�. idxArr�� ++�� ���� ������ ������ �迭�� �ε����� ������ ������ �ʿ䰡 ����.
					}
				}else {
					if(i == previous.length()-1) {	//������ ��Ҹ� �˻��� �� �� ��ҿ� �ٸ����ڸ�
						piece = repeat + "" + previous.charAt(i-1);	//������ ���ڰ� �� ���ڶ� �ٸ��ٸ� �� �� ���ڿ� �ش��ϴ� repeat + �� ��� �� piece�� ����
						pieceArr[idxArr++] = piece;	//�迭�� �߰��� �� idxArr�� 1 ����������. �ֳ��ϸ� ���� ��Ұ� �� ���� �ϱ� ������ 1����
						piece = 1 + "" + previous.charAt(i);	//�� ��ҿ� ���� �ʱ� ������ repeat�� 1, �׸��� ������ ��Ҹ� piece�� ����
						pieceArr[idxArr] = piece;	//piece�� �迭 ������ �ε����� ����
						break;	//�Ʒ� �ڵ带 �������� �ʰ� �ݺ����� ������.
					}
					piece = repeat + "" + previous.charAt(i-1);	//������ ��Ҹ� �˻��ϴ� ���� �ƴϰ� �� ��ҿ� �ٸ� ���ڶ��
					pieceArr[idxArr++] = piece;	//(repeat�� �ʱⰪ�� 1 + �˻����� �� ���)�� piece�� ���� �� �迭�� ��´�
					piece = "";	//���� ��� �˻縦 ���� piece�� �� ���ڿ��� �ʱ�ȭ
					repeat = 1;	//���� ��� �˻縦 ���� repeat�� 1�� �ʱ�ȭ
				}
			}//for��
			for(int i=0; i < pieceArr.length; i++) {
				result += pieceArr[i];	//�迭�� ��� ��Ҹ� result���ڿ��� ��ģ��.
			}
		}//�ٱ� else ��
		return result;	//previous ���̼����� �� ��Ҹ� �޾� �� ���� ������ result�� ��ȯ		
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int size = Integer.parseInt(br.readLine());//�ű��Ѱ�. �� �κ��� Integer�� �Ľ��� ���� �ʰ� br.read()�� ������ ���ѷ����� ������. ���۰����ؼ� ������ ����� �� ����. 
		String start = "1";
		for(int i=0; i < size; i++) {
			bw.write(getNextSequence(start)+"\n");
			start = getNextSequence(start);
		}
		bw.flush();
		br.close();
	}
}
