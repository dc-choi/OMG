package week4;

import java.util.Scanner;

public class Week4 {
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		//1. �迭�� �̿��Ͽ� �������� ����� ������
		sort();
		// 2. 10������ �Է� �޾Ƽ� 2, 8, 16������ �ٲپ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// 16�������� 10�̻��� ���� ������� 'A', 'B', 'C', 'D', 'E', 'F'�� ��Ÿ����.
		chan();
		// 3. (�ֻ��� ������) �ڿ��� N�� M�� �Է� �޾Ƽ� �ֻ����� N�� ������ ���� ���� ���� M�� ���� �� �ִ� ��� ��츦 ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		System.out.println("3�������� �ϼ����� ������");
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
		
		for(int i=0; i<row; i+=1) {
			if(i%2 == 0) {
				for(int j=0; j<col; j+=1) {
					num = num + 1;
					x[i][j] = num;
				}
			} else {
				for(int j=col-1; j>=0; j-=1) {
					num = num + 1;
					x[i][j] = num;
				}
			}
		}
		
		for(int i=0; i<row; i+=1) {
			for(int j=0; j<col; j+=1) {
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();
		}
	}
	// 2�� ����
	public static void chan() {
		System.out.println("���� ��ȯ�� 10���� ���ڸ� �Է��Ͻÿ�");
		int a = s.nextInt();
		System.out.println("� ������ ��ȯ���� �Է��Ͻÿ�");
		int b = s.nextInt();
		String c = "";
		
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
		System.out.println("�ֻ����� ��� �����ǰ���?");
		int x = s.nextInt();
		System.out.println("���ϴ� ������ �� �ΰ���?");
		int y = s.nextInt();
		
		double z = Math.pow(6, x);
		
		System.out.println(z + " <-- �� ����� ��");
		System.out.println(y + "���ϴ� ����");
	}
}




