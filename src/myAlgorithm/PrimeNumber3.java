package myAlgorithm;

/**
 * @author Dom_Morello
 * @Project Algorithm
 * @Date 2019. 10. 30.
 */
public class PrimeNumber3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("=========================");
		System.out.println("미래크립토 소수 판단 프로그램");
		System.out.println("\t\t-이동현");
		System.out.println("=========================\n\n");
		int[] ranNumArr = new int[100];	//난수를 저장할 배열 생성(크기가 100인 이유는 최대한 큰 값으로 설정한 것임)
		int count=0;	//소수를 배열의 index0부터 차례대로 저장하기 위한 변수 및 소수를 세기 위한 변수
		
		
		for(int i=0; i < ranNumArr.length; i++) {
			int ranNum = (int)(Math.random()*1000)+1;	//1~1000까지 난수 생성
			if(isPrimeNumber(ranNum)) {	//소수 검사
				System.out.println("소수발견: " + ranNum);
				ranNumArr[count++] = ranNum;	//ranNumArr배열의 첫번째부터 소수를 저장
			}
		}
		System.out.println("\n-----------------------");
		System.out.println("최종결과:");
		System.out.printf("    소수 개수: %d\n",count);
		System.out.printf("    최소 소수: %d\n",minPrime(ranNumArr, count));
		System.out.printf("    최대 소수: %d\n",maxPrime(ranNumArr, count));
		System.out.println("=========================");
		
		
	}
	//매개변수로 받는 정수가 소수인지 아닌지 검사하는 메서드
	public static boolean isPrimeNumber(int num) {
		int primeCheck = 0;	//소수인지 합성수인지 판별하기 위한 변수
		if(num == 1) {	//1은 무조건 소수가 아님
			return false;
		}
		if(num == 2) {	//2는 무조건 소수임
			return true;
		}else {	//1과 2를 제외한 모든 숫자를 검사함
			for(int i=2; i < num; i++) {	
				if(num % i == 0) {	//2부터 num-1까지 모든 수로 다 나누다가 하나라도 나눠서 나머지가 0이 되면 합성수로 판단
					primeCheck++;	//이 변수가 증가하게 되면 1과 num 자기자신 외에 나눠서 나머지가 0이 되는 약수가 있는 것이므로 합성수로 판별
					break;	//i가 2부터 시작해서 하나라도 나눠서  나머지가 0이 되면 그 이후는 검사할 필요가 없으니 break로 반복을 그만함. 
				}
			}
			if(primeCheck != 0) {	
				return false;	//primeCheck가 변했으면 합성수
			}else {
				return true;	//그대로 0이면 소수
			}
		}
	}
	
	//매개변수로 받는 배열에서 최솟값을 구하는 메서드
	public static int minPrime(int[] arr, int count) {	//int count로 받는 이유는 원래 최초에 생성한 배열의 크기가 100인데
														//소수를 다시 0부터 집어 넣고 남은 부분이 다 0으로 초기화 돼있기 때문에
														//최솟값이 0으로 나옴. 이를 방지하기 위해 count를 변수로 받고 그 부분까지만 검사함
		int min = arr[0];
		for(int i=0; i < count; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
	//매개변수로 받는 배열에서 최댓값을 구하는 메서드
	public static int maxPrime(int[] arr, int count) {	
		int max = arr[0];
		for(int i=0; i < count; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
}
