package Kzzy02;

public class PhoneCard {
	int cardNo;
	String name;
	double balance;
	String password;
	
	public void print(){
		System.out.println("电话卡类：" + cardNo);
		System.out.println("姓名：" + name);
		System.out.println("余额：" + balance);
		System.out.println("密码：" + password);
	}
}
