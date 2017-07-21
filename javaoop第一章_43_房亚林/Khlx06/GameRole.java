package Khlx06;

public class GameRole {
	String roleName;
	int hp;
	
	public void showGameRole(){
		System.out.println("我是英雄，我的基本信息如下：");
		System.out.print("姓名：" + roleName + ",生命值" + hp);
	}
}
