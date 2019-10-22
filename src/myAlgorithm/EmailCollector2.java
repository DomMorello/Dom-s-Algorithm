package myAlgorithm;
import java.util.*;
public class EmailCollector2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] emailCol = new String[10];
		String[] organizationCol = new String[10];
		
		for(int i=0; i < 10; i++) {
			
			System.out.println("이메일을 입력하세요");
			String email = sc.nextLine();
			
			char[] emailArr = email.toCharArray();
			char[] id = new char[email.length()];
			char[] organization = new char[email.length()];
			
			int index = 0;
			for(int j=0; j < emailArr.length; j++) {
				index++;
				if(emailArr[j] == '@')
					break;
				id[j] = emailArr[j];
			}
			System.out.println("아이디: "+new String(id).trim());
			emailCol[i] = new String(id).trim();
			
			for(int k=index; k < emailArr.length; k++) {
				organization[k] = emailArr[k];
			}
			System.out.println("소속: "+new String(organization).trim());
			organizationCol[i] = new String(organization).trim();
		}
		
		System.out.println("**결과 10개 이메일 수집:");
		System.out.println("아이디: "+Arrays.toString(emailCol));
		System.out.println("소속: "+Arrays.toString(organizationCol));
	}

}
