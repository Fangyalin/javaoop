package Sjlx;

import java.util.Scanner;

public class ChangePassword {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Administrator admin = new Administrator();
		admin.name = "admin1";
		admin.password = "111111";
		System.out.print("�������û�����");
		String nameInput = input.next();
		System.out.print("���������룺");
		String pwd = input.next();
		if(admin.name.equals(nameInput) && admin.password.equals(pwd)){
			System.out.print("\n�����������룺");
			admin.password = input.next();
			System.out.println("�޸�����ɹ�������������Ϊ��" + admin.password);
		}
		else{
			System.out.print("�û��������벻ƥ�䣡��û��Ȩ�޸��¹���Ա��Ϣ��");
		}
	}

}
