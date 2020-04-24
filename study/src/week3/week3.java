package week3;

public class week3 {
	public static void main(String[] args) {
		
		// 1. 5개의 숫자를 입력 받아 내림차순으로 버블정렬을 만들어 보세요. 각 단계별 변화되는 과정도 출력하세요.
		int[] a = {15, 11, 1, 3, 8};
		
		System.out.println("1번문제 시작");
		System.out.println("배열 생성");
		print(a);
		shuffle(a);
		System.out.println("\n배열 섞기");
		print(a);
		bubble(a);
		System.out.println("\n배열 버블정렬 실행");
		print(a);
		
		// 2. 값 2개를 입력 하여 메소드를 통해 더한 결과 값을 호출해보세요.
		System.out.println("\n\n2번문제 시작");
		int b = 3;
		int c = 5;
		math(b, c);
		
		// 3. 메소드를 이용하여 3명 학생의 3과목 점수를 입력받아 각 과목별 학생별 총점을 출력하는 구조화된 프로그램을 작성하시오.
		System.out.println("\n3번문제 시작");
		int[] d = {50, 80, 100};
		int[] e = {96, 88, 66};
		int[] f = {100, 85, 90};
		sum(d, e, f);
		
	}
	// 결과값 출력
	public static void print(int[] a) {
		for (int i : a) {
			System.out.print(i + "\t");
		}
	}
	// 버블정렬할 배열 섞기
	public static void shuffle(int[] a) {
		for (int i=0; i<10000; i+=1) {
			int ranNum = ((int)(Math.random()*a.length));
			int temp = a[0];
			a[0] = a[ranNum];
			a[ranNum] = temp;
		}
	}
	// 버블정렬 하기
	public static void bubble(int[] a) {
		// 0 ~ a.length-1까지 반복
		for (int i=0; i<a.length-1; i+=1) {
			// j번째와 length-1번째의 요소가 크기 순이 아니면 교환
			for (int j=0; j<a.length-1-i; j+=1) {
				// a[j+1]가 a[j]보다 클경우 교환
				if (a[j]<a[j+1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}
	// 메소드를 이용해서 계산하기
	public static void math(int b, int c) {
		int num = b+c;
		System.out.println(num + " <-- 2번문제 정답");
	}
	// 학생의 총 점수 계산
	public static void sum(int[] d, int[] e, int[] f) {
		int temp = 0;
		int temp2 = 0;
		int temp3 = 0;
		int temp4 = 0;
		
		for(int i=0; i<d.length; i++) {
			temp = temp + d[i];
			System.out.print(d[i] + " ");
		}
		System.out.print(temp + "\n");
		
		for(int i=0; i<e.length; i++) {
			temp = temp + e[i];
			temp2 = temp2 + e[i];
			System.out.print(e[i] + " ");
		}
		System.out.print(temp2 + "\n");
		
		for(int i=0; i<f.length; i++) {
			temp = temp + f[i];
			temp3 = temp3 + f[i];
			System.out.print(f[i] + " ");
		}
		System.out.print(temp3 + "\n");
		
		for(int i=0; i<d.length; i++) {
			temp4 = d[i] + e[i] + f[i];
			System.out.print(temp4 + " ");
		}
		System.out.print(temp);
	}
}
