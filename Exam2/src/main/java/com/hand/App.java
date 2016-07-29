package com.hand;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		System.out.println("请输入工资：");
		Scanner in = new Scanner(System.in);
		double sal = in.nextInt();
		double tax = count(sal);
		System.out.print("所需要缴纳的税费为：" + tax);
	}

	private static double count(double sal) {
		double tax = 0;
		double t = sal - 3500;
		if (t <= 1500) {
			tax = t * 3 / 100;
		} else if (t > 1500 && t <= 4500) {
			tax = 45 + (t - 1500) / 10;
		} else if (t > 4500 && t < 9000) {
			tax = 345 + (t - 4500) / 5;
		} else if (t > 9000 && t <= 35000) {
			tax = 1245 + (t - 9000) / 4;
		} else if (t > 35000 && t < 55000) {
			tax = 7745 + (t - 35000) * 0.3;
		} else if (t > 55000 && t <= 80000) {
			tax = 13745 + (t - 55000) * 0.35;
		} else {
			tax = 22495 + (t - 80000) * 0.45;
		}

		return tax;
	}
}
