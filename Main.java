package yhj;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("*********���м��㷨ģ��ʵ��*********");
		BankerAlgorithm banker = new BankerAlgorithm();
		boolean flag = true;
		while (flag) {
			System.out.println("*********���м��㷨ģ��ʵ��*********");
			System.out.println("1.---��ȫ���м��---");
			System.out.println("2.----������Դ----");
			System.out.println("3.-----�˳�-----");
			System.out.println("----------------------------------------------------------");
			System.out.println("��ѡ��");
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
				System.out.println("ллʹ��!!!");
				flag = false;
				sc.close();
				break;
			}			
		}
	}

}
