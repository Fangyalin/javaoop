package Khlx02;

import java.util.Scanner;

public class Calculator {
	double num1;
	double num2;
	String por;
	
	public void show(){
		Scanner input = new Scanner(System.in);
		double num = 0.0;
		System.out.print("请输入第一个数：");
		num1 = input.nextDouble();
		System.out.print("请输入运算符（+、-、*、/）：");
		por = input.next();
		System.out.print("请输入第二个数：");
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
					System.out.println("除数不能为零！");
					i ++;
					break;
				}
				else{
					num = num1 / num2;
					break;
				}
			default:
				System.out.println("输入错误！");
		}
		if(i == 0){
			System.out.println(num1 + por + num2 + "=" + num);
		}
	}
}
