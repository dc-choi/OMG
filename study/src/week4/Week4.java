package week4;

import java.util.Scanner;

public class Week4 {
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		//1. 배열을 이용하여 ‘ㄹ’을 만들어 보세요
		sort();
		// 2. 10진수를 입력 받아서 2, 8, 16진수로 바꾸어 출력하는 프로그램을 작성하시오.
		// 16진수에서 10이상의 수는 순서대로 'A', 'B', 'C', 'D', 'E', 'F'로 나타낸다.
		chan();
		// 3. (주사위 던지기) 자연수 N과 M을 입력 받아서 주사위를 N번 던져서 나온 눈의 합이 M이 나올 수 있는 모든 경우를 출력하는 프로그램을 작성하시오.
		System.out.println("3번문제는 완성하지 못했음");
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
	// 2번 문제
	public static void chan() {
		System.out.println("진수 변환할 10진수 숫자를 입력하시오");
		int a = s.nextInt();
		System.out.println("어떤 진수로 변환할지 입력하시오");
		int b = s.nextInt();
		String c = "";
		
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
		System.out.println("주사위를 몇번 던질건가요?");
		int x = s.nextInt();
		System.out.println("원하는 총합은 얼마 인가요?");
		int y = s.nextInt();
		
		double z = Math.pow(6, x);
		
		System.out.println(z + " <-- 총 경우의 수");
		System.out.println(y + "원하는 총합");
	}
}




