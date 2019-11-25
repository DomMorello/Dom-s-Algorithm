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
		int size = sc.nextInt();	//�迭�� ũ�⸦ �Է� �޴´�
		int[] a = new int[size];	
		Test1 test = new Test1();	//TestŬ���� �޼��� ��� ���� ��ü ����
		
		//�迭�� ��ҵ��� �Է¹޾� ����
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
		//�迭�� ��ҵ��� ���� ���ؼ�
		for(int i=0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;	//���� ��ȯ
	}
}
// �� �κ��� �˰����� ����κ�
//public class Test {
//    long sum(int[] a) {
//        long ans = 0;
//        for(int i=0; i < a.length; i++){
//            ans += a[i];
//        }
//        return ans;
//    }
//}
