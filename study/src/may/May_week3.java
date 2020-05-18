package may;

import java.util.ArrayList;
import java.util.Scanner;

public class May_week3 {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		May_week3 m = new May_week3();
		// 1. Scanner 클래스를 사용하여 6개 학점('A', 'B', 'C', 'D', 'F')을 문자로 입력받아 ArrayList에 저장하고,
		// ArrayList를 검색하여 학점을 점수(A=4.0, B=3.0, C=2.0, D=1.0, F=0)로 변환하여 평균을 출력하는 프로그램을 작성하라.
		m.AVG();
		// 2. "그만"이 입력될 때까지 나라 이름과 인구를 입력받아 저장하고, 다시 나라 이름을 입력받아 인구를 출력하는 프로그램을 작성하라. 다음 해시맵을 이용하라.
		
		// 3. 하나의 학생 정보를 나타내는 Student 클래스에는 이름, 학과, 학번, 학점 평균을 저장하는 필드가 있다.
		// (1) 학생마다 Student 객체를 생성하고 4명의 학생 정보를 ArrayList<Student> 컬렉션에 저장한 후에,
		// ArrayList<Student>의 모든 학생(4명) 정보를 출력하고 학생이름을 입력받아 해당 학생의 학점 평균을 출력하는 프로그램을 작성하라.
		
		// 4.정렬되지 않은 학생들의 임의의 점수를 입력하여 석차를 계산하는 프로그램을 작성하시오. 점수는 동점이 있을 수 있으며, 이러한 경우 같은 석차로 처리한다.
		// 예를 들어 5명의 점수 100, 90, 76, 60, 90이 입력되었다면 석차는 2등이 2명이고 3등은 없다.
		// (단, 점수가 가장 높은 학생을 1등으로 한다.)
		// 입력)
		// 1) 첫 번째 줄은 처리할 점수의 개수 n ( n <= 200 ) ※ 조건수정:2012.10.6
		// 2) 두 번째 줄은 처리할 점수 데이터 (0~100점)
		// (단, 각각의 점수는 빈칸으로 구별한다.)
		
	}
	public void AVG() {
		int score = 0;
		int result = 0;
		int[] scoreSet = new int[]{4, 3, 2, 1, 0};
		System.out.println("A부터 F의 학점을 5개의 과목에 입력하세요");
		System.out.println("EX) A를 주기위해서는 0을 입력한다, F를 주기 위해서는 4를 입력한다");
		int one = s.nextInt();
		int two = s.nextInt();
		int three = s.nextInt();
		int four = s.nextInt();
		int five = s.nextInt();
		
		ArrayList<Integer> scoreList = new ArrayList<Integer>();
		scoreList.add(scoreSet[one]);
		scoreList.add(scoreSet[two]);
		scoreList.add(scoreSet[three]);
		scoreList.add(scoreSet[four]);
		scoreList.add(scoreSet[five]);
		
		// 각 과목당 점수를 출력한다.
		for(int i=0; i<scoreList.size(); i+=1) {
			System.out.println("과목당 " + (i+1) + "번째 점수는 : " + scoreList.get(i));
		}
		// 각 과목의 총 합을 구한다.
		for(int i=0; i<scoreList.size(); i+=1) {
			score = score + scoreList.get(i);
		}
		System.out.println("총 점수는 : " + score);
		// 과목 총합의 평균을 구한다.
		result = score / scoreList.size();
		System.out.println("총 점수의 평균은 : " + result);
	}
}
