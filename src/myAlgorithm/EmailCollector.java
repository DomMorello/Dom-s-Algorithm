package myAlgorithm;
import java.util.*;
public class EmailCollector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸����� �Է��ϼ���");
		String email = sc.nextLine();
		
		char[] emailArr = email.toCharArray();
		char[] id = new char[email.length()];
		char[] organization = new char[email.length()];
		
		int index = 0;
		for(int i=0; i < emailArr.length; i++) {
			index++;
			if(emailArr[i] == '@')
				break;
			id[i] = emailArr[i];
		}
		System.out.println("���̵�: "+new String(id).trim());
		
		for(int i=index; i < emailArr.length; i++) {
			organization[i] = emailArr[i];
		}
		System.out.println("�Ҽ�: "+new String(organization).trim());
	}

}
