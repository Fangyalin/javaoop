package Khlx06;

public class Game {

	public static void main(String[] args) {
		GameRole hero = new GameRole();
		Arms arms = new Arms();
		Monster monster = new Monster();
		hero.roleName = "��С��";
		hero.hp = 300;
		arms.armsName = "��������";
		arms.atk = 12;
		monster.monsterName = "С��";
		monster.monsterHp = 300;
		monster.type = "Ǳˮ��";
		hero.showGameRole();
		System.out.println();
		arms.showArms();
		System.out.println();
		monster.showMonster();

	}

}
