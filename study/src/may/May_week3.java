package may;

import java.util.ArrayList;
import java.util.Scanner;

public class May_week3 {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		May_week3 m = new May_week3();
		// 1. Scanner Ŭ������ ����Ͽ� 6�� ����('A', 'B', 'C', 'D', 'F')�� ���ڷ� �Է¹޾� ArrayList�� �����ϰ�,
		// ArrayList�� �˻��Ͽ� ������ ����(A=4.0, B=3.0, C=2.0, D=1.0, F=0)�� ��ȯ�Ͽ� ����� ����ϴ� ���α׷��� �ۼ��϶�.
		m.AVG();
		// 2. "�׸�"�� �Էµ� ������ ���� �̸��� �α��� �Է¹޾� �����ϰ�, �ٽ� ���� �̸��� �Է¹޾� �α��� ����ϴ� ���α׷��� �ۼ��϶�. ���� �ؽø��� �̿��϶�.
		
		// 3. �ϳ��� �л� ������ ��Ÿ���� Student Ŭ�������� �̸�, �а�, �й�, ���� ����� �����ϴ� �ʵ尡 �ִ�.
		// (1) �л����� Student ��ü�� �����ϰ� 4���� �л� ������ ArrayList<Student> �÷��ǿ� ������ �Ŀ�,
		// ArrayList<Student>�� ��� �л�(4��) ������ ����ϰ� �л��̸��� �Է¹޾� �ش� �л��� ���� ����� ����ϴ� ���α׷��� �ۼ��϶�.
		
		// 4.���ĵ��� ���� �л����� ������ ������ �Է��Ͽ� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ������ ������ ���� �� ������, �̷��� ��� ���� ������ ó���Ѵ�.
		// ���� ��� 5���� ���� 100, 90, 76, 60, 90�� �ԷµǾ��ٸ� ������ 2���� 2���̰� 3���� ����.
		// (��, ������ ���� ���� �л��� 1������ �Ѵ�.)
		// �Է�)
		// 1) ù ��° ���� ó���� ������ ���� n ( n <= 200 ) �� ���Ǽ���:2012.10.6
		// 2) �� ��° ���� ó���� ���� ������ (0~100��)
		// (��, ������ ������ ��ĭ���� �����Ѵ�.)
		
	}
	public void AVG() {
		int score = 0;
		int result = 0;
		int[] scoreSet = new int[]{4, 3, 2, 1, 0};
		System.out.println("A���� F�� ������ 5���� ���� �Է��ϼ���");
		System.out.println("EX) A�� �ֱ����ؼ��� 0�� �Է��Ѵ�, F�� �ֱ� ���ؼ��� 4�� �Է��Ѵ�");
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
		
		// �� ����� ������ ����Ѵ�.
		for(int i=0; i<scoreList.size(); i+=1) {
			System.out.println("����� " + (i+1) + "��° ������ : " + scoreList.get(i));
		}
		// �� ������ �� ���� ���Ѵ�.
		for(int i=0; i<scoreList.size(); i+=1) {
			score = score + scoreList.get(i);
		}
		System.out.println("�� ������ : " + score);
		// ���� ������ ����� ���Ѵ�.
		result = score / scoreList.size();
		System.out.println("�� ������ ����� : " + result);
	}
}
