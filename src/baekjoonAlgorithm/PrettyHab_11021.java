package baekjoonAlgorithm;
import java.io.*;
import java.util.*;

public class PrettyHab_11021 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int times = Integer.parseInt(bf.readLine());
		
		for(int i=0; i < times; i++) {
			String inputNum = bf.readLine();
			StringTokenizer st = new StringTokenizer(inputNum);
			bw.write("Case #"+(i+1)+": "+String.valueOf(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
		}
		bw.flush();
	}

}
