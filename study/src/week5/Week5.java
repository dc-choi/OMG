package week5;

import java.util.Scanner;

public class Week5 {
	public static void main(String[] week) {
		// 2. 10진수를 입력 받아서 2, 8, 16진수로 바꾸어 출력하는 프로그램을 작성하시오.
		// 16진수에서 10이상의 수는 순서대로 'A', 'B', 'C', 'D', 'E', 'F'로 나타낸다.
		
		// 3. (주사위 던지기) 자연수 N과 M을 입력 받아서 주사위를 N번 던져서 나온 눈의 합이 M이 나올 수 있는 모든 경우를 출력하는 프로그램을 작성하시오.
		
	}
	// 2번 문제
	public void Array() {
		Scanner s = new Scanner(System.in);
		System.out.println("변환할 값을 입력하시오");
		int a = s.nextInt();
		System.out.println("변환할 진수를 입력하시오");
		int b = s.nextInt();
		
		int[] val;
		String val2 = "";
		
		if(b == 2) {
			val = this.toBinary(a);
			System.out.println("변환된 값은 : " + val);
		} else if(b == 8) {
			val = this.toOctal(a);
			System.out.println("변환된 값은 : " + val);
		} else if(b == 16) {
			val2 = this.toHex(a);
			System.out.println("변환된 값은 : " + val2);
		} else {
			System.out.println("2, 8, 16중에서 입력하세요");
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

