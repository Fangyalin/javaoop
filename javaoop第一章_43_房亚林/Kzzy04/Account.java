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
		System.out.println("请选择你要进行的操作：");
		System.out.println("1.存款\n2.取款\n3.查询余额");
		int num = input.nextInt();
		double money1 = 0.0;
		switch(num){
			case 1:
				System.out.println("请输入存款金额，放入现金！");
				money1 = input.nextDouble();
				balance += money1;
				System.out.println("存款成功!余额为：" + balance);
				break;
			case 2:
				System.out.println("请输入取款金额：");
				money1 = input.nextDouble();
				balance -= money1;
				System.out.println("取款成功！余额为：" + balance);
				break;
			case 3:
				System.out.println("账户余额为：" + balance);
				break;
			default:
				System.out.println("输入错误！");
				break;
		}
	}
}
