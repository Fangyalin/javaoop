package Kzzy01;

import java.util.Scanner;

public class User {
	String nickName;
	String password;
	String gender;
	int age;
	String regDate;
	String level;
	
	public void showInfo(){
		Scanner input = new Scanner(System.in);
		System.out.print("������������");
		nickName = input.next();
		System.out.print("���������䣺");
		age = input.nextInt();
		System.out.print("������ע�����ڣ�");
		regDate = input.next();
		System.out.print("������ȼ���");
		level = input.next();
		System.out.println("��Һã�����" + nickName + ",����" + age + "��");
		System.out.println("����" + regDate + "ע��ģ�Ŀǰ�ĵȼ��ǣ�" + level);
	}
}
