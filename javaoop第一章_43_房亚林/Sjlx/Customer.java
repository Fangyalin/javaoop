package Sjlx;

import java.util.Scanner;

public class Customer {
	int integral;
	String cardType;
	public void show(){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入积分：");
		integral = input.nextInt();
		System.out.print("请输入卡类型：");
		cardType = input.next();
		if(integral > 1000 && cardType.equals("金卡")){
			System.out.println("\n积分：" + integral + ",卡类型：" + cardType);
			System.out.println("回馈积分500分！");
		}
		else if(integral > 5000 && cardType.equals("普卡")){
			System.out.println("\n积分：" + integral + ",卡类型：" + cardType);
			System.out.println("回馈积分500分！");
		}
		else{
			System.out.println("\n抱歉，您不能参加此活动！");
		}
	}
}
