package may;

import java.text.SimpleDateFormat;
import java.util.Date;

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

		// 3. ���ھ߱�����
		
	}
	public void today() {
		Date date = new Date(); // ���� ��¥�� Ȯ�����ִ� ��ü����
		SimpleDateFormat dateForm = new SimpleDateFormat("YYYY�� LL�� dd��");
		/*
		 * Y Week year
		 * y Year
		 * M Month in year (context sensitive)
		 * L Month in year (standalone form)
		 * m Minute in hour
		 * D Day in year
		 * d Day in month
		 */
		System.out.println("������ "+dateForm.format(date)+"�Դϴ�");
	}
}
