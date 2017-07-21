package Khlx06;

public class Game {

	public static void main(String[] args) {
		GameRole hero = new GameRole();
		Arms arms = new Arms();
		Monster monster = new Monster();
		hero.roleName = "李小侠";
		hero.hp = 300;
		arms.armsName = "死神镰刀";
		arms.atk = 12;
		monster.monsterName = "小龟";
		monster.monsterHp = 300;
		monster.type = "潜水型";
		hero.showGameRole();
		System.out.println();
		arms.showArms();
		System.out.println();
		monster.showMonster();

	}

}
