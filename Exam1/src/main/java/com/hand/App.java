package com.hand;

public class App {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 100; i <= 200; i++) {
			if (sushu(i)) {
				count++;
			}

		}
		System.out.print("100-200间共有" + count + "个素数，分别是：");
		for (int i = 100; i <= 200; i++) {
			if (sushu(i)) {
				System.out.print(i + ", ");
			}

		}
	}

	public static boolean sushu(int n) {
		boolean f = true;
		for (int i = 2; i < (n / 2); i++) {
			if (n % i != 0) {
				continue;
			} else {
				f = false;
				break;
			}
		}
		return f;
	}
}
