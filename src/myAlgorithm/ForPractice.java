package myAlgorithm;

public class ForPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] alphabet = new char[26];
		
		//ABCDE...XYZ 출력 반복문
		for(int i=0; i < 26; i++) {
			alphabet[i] = (char)(i+65);
		}
		System.out.println(alphabet);
		
		//zyx...edcba 출력 반복문
		int index = 0;
		for(int i=26; i > 0; i--) {
			alphabet[index++] = (char)(i+96);
		}
		System.out.println(alphabet);
		
		//랜덤하게 알파벳 대문자로 26크기의 배열 생성
		for(int i=0; i < 26; i++) {
			alphabet[i] = (char)((int)(Math.random()*26)+65);
		}
		System.out.println(alphabet);
		
		//배열에 랜덤한 값 A~Z까지 중복나오면 n회차에서 무슨 알파벳이 중복이다. 표시하고 다시 중복없을때까지 
		int count = 0;
		
		for(int i=0; i < 26; i++) {
			alphabet[i] = (char)((int)(Math.random()*26)+65);
			count++;
			for(int j=0; j < i; j++) {
				if(alphabet[i] == alphabet[j]) {
					System.out.println(count+"회차에서 "+alphabet[j]+"중복 발생!");
					i--;
					break;
				}
			}
		}	//이렇게 하면 최대 26의 26제곱까지 경우의 수가 나오기 때문에 답을 구할 수가 없다. 
	}

}
