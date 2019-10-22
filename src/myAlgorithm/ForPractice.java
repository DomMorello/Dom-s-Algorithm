package myAlgorithm;

public class ForPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] alphabet = new char[26];
		
		//ABCDE...XYZ ��� �ݺ���
		for(int i=0; i < 26; i++) {
			alphabet[i] = (char)(i+65);
		}
		System.out.println(alphabet);
		
		//zyx...edcba ��� �ݺ���
		int index = 0;
		for(int i=26; i > 0; i--) {
			alphabet[index++] = (char)(i+96);
		}
		System.out.println(alphabet);
		
		//�����ϰ� ���ĺ� �빮�ڷ� 26ũ���� �迭 ����
		for(int i=0; i < 26; i++) {
			alphabet[i] = (char)((int)(Math.random()*26)+65);
		}
		System.out.println(alphabet);
		
		//�迭�� ������ �� A~Z���� �ߺ������� nȸ������ ���� ���ĺ��� �ߺ��̴�. ǥ���ϰ� �ٽ� �ߺ����������� 
		int count = 0;
		
		for(int i=0; i < 26; i++) {
			alphabet[i] = (char)((int)(Math.random()*26)+65);
			count++;
			for(int j=0; j < i; j++) {
				if(alphabet[i] == alphabet[j]) {
					System.out.println(count+"ȸ������ "+alphabet[j]+"�ߺ� �߻�!");
					i--;
					break;
				}
			}
		}	//�̷��� �ϸ� �ִ� 26�� 26�������� ����� ���� ������ ������ ���� ���� ���� ����. 
	}

}
