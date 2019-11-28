package baekjoonAlgorithm;
import java.io.*;
import java.util.*;
/**
 * @author Dom_Morello
 * @Project Algorithm
 * @Date 2019. 11. 5.
 * 
 * 여러 개발 관련 글들을 읽어보니 공통적으로 알고리즘을 공부할 때 어느 정도 시간을 투자하고 고민해보고
 * 도저히 풀리지 않을 때는 다른 사람의 코드를 보는 것이 공부가 된다고 한다. 그래서 괜한 오기로 3시간 넘어가게
 * 집중도 잘 안 되는 상태로 계속 한 문제를 잡고 있기 보다는 여러 방면으로 생각해본 후 잘 안 될 떄는 다른 사람의 코드를 
 * 보는 것을 너무 안 좋다고 생각할 필요가 없다. 그래서 아무리 쉽고 간단해 보이는 문제도 아직 프로그래밍을 시작한 지 
 * 얼마 되지 않았으므로 고집부리지 말고 항상 공부를 하고 배운다는 생각으로 남의 코드를 배우고 남의 생각을 배우자.
 * 아래 코드는 다른 사람의 풀이를 공부한 것이다. 
 */
public class CroatiaAlphabet_2941 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();	//입력 받는 값
		String[] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		for(int i=0; i < arr.length; i++) {
			input = input.replace(arr[i], "a");	//arr과 같은 부분이 있으면 a로 바꿔서 글자수를 하나만 카운트하게 한다.
		}	//여기서 dz= 가 z=보다 앞에 있어야 먼저 바꾸기 때문에 정답을 얻을 수 있다. 
		System.out.println(input.length());
	}

}
