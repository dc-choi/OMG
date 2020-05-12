package may;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class May_week2 {
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 오늘의 주제 : 메서드 사용하기
		May_week2 m = new May_week2();
		// 1.
		m.today();
		// 2.
		m.aryRmv();
		// 3.
		m.baseBall();
	}
	// 1번 문제
	public void today() {
		/*
		// 현재 날짜 구하는 변수 선언
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat dateForm = new SimpleDateFormat("YYYY년 MM월 dd일");
		
		Y Week year
		y Year
		M Month in year
		m Minute in hour
		D Day in year
		d Day in month
		
		System.out.println("오늘은 " + dateForm.format(date) + "입니다");
		
		// 현재 날짜 구하는 다른 방법
		
		Calendar는 추상클래스이기 때문에 객체를 직접 생성할 수 없다.
		메소드를 통해서 Calendar클래스를 구현한 클래스의 인스턴스를 얻어야 한다.
		Calendar cal = Calendar.getInstance();
		// System.out.println(cal);
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		문자열을 합쳐주는건 StringBuilder와 StringBuffer가 있음
		StringBuffer의 경우 비동기식으로 처리되고 StringBuilder의 경우 동기식으로 처리된다.
		동기식, 비동기식을 모르면 https://private.tistory.com/24을 참고할것.
		
		StringBuffer sb = new StringBuffer();
		sb.append(year + "년 ");
		sb.append(month + "월 ");
		sb.append(day + "일 ");
		sb.append(hour + "시 ");
		sb.append(min + "분 ");
		sb.append(sec + "초 ");
		System.out.println(sb.toString());
		*/
		
		// https://ryan-han.com/post/java/java-calendar-date/
		// http://blog.eomdev.com/java/2016/04/01/%EC%9E%90%EB%B0%948%EC%9D%98-java.time-%ED%8C%A8%ED%82%A4%EC%A7%80.html 참고함
		
		/*
		LocalDateTime, DateTimeFormatter와 같은 클래스들은 String 클래스처럼 변경이 불가능하다. 즉, 날짜나 시간을 변경하면 기존의 객체가 변경되는 것이 아니라, 새로운 객체를 반환한다.
		기존의 SimpleDateFormat, Calendar 클래스는 변경가능 하므로 멀티쓰레드 환경에서 안전하지 않았다.

		멀티쓰레드 환경에서는 여러 쓰레드가 동시에 같은 객체에 접근할 수 있어서 변경 가능한 객체의 데이터가 잘못 될 가능성이 있다.
		이를 쓰레드 안전(Thread-safe)하지 못하다고 한다.
		 */
		
		// 출력하기 위한 변수 선언
		String now = "";
		// 현재 날짜 생성해주는 객체 선언
		LocalDateTime now2 = LocalDateTime.now();
		// 원하는 문자열로 날짜포멧팅
		DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("yyyy년 M월 d일 a h시 m분 s초");
		now = now2.format(dateTime);
		System.out.println(now);
		
		// 오늘의 운세 구하기
		// 난수 메소드를 실행한 결과값을 남기기위한 변수
		int ran = 0;
		// 운세를 구하기 위해 출력해야하는 배열
		String[] luck = new String[]{"대길", "길", "중길", "소길", "흉"};
		// char[] luck = new char[]{}는 이 문제에서 선언이 불가능하다.
		// char의 선언되어야하는 변수의 크기가 최대 2byte이므로 한글은 두글자 이상 저장할 수 없다.
		// String은 변수를 선언할시 힙 메모리 영역에 선언되기 때문에 매모리의 용량에 따라 최대로 선언할 수 있는 변수크기가 달라진다.
		for(int i=0; i<10; i+=1) {
			// Math.random()는 난수를 생성하는 메소드이다
			ran = (int)(Math.random()*5);
			// *5는 뒤에 0 ~ 4만큼의 범위를 주기위해 적은것이다.
			// System.out.println(Math.random());를 쳐보면 더욱더 이해를 할 수 있다.
		}
		System.out.println("오늘의 운세는 " + luck[ran] + "입니다");
	}
	public void aryRmv() {
		System.out.println("제거할 변수의 순서를 0 ~ 5까지 입력하세요.");
		int idx = s.nextInt();
		if(idx >= 6) {
			System.out.println("6미만의 숫자를 입력해주세요");
			return;
		}
		// {1,3,4,7,9,11}
		ArrayList<Integer> a = new ArrayList<>();
		a.add(0, 1);
		a.add(1, 3);
		a.add(2, 4);
		a.add(3, 7);
		a.add(4, 9);
		a.add(5, 11);
		System.out.println("제거전 배열을 나열한다.");
		System.out.println(a);
		a.remove(idx);
		System.out.println("제거후에 배열을 나열한다.");
		System.out.println(a);
	}
	public void baseBall() {
		System.out.println("만들 숫자값의 길이를 입력하시오.");
		// 배열의 길이 설정
		int num = s.nextInt();
		// 숫자값을 저장할 배열 선언
		char[] a = new char[num];
		// 1 ~ 9까지의 숫자를 입력할 배열 선언
		char[] index = new char[] {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
		for(int i=0; i<num-1; i+=1) {
			// num만큼의 길이의 배열을 무작위 값으로 생성한다.
			int ran = (int)(Math.random()*9);
			a[i] = index[ran];
			
		}
		// 야구게임을 하기 위한 변수를 받는다
		System.out.println("1 ~ 9까지 숫자를 숫자값의 길이만큼 입력하세요");
		Integer[] b = new Integer[num];
		for(int i=0; i<num-1; i+=1) {
			b[i] = s.nextInt();
		}
		int strike = 0;
		int ball = 0;
		
		for(int i=0; i<num; i+=1) {
			if(a[i] == b[i]) {
				
			}
		}
		/*
		StringBuffer sb = new StringBuffer();
		sb.append(b1);
		sb.append(b2);
		sb.append(b3);
		System.out.println(sb.toString());
		*/
	}
}
