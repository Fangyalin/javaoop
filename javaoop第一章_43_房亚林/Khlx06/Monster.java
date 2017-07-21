package Khlx06;

public class Monster {
	String monsterName;
	int monsterHp;
	String type;
	
	public void showMonster(){
		System.out.println("我是怪物，我的基本信息如下：");
		System.out.println("姓名：" + monsterName + ",生命值：" + monsterHp + ",类型：" + type);
	}
}
