package com.helloWorld;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hello World" + ":" + "你好，我的世界！");
		
		int a = 10, b = 20;
		int sum = a + b;
		System.out.println(sum);
		sum();

	}
	
	public static void sum() {
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
