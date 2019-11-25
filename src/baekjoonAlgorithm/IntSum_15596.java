package baekjoonAlgorithm;
import java.io.*;
import java.util.*;
/**
 * @author Dom_Morello
 * @Project Algorithm
 * @Date 2019. 10. 22.
 */
public class IntSum_15596 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();	//배열의 크기를 입력 받는다
		int[] a = new int[size];	
		Test1 test = new Test1();	//Test클래스 메서드 사용 위해 객체 생성
		
		//배열의 요소들을 입력받아 저장
		for(int i=0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(test.sum(a));
		sc.close();
	}
}

class Test1{
	public long sum(int[] a) {

		long sum = 0;
		//배열의 요소들을 전부 합해서
		for(int i=0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;	//합을 반환
	}
}
// 이 부분이 알고리즘의 정답부분
//public class Test {
//    long sum(int[] a) {
//        long ans = 0;
//        for(int i=0; i < a.length; i++){
//            ans += a[i];
//        }
//        return ans;
//    }
//}
