package Khlx02;

import java.util.Scanner;

public class Calculator {
	double num1;
	double num2;
	String por;
	
	public void show(){
		Scanner input = new Scanner(System.in);
		double num = 0.0;
		System.out.print("�������һ������");
		num1 = input.nextDouble();
		System.out.print("�������������+��-��*��/����");
		por = input.next();
		System.out.print("������ڶ�������");
		num2 = input.nextDouble();
		int i =0;
		switch(por){
			case "+":
				num = num1 + num2;
				break;
			case "-":
				num = num1 - num2;
				break;
			case "*":
				num = num1 * num2;
				break;
			case "/":
				if(num2==0){
					System.out.println("��������Ϊ�㣡");
					i ++;
					break;
				}
				else{
					num = num1 / num2;
					break;
				}
			default:
				System.out.println("�������");
		}
		if(i == 0){
			System.out.println(num1 + por + num2 + "=" + num);
		}
	}
}
