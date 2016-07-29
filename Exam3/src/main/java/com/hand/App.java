package com.hand;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入日期：(日期格式为YYYY-MM-DD)");
		String time = in.nextLine();
		System.out.println("您输入的日期是当年的第" + getDate(time) + "天");
	}

	private static int getDate(String time) {
		String[] a = time.split("-");
		int[] t = new int[3];
		for (int i = 0; i < t.length; i++) {
			t[i] = Integer.parseInt(a[i]);
		}
		int[] m = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int k = 0;
		for (int i = 0; i < t[1] - 1; i++) {
			k += m[i];
		}
		if (isLeapYear(t[0]) && t[1] > 2) {
			k++;
		}
		k += t[2];
		return k;

	}

	private static boolean isLeapYear(int y) {
		boolean f = false;
		if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)) {
			f = true;
		} else {
			f = false;
		}
		return f;
	}

}
