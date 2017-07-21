package Khlx03_04;

public class Demo {
	public static void main(String[] args) {
		CurrentTime time1 = new CurrentTime();
		time1.show();
		time1.time = "2015年5月12日10点11分30秒";
		System.out.println(time1.time);
	}

}
