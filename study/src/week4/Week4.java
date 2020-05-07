package week4;

import java.util.Scanner;

public class Week4 {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		// 1. �迭�� �̿��Ͽ� �������� ����� ������
		// sort();
		// 2. 10������ �Է� �޾Ƽ� 2, 8, 16������ �ٲپ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// 16�������� 10�̻��� ���� ������� 'A', 'B', 'C', 'D', 'E', 'F'�� ��Ÿ����.
		// Array();
		// 3. (�ֻ��� ������) �ڿ��� N�� M�� �Է� �޾Ƽ� �ֻ����� N�� ������ ���� ���� ���� M�� ���� �� �ִ� ��� ��츦 ����ϴ�
		// ���α׷��� �ۼ��Ͻÿ�.
		// dice();
	}

	public static void sort() {
		// Arrays.sort(x, Collections.reverseOrder());
		System.out.println("row�� �Է��ϼ���");
		int row = s.nextInt();
		System.out.println("col�� �Է��ϼ���");
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

	// 2�� ����
	public static void Array() {
		s = new Scanner(System.in);
		System.out.println("��ȯ�� ���� �Է��Ͻÿ�");
		int a = s.nextInt();
		System.out.println("��ȯ�� ������ �Է��Ͻÿ�");
		int b = s.nextInt();
		s.close();

		if (b == 2) {
			toBinary(a);
		} else if (b == 8) {
			toOctal(a);
		} else if (b == 16) {
			toHex(a);
		} else {
			System.out.println("2, 8, 16�߿��� �Է��ϼ���");
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

	// 3�� ����
	public static void dice() {
		s = new Scanner(System.in);
		System.out.println("�ֻ����� ���� ���Ͻÿ�");
		int num = s.nextInt();
		// System.out.println("��ȯ�� ������ �Է��Ͻÿ�");
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
