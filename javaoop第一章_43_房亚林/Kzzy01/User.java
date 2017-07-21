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
		System.out.print("请输入姓名：");
		nickName = input.next();
		System.out.print("请输入年龄：");
		age = input.nextInt();
		System.out.print("请输入注册日期：");
		regDate = input.next();
		System.out.print("请输入等级：");
		level = input.next();
		System.out.println("大家好！我是" + nickName + ",今年" + age + "岁");
		System.out.println("我是" + regDate + "注册的，目前的等级是：" + level);
	}
}
