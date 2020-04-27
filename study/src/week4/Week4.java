package week4;

import java.util.Scanner;

public class Week4 {
	public static void main(String[] args) {
		// 1. 배열을 이용하여 ‘ㄹ’을 만들어 보세요
		System.out.println("1번 문제 시작");
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
		// 2. 10진수를 입력 받아서 2, 8, 16진수로 바꾸어 출력하는 프로그램을 작성하시오.
		// 16진수에서 10이상의 수는 순서대로 'A', 'B', 'C', 'D', 'E', 'F'로 나타낸다.
		System.out.println("2번문제 시작");
		chan();
		// 3. (주사위 던지기) 자연수 N과 M을 입력 받아서 주사위를 N번 던져서 나온 눈의 합이 M이 나올 수 있는 모든 경우를 출력하는 프로그램을 작성하시오.
		
	}
	// 1번 문제
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
		// 0 ~ x2.length-1까지 반복
		for (int i=0; i<x2.length-1; i+=1) {
			// j번째와 length-1번째의 요소가 크기 순이 아니면 교환
			for (int j=0; j<x2.length-1-i; j+=1) {
				// x2[j+1]가 x2[j]보다 클경우 교환
				if (x2[j]<x2[j+1]) {
					int temp = x2[j];
					x2[j] = x2[j + 1];
					x2[j + 1] = temp;
				}
			}
		}
	}
	public static void bubble2(int[] x4) {
		// 0 ~ x4.length-1까지 반복
		for (int i=0; i<x4.length-1; i+=1) {
			// j번째와 length-1번째의 요소가 크기 순이 아니면 교환
			for (int j=0; j<x4.length-1-i; j+=1) {
				// x4[j+1]가 x4[j]보다 클경우 교환
				if (x4[j]<x4[j+1]) {
					int temp = x4[j];
					x4[j] = x4[j + 1];
					x4[j + 1] = temp;
				}
			}
		}
	}
	// 2번 문제
	public static void chan() {
		Scanner s = new Scanner(System.in);
		System.out.println("진수 변환할 10진수 숫자를 입력하시오");
		int a = s.nextInt();
		System.out.println("어떤 진수로 변환할지 입력하시오");
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
			System.out.println("2, 8 ,16중 하나를 입력하시오");
		}
		
		System.out.println(c + " <-- 진수변환 완료!");
	}
	// 3번 문제
	public static void dice() {
		Scanner s = new Scanner(System.in);
		System.out.println("주사위를 몇번 던질건가요?");
		int x = s.nextInt();
		System.out.println("원하는 총합은 얼마 인가요?");
		int y = s.nextInt();
	}
}




