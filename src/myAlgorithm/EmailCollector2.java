package myAlgorithm;
import java.util.*;
public class EmailCollector2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] emailCol = new String[10];
		String[] organizationCol = new String[10];
		
		for(int i=0; i < 10; i++) {
			
			System.out.println("�̸����� �Է��ϼ���");
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
			System.out.println("���̵�: "+new String(id).trim());
			emailCol[i] = new String(id).trim();
			
			for(int k=index; k < emailArr.length; k++) {
				organization[k] = emailArr[k];
			}
			System.out.println("�Ҽ�: "+new String(organization).trim());
			organizationCol[i] = new String(organization).trim();
		}
		
		System.out.println("**��� 10�� �̸��� ����:");
		System.out.println("���̵�: "+Arrays.toString(emailCol));
		System.out.println("�Ҽ�: "+Arrays.toString(organizationCol));
	}

}
