package Sjlx;

import java.util.Scanner;

public class ChangePassword {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Administrator admin = new Administrator();
		admin.name = "admin1";
		admin.password = "111111";
		System.out.print("请输入用户名：");
		String nameInput = input.next();
		System.out.print("请输入密码：");
		String pwd = input.next();
		if(admin.name.equals(nameInput) && admin.password.equals(pwd)){
			System.out.print("\n请输入新密码：");
			admin.password = input.next();
			System.out.println("修改密码成功，您的新密码为：" + admin.password);
		}
		else{
			System.out.print("用户名和密码不匹配！您没有权限更新管理员信息。");
		}
	}

}
