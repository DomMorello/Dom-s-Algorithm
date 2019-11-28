package baekjoonAlgorithm;
import java.io.*;
import java.util.*;
/**
 * @author Dom_Morello
 * @Project Algorithm
 * @Date 2019. 11. 5.
 * 
 * ���� ���� ���� �۵��� �о�� ���������� �˰����� ������ �� ��� ���� �ð��� �����ϰ� ����غ���
 * ������ Ǯ���� ���� ���� �ٸ� ����� �ڵ带 ���� ���� ���ΰ� �ȴٰ� �Ѵ�. �׷��� ���� ����� 3�ð� �Ѿ��
 * ���ߵ� �� �� �Ǵ� ���·� ��� �� ������ ��� �ֱ� ���ٴ� ���� ������� �����غ� �� �� �� �� ���� �ٸ� ����� �ڵ带 
 * ���� ���� �ʹ� �� ���ٰ� ������ �ʿ䰡 ����. �׷��� �ƹ��� ���� ������ ���̴� ������ ���� ���α׷����� ������ �� 
 * �� ���� �ʾ����Ƿ� �����θ��� ���� �׻� ���θ� �ϰ� ���ٴ� �������� ���� �ڵ带 ���� ���� ������ �����.
 * �Ʒ� �ڵ�� �ٸ� ����� Ǯ�̸� ������ ���̴�. 
 */
public class CroatiaAlphabet_2941 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();	//�Է� �޴� ��
		String[] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		for(int i=0; i < arr.length; i++) {
			input = input.replace(arr[i], "a");	//arr�� ���� �κ��� ������ a�� �ٲ㼭 ���ڼ��� �ϳ��� ī��Ʈ�ϰ� �Ѵ�.
		}	//���⼭ dz= �� z=���� �տ� �־�� ���� �ٲٱ� ������ ������ ���� �� �ִ�. 
		System.out.println(input.length());
	}

}
