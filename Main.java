package yhj;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("*********银行家算法模拟实现*********");
		BankerAlgorithm banker = new BankerAlgorithm();
		boolean flag = true;
		while (flag) {
			System.out.println("*********银行家算法模拟实现*********");
			System.out.println("1.---安全序列检测---");
			System.out.println("2.----请求资源----");
			System.out.println("3.-----退出-----");
			System.out.println("----------------------------------------------------------");
			System.out.println("请选择");
			Scanner sc = new Scanner(System.in);
			int count = sc.nextInt();
			switch (count) {
			case 1:
				banker.checkSecurity();
				break;
			case 2:
				banker.checkRequest();
				break;
			case 3:
				System.out.println("谢谢使用!!!");
				flag = false;
				sc.close();
				break;
			}			
		}
	}

}
