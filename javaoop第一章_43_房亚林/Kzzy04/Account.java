package Kzzy04;

import java.util.Scanner;

public class Account {
	int account;
	String name;
	String openDate;
	int idCard;
	double balance;
	
	public void show(){
		Scanner input = new Scanner(System.in);
		System.out.println("��ѡ����Ҫ���еĲ�����");
		System.out.println("1.���\n2.ȡ��\n3.��ѯ���");
		int num = input.nextInt();
		double money1 = 0.0;
		switch(num){
			case 1:
				System.out.println("��������������ֽ�");
				money1 = input.nextDouble();
				balance += money1;
				System.out.println("���ɹ�!���Ϊ��" + balance);
				break;
			case 2:
				System.out.println("������ȡ���");
				money1 = input.nextDouble();
				balance -= money1;
				System.out.println("ȡ��ɹ������Ϊ��" + balance);
				break;
			case 3:
				System.out.println("�˻����Ϊ��" + balance);
				break;
			default:
				System.out.println("�������");
				break;
		}
	}
}
