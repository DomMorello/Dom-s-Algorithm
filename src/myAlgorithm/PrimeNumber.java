package myAlgorithm;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(isPrimeNumber(31)) {
			System.out.println("31은 소수");
		}else {
			System.out.println("31은 합성수");
		}
		
		if(isPrimeNumber(100)) {
			System.out.println("100은 소수");
		}else {
			System.out.println("100은 합성수");
		}
		
		if(isPrimeNumber(997)) {
			System.out.println("997은 소수");
		}else {
			System.out.println("997은 합성수");
		}
	}

	//소수인지 아닌지 판별하는 메서드
	public static boolean isPrimeNumber(int num) {
		int primeCheck = 0;	//소수인지 합성수인지 판별하기 위한 변수
		
		for(int i=2; i < num; i++) {	//2부터 num-1까지 모든 수로 다 나누다가 하나라도 나눠서 나머지가 0이 되면 합성수로 판단
			if(num % i == 0) {	
				primeCheck++;	//이 변수가 증가하게 되면 1과 num 자기자신 외에 나눠서 나머지가 0이 되는 약수가 있는 것이므로 합성수로 판별
				break;	//i가 2부터 시작해서 하나라도 나눠서  나머지가 0이 되면 그 이후는 검사할 필요가 없으니 break로 반복을 그만함. 
			}
		}
		
		if(primeCheck != 0) {
			return false;
		}else {
			return true;
		}
	}
	
}
