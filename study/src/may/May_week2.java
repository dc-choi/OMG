package may;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class May_week2 {
	public static void main(String[] args) {
		// ������ ���� : �޼��� ����ϱ�
		May_week2 m = new May_week2();
		// 1. ������ � ���α׷��� �ۼ�����. 
		// ���� ��¥�� ���, �� , �߱�, �ұ�, �� �� �ϳ��� ��� ǥ���� ��.
		// Hint - ����.��¥�޼���.Ȯ��
		m.today();
		// 2. �迭 a�κ��� ��� a[idx]�� �����ϴ� aryRmv �޼��带 �ۼ�����.
		// void aryRmv(int[] a, int idx)
		// A[idx]�� ������, �� �ڿ� �ִ� ��ҵ��� ������ �ϳ��� �̵��ؼ� �� ��.
		// �̵��� �Ŀ� ��� �Ǵ� ������ ��� a[a.length-1]�� ���� �̵��ϱ� ���� ������ ���� ������ ��.
		// ��)�迭 a�� ��Ұ� {1,3,4,7,9,11}�� ���� aryRmv(a,2)��� ȣ���� �Ŀ��� �迭a�� ��Ҵ� {1,3,7,9,11,11}�� �ȴ�.
		m.aryRmv();
		// 3. ���ھ߱�����
		
	}
	// 1�� ����
	public void today() {
		/*
		// ���� ��¥ ���ϴ� ���� ����
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat dateForm = new SimpleDateFormat("YYYY�� MM�� dd��");
		
		Y Week year
		y Year
		M Month in year
		m Minute in hour
		D Day in year
		d Day in month
		
		System.out.println("������ " + dateForm.format(date) + "�Դϴ�");
		
		// ���� ��¥ ���ϴ� �ٸ� ���
		
		Calendar�� �߻�Ŭ�����̱� ������ ��ü�� ���� ������ �� ����.
		�޼ҵ带 ���ؼ� CalendarŬ������ ������ Ŭ������ �ν��Ͻ��� ���� �Ѵ�.
		Calendar cal = Calendar.getInstance();
		// System.out.println(cal);
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		���ڿ��� �����ִ°� StringBuilder�� StringBuffer�� ����
		StringBuffer�� ��� �񵿱������ ó���ǰ� StringBuilder�� ��� ��������� ó���ȴ�.
		�����, �񵿱���� �𸣸� https://private.tistory.com/24�� �����Ұ�.
		
		StringBuffer sb = new StringBuffer();
		sb.append(year + "�� ");
		sb.append(month + "�� ");
		sb.append(day + "�� ");
		sb.append(hour + "�� ");
		sb.append(min + "�� ");
		sb.append(sec + "�� ");
		System.out.println(sb.toString());
		*/
		
		// https://ryan-han.com/post/java/java-calendar-date/
		// http://blog.eomdev.com/java/2016/04/01/%EC%9E%90%EB%B0%948%EC%9D%98-java.time-%ED%8C%A8%ED%82%A4%EC%A7%80.html ������
		
		/*
		�� ��Ű���� Ŭ�������� String Ŭ����ó�� ������ �Ұ����ϴ�. ��, ��¥�� �ð��� �����ϸ� ������ ��ü�� ����Ǵ� ���� �ƴ϶�, ���ο� ��ü�� ��ȯ�Ѵ�.
		������ Calendar Ŭ������ ���氡�� �ϹǷ� ��Ƽ������ ȯ�濡�� �������� �ʾҴ�.

		��Ƽ������ ȯ�濡���� ���� �����尡 ���ÿ� ���� ��ü�� ������ �� �־ ���� ������ ��ü�� �����Ͱ� �߸� �� ���ɼ��� �ִ�.
		�̸� ������ ����(Thread-safe)���� ���ϴٰ� �Ѵ�.
		 */
		
		// ����ϱ� ���� ���� ����
		String now = "";
		// ���� ��¥ �������ִ� ��ü ����
		LocalDateTime now2 = LocalDateTime.now();
		// ���ϴ� ���ڿ��� ��¥������
		DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("yyyy�� M�� d�� a h�� m�� s��");
		now = now2.format(dateTime);
		System.out.println(now);
		
		// ������ � ���ϱ�
		// ���� �޼ҵ带 ������ ������� ��������� ����
		int ran = 0;
		// ��� ���ϱ� ���� ����ؾ��ϴ� �迭
		String[] luck = new String[]{"���", "��", "�߱�", "�ұ�", "��"};
		// char[] luck = new char[]{}�� �� �������� ������ �Ұ����ϴ�.
		// char�� ����Ǿ���ϴ� ������ ũ�Ⱑ �ִ� 2byte�̹Ƿ� �ѱ��� �α��� �̻� ������ �� ����.
		// String�� ������ �����ҽ� �� �޸� ������ ����Ǳ� ������ �Ÿ��� �뷮�� ���� �ִ�� ������ �� �ִ� ����ũ�Ⱑ �޶�����.
		for(int i=0; i<10; i+=1) {
			// Math.random()�� ������ �����ϴ� �޼ҵ��̴�
			ran = (int)(Math.random()*5);
			// *5�� �ڿ� 0 ~ 4��ŭ�� ������ �ֱ����� �������̴�.
			// System.out.println(Math.random());�� �ĺ��� ����� ���ظ� �� �� �ִ�.
		}
		System.out.println("������ ��� " + luck[ran] + "�Դϴ�");
	}
	public void aryRmv() {
		Scanner s = new Scanner(System.in);
		System.out.println("������ ������ ������ 0 ~ 5���� �Է��ϼ���.");
		int idx = s.nextInt();
		s.close();
		if(idx >= 6) {
			System.out.println("6�̸��� ���ڸ� �Է����ּ���");
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
		System.out.println("������ �迭�� �����Ѵ�.");
		System.out.println(a);
		a.remove(idx);
		System.out.println("�����Ŀ� �迭�� �����Ѵ�.");
		System.out.println(a);
	}
	public void baseBall() {
		
	}
}
