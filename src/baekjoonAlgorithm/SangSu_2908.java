package baekjoonAlgorithm;
import java.io.*;
/**
 * @author Dom_Morello
 * @Project Algorithm
 * @Date 2019. 11. 1.
 */
public class SangSu_2908 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] inputArr = br.readLine().split(" ");	//ù �ٿ� �Է��ϴ� ���� ���⸦ �������� �迭�� ��´�.
		char[] firstArr = inputArr[0].toCharArray();	//ù��° A�� �ι�° B�� ���� char�迭�� ��´�.
		char[] secondArr = inputArr[1].toCharArray();
		
		//char�迭�� �������� �籸����
		reverseArr(firstArr);
		reverseArr(secondArr);
		
		//String���� ��ȯ�� char�迭�� int�� ��ȯ(int�� ũ�⸦ ���ϱ� ���ؼ� int�� ��ȯ��)
		int first = Integer.parseInt(charArrToString(firstArr));		
		int second = Integer.parseInt(charArrToString(secondArr));
		
		if(first > second) {
			bw.write(first+"");
		}else {
			bw.write(second+"");
		}
	
		bw.flush();
		br.close();
	}
	
	//char�迭�� ���� ���ؼ� string���� ��ȯ�ϴ� �޼���
	public static String charArrToString(char[] chArr) {
		String result ="";
		for(int i=0; i < chArr.length; i++) {
			result += chArr[i];
		}
		return result;
	}
	
	//char�迭�� �Ű������� �޾� �ȿ� ��Ҹ� �������� �籸���ϴ� �޼���
	public static void reverseArr(char[] chArr) {
		for(int i=0; i < chArr.length/2; i++) {	//�ݺ��� �迭������ ���ݱ����� �ؾ� �Ϻ��ϰ� ������ ��
			//�� ó���� �� ������ ����� ��ġ�� �ٲٰ� �� ������ ������-1��° �ٲٴ� ���� �ݺ�
			char tmp = chArr[i];
			chArr[i] = chArr[chArr.length-1-i];
			chArr[chArr.length-1-i] = tmp;
		}
	}
}
