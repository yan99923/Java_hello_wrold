package project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//输入两个值 按从小到大排列 求加减乘结果
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		Test1 test1 = new Test1();
		Test2 test2 = new Test2();
		Test3 test3 = new Test3();
		Test4 test4= new Test4();
		test1.test1(a, b);
		System.out.println(a+" "+b+"  "+test2.test2(a, b)+"  "+test3.test3(a, b)+"  "+test4.test4(a, b));
		
	}

}
