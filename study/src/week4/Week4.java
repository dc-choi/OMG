package week4;

import java.util.Scanner;

public class Week4 {
	public static void main(String[] args) {
		// 1. �迭�� �̿��Ͽ� �������� ����� ������
		System.out.println("1�� ���� ����");
		int[] x1 = {1, 2, 3, 4, 5};
		int[] x2 = {6, 7, 8, 9, 10};
		int[] x3 = {11, 12, 13, 14, 15};
		int[] x4 = {16, 17, 18, 19, 20};
		int[] x5 = {21, 22, 23, 24, 25};
		
		print(x1);
		bubble(x2);
		printf(x2);
		print2(x3);
		bubble2(x4);
		printf2(x4);
		print3(x5);
		// 2. 10������ �Է� �޾Ƽ� 2, 8, 16������ �ٲپ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// 16�������� 10�̻��� ���� ������� 'A', 'B', 'C', 'D', 'E', 'F'�� ��Ÿ����.
		System.out.println("2������ ����");
		chan();
		// 3. (�ֻ��� ������) �ڿ��� N�� M�� �Է� �޾Ƽ� �ֻ����� N�� ������ ���� ���� ���� M�� ���� �� �ִ� ��� ��츦 ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
	}
	// 1�� ����
	public static void print(int[] x1) {
		for (int i : x1) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}
	public static void printf(int[] x2) {
		for (int i : x2) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}
	public static void print2(int[] x3) {
		for (int i : x3) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}
	public static void printf2(int[] x4) {
		for (int i : x4) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}
	public static void print3(int[] x5) {
		for (int i : x5) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}
	public static void bubble(int[] x2) {
		// 0 ~ x2.length-1���� �ݺ�
		for (int i=0; i<x2.length-1; i+=1) {
			// j��°�� length-1��°�� ��Ұ� ũ�� ���� �ƴϸ� ��ȯ
			for (int j=0; j<x2.length-1-i; j+=1) {
				// x2[j+1]�� x2[j]���� Ŭ��� ��ȯ
				if (x2[j]<x2[j+1]) {
					int temp = x2[j];
					x2[j] = x2[j + 1];
					x2[j + 1] = temp;
				}
			}
		}
	}
	public static void bubble2(int[] x4) {
		// 0 ~ x4.length-1���� �ݺ�
		for (int i=0; i<x4.length-1; i+=1) {
			// j��°�� length-1��°�� ��Ұ� ũ�� ���� �ƴϸ� ��ȯ
			for (int j=0; j<x4.length-1-i; j+=1) {
				// x4[j+1]�� x4[j]���� Ŭ��� ��ȯ
				if (x4[j]<x4[j+1]) {
					int temp = x4[j];
					x4[j] = x4[j + 1];
					x4[j + 1] = temp;
				}
			}
		}
	}
	// 2�� ����
	public static void chan() {
		Scanner s = new Scanner(System.in);
		System.out.println("���� ��ȯ�� 10���� ���ڸ� �Է��Ͻÿ�");
		int a = s.nextInt();
		System.out.println("� ������ ��ȯ���� �Է��Ͻÿ�");
		int b = s.nextInt();
		String c = "";
		s.close();
		
		if(b == 2) {
			c = Integer.toBinaryString(a);
		} else if(b == 8) {
			c = Integer.toOctalString(a);
		} else if(b == 16) {
			c = Integer.toHexString(a);
		} else {
			System.out.println("2, 8 ,16�� �ϳ��� �Է��Ͻÿ�");
		}
		
		System.out.println(c + " <-- ������ȯ �Ϸ�!");
	}
	// 3�� ����
	public static void dice() {
		Scanner s = new Scanner(System.in);
		System.out.println("�ֻ����� ��� �����ǰ���?");
		int x = s.nextInt();
		System.out.println("���ϴ� ������ �� �ΰ���?");
		int y = s.nextInt();
	}
}




