package week5;

import java.util.Scanner;

public class Week5 {
	public static void main(String[] week) {
		// 2. 10������ �Է� �޾Ƽ� 2, 8, 16������ �ٲپ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// 16�������� 10�̻��� ���� ������� 'A', 'B', 'C', 'D', 'E', 'F'�� ��Ÿ����.
		
		// 3. (�ֻ��� ������) �ڿ��� N�� M�� �Է� �޾Ƽ� �ֻ����� N�� ������ ���� ���� ���� M�� ���� �� �ִ� ��� ��츦 ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
	}
	// 2�� ����
	public void Array() {
		Scanner s = new Scanner(System.in);
		System.out.println("��ȯ�� ���� �Է��Ͻÿ�");
		int a = s.nextInt();
		System.out.println("��ȯ�� ������ �Է��Ͻÿ�");
		int b = s.nextInt();
		
		int[] val;
		String val2 = "";
		
		if(b == 2) {
			val = this.toBinary(a);
			System.out.println("��ȯ�� ���� : " + val);
		} else if(b == 8) {
			val = this.toOctal(a);
			System.out.println("��ȯ�� ���� : " + val);
		} else if(b == 16) {
			val2 = this.toHex(a);
			System.out.println("��ȯ�� ���� : " + val2);
		} else {
			System.out.println("2, 8, 16�߿��� �Է��ϼ���");
		}
	}
	
	public int[] toBinary(int a) {
		int i = 0;
		int[] Binary = 0;
		while(a != 1) {
			Binary[i] = a % 2;
			a = a / 2;
			i+=1;
		}
		return Binary;
	}
	public int[] toOctal(int a) {
		int[] octal = 0;
		return octal;
	}
	public String toHex(int a) {
		String hex = "";
		return hex;
	}
}

