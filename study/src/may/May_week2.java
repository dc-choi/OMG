package may;

import java.text.SimpleDateFormat;
import java.util.Date;

public class May_week2 {
	public static void main(String[] args) {
		// 오늘의 주제 : 메서드 사용하기
		May_week2 m = new May_week2();
		// 1. 오늘의 운세 프로그램을 작성하자. 
		// 오늘 날짜와 대길, 길 , 중길, 소길, 흉 중 하나의 운세를 표시할 것.
		// Hint - 랜덤.날짜메서드.확률
		m.today();
		// 2. 배열 a로부터 요소 a[idx]를 삭제하는 aryRmv 메서드를 작성하자.
		// void aryRmv(int[] a, int idx)
		// A[idx]의 삭제는, 그 뒤에 있는 요소들을 앞으로 하나씩 이동해서 할 것.
		// 이동한 후에 비게 되는 마지막 요소 a[a.length-1]의 값은 이동하기 전의 마지막 값을 유지할 것.
		// 예)배열 a의 요소가 {1,3,4,7,9,11}일 때에 aryRmv(a,2)라고 호출한 후에는 배열a의 요소는 {1,3,7,9,11,11}이 된다.

		// 3. 숫자야구게임
		
	}
	public void today() {
		Date date = new Date(); // 현재 날짜를 확인해주는 객체생성
		SimpleDateFormat dateForm = new SimpleDateFormat("YYYY년 LL월 dd일");
		/*
		 * Y Week year
		 * y Year
		 * M Month in year (context sensitive)
		 * L Month in year (standalone form)
		 * m Minute in hour
		 * D Day in year
		 * d Day in month
		 */
		System.out.println("오늘은 "+dateForm.format(date)+"입니다");
	}
}
