package Khlx05;

public class Computer {
	String cpu;
	String mainboard;
	String display;
	String hdd;
	String memory;
	
	public void showInfo(){
		System.out.println("CPU:" + cpu);
		System.out.println("����:" + mainboard);
		System.out.println("��ʾ�� ��" + display);
		System.out.println("Ӳ�̣�" + hdd);
		System.out.println("�ڴ棺" + memory);
	}
}
