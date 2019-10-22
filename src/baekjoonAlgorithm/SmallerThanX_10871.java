package baekjoonAlgorithm;
import java.io.*;
import java.util.*;
public class SmallerThanX_10871 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String sizeAndX = bf.readLine();	//��� ������ ������ �� ���ϴ� size�� x���� ���� ���� �� �� ���Ǵ� x
		StringTokenizer st = new StringTokenizer(sizeAndX);
		int size = Integer.parseInt(st.nextToken());	//size ������ �� �� �������� ũ��
		int x = Integer.parseInt(st.nextToken());	//x���� ���� ���� ���� �� ���Ǵ� x
		
		int[] arr = new int[size];	//�Է¹��� sizeũ���� �迭�� ����
		String num = bf.readLine();	//1�̻� size������ �������� �Է� �޴´�.
		StringTokenizer st2 = new StringTokenizer(num);	//������ �������� ��ūȭ�ؼ� 
		
		for(int i=0; i < size; i++) {	
			arr[i] = Integer.parseInt(st2.nextToken());	//�迭�� ��ū���� ��Ƽ� �����Ѵ�.
			if(arr[i] < x) {	//arr�迭�� ��� ��Ҹ� x���� ������ �˻��� �� ������ ����Ѵ�. 
				bw.write(arr[i]+" ");
			}
		}
		bw.flush();
		bw.close();
		bf.close();
	}
}
