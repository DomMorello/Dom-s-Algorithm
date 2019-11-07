package baekjoonAlgorithm;

import java.io.*;
import java.util.*;

/**
 * @author Dom_Morello
 * @Project Algorithm
 * @Date 2019. 11. 6.
 */
public class GroupWordChecker_1316 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int times = Integer.parseInt(br.readLine()); // 첫 째줄에 몇 개의 단어를 입력받을지 정한다.
		int copyTimes = times;
		for (int i = 0; i < times; i++) { // 입력 받는 것을 첫째줄에 주어진 정수만큼 반복한다.
			List<String> list = new LinkedList<>();
			String[] input = br.readLine().split("");
			list.add(input[0]); // 첫 번째 요소는 일단 list에 넣어둔다
			// 두번째 요소부터 첫번째 요소와 비교해서 같은 글자가 연속되면 배제하고 중복이 안 되게 한 글자씩만 list에 넣는다.
			//ex) happy -> h,a,p,y  hhhaappyyh -> h,a,p,y,h
			for (int j = 1; j < input.length; j++) {
				if (!input[j].equals(input[j - 1])) {
					list.add(input[j]);
				}
			}
			// 새로운 배열을 만들어서 위에 생성한 list내용들을 새로운 배열 input2에 담는다.
			Iterator<String> it = list.iterator();
			String[] input2 = new String[list.size()];
			for (int k = 0; k < list.size(); k++) {
				if (it.hasNext()) {
					input2[k] = (String) it.next();
				}
			}
			//input2배열을 검사하여 그룹단어가 아니면 처음 입력한 단어의 개수에서 1만큼 감소시킨다.
			Loop1: for (int l = 2; l < input2.length; l++) {	//첫번째, 두번째는 검사할 필요가 없어서 2번째 부터 검사 시작
				for (int m = 0; m <= l - 2; m++) {	//해당 글자의 전전까지 비교를 해서 해당 글자가 있었으면 그룹단어가 아님
					if (input2[l].equals(input2[m])) {	//즉, 어떤 한 글자가 중복돼서 나타나면 그룹단어가 아닌 것임. 
						copyTimes--;	//그룹단어가 아니므로 처음에 입력한 단어의 개수에서 1을 차감한다.
						break Loop1;
					}
				}
			}
		}
		bw.write(copyTimes + "");
		bw.flush();
		br.close();
	}
}
