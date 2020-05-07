package week4;

import java.util.Scanner;

public class Week4 {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		// 1. 배열을 이용하여 ‘ㄹ’을 만들어 보세요
		// sort();
		// 2. 10진수를 입력 받아서 2, 8, 16진수로 바꾸어 출력하는 프로그램을 작성하시오.
		// 16진수에서 10이상의 수는 순서대로 'A', 'B', 'C', 'D', 'E', 'F'로 나타낸다.
		// Array();
		// 3. (주사위 던지기) 자연수 N과 M을 입력 받아서 주사위를 N번 던져서 나온 눈의 합이 M이 나올 수 있는 모든 경우를 출력하는
		// 프로그램을 작성하시오.
		// dice();
	}

	public static void sort() {
		// Arrays.sort(x, Collections.reverseOrder());
		System.out.println("row를 입력하세요");
		int row = s.nextInt();
		System.out.println("col을 입력하세요");
		int col = s.nextInt();

		int[][] x = new int[row][col];
		int num = 0;

		for (int i = 0; i < row; i += 1) {
			if (i % 2 == 0) {
				for (int j = 0; j < col; j += 1) {
					num = num + 1;
					x[i][j] = num;
				}
			} else {
				for (int j = col - 1; j >= 0; j -= 1) {
					num = num + 1;
					x[i][j] = num;
				}
			}
		}

		for (int i = 0; i < row; i += 1) {
			for (int j = 0; j < col; j += 1) {
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();
		}
	}

	// 2번 문제
	public static void Array() {
		s = new Scanner(System.in);
		System.out.println("변환할 값을 입력하시오");
		int a = s.nextInt();
		System.out.println("변환할 진수를 입력하시오");
		int b = s.nextInt();
		s.close();

		if (b == 2) {
			toBinary(a);
		} else if (b == 8) {
			toOctal(a);
		} else if (b == 16) {
			toHex(a);
		} else {
			System.out.println("2, 8, 16중에서 입력하세요");
		}
	}

	public static void toBinary(int a) {
		int i = 0;
		int binary = 0;
		int[] list = new int[32];
		while (a > 0) {
			binary = a % 2;
			list[i] = binary;
			a = a / 2;
			i += 1;
		}
		for (int j = i; j > 0; j -= 1) {
			System.out.print(list[j - 1]);
		}
	}

	public static void toOctal(int a) {
		int i = 0;
		int octal = 0;
		int[] list = new int[32];
		while (a > 0) {
			octal = a % 8;
			list[i] = octal;
			a = a / 8;
			i += 1;
		}
		for (int j = i; j > 0; j -= 1) {
			System.out.print(list[j - 1]);
		}
	}

	public static void toHex(int a) {
		char[] digit = new char[] {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		String hex = "";
		while (a > 0) {
			hex = digit[a % 16] + hex;
			a = a / 16;
		}
		System.out.println(hex);
	}

	// 3번 문제
	public static void dice() {
		s = new Scanner(System.in);
		System.out.println("주사위의 합을 구하시오");
		int num = s.nextInt();
		// System.out.println("변환할 진수를 입력하시오");
		// int b = s.nextInt();
		s.close();

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if (i + j == num) {
					System.out.print("x = " + i + "\t");
					System.out.println("y = " + j);
				}
			}
		}
	}
}
