package Sjlx;

import java.util.Scanner;

public class Customer {
	int integral;
	String cardType;
	public void show(){
		Scanner input = new Scanner(System.in);
		System.out.print("��������֣�");
		integral = input.nextInt();
		System.out.print("�����뿨���ͣ�");
		cardType = input.next();
		if(integral > 1000 && cardType.equals("��")){
			System.out.println("\n���֣�" + integral + ",�����ͣ�" + cardType);
			System.out.println("��������500�֣�");
		}
		else if(integral > 5000 && cardType.equals("�տ�")){
			System.out.println("\n���֣�" + integral + ",�����ͣ�" + cardType);
			System.out.println("��������500�֣�");
		}
		else{
			System.out.println("\n��Ǹ�������ܲμӴ˻��");
		}
	}
}
