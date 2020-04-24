package week3;

public class week3 {
	public static void main(String[] args) {
		
		// 1. 5���� ���ڸ� �Է� �޾� ������������ ���������� ����� ������. �� �ܰ躰 ��ȭ�Ǵ� ������ ����ϼ���.
		int[] a = {15, 11, 1, 3, 8};
		
		System.out.println("1������ ����");
		System.out.println("�迭 ����");
		print(a);
		shuffle(a);
		System.out.println("\n�迭 ����");
		print(a);
		bubble(a);
		System.out.println("\n�迭 �������� ����");
		print(a);
		
		// 2. �� 2���� �Է� �Ͽ� �޼ҵ带 ���� ���� ��� ���� ȣ���غ�����.
		System.out.println("\n\n2������ ����");
		int b = 3;
		int c = 5;
		math(b, c);
		
		// 3. �޼ҵ带 �̿��Ͽ� 3�� �л��� 3���� ������ �Է¹޾� �� ���� �л��� ������ ����ϴ� ����ȭ�� ���α׷��� �ۼ��Ͻÿ�.
		System.out.println("\n3������ ����");
		int[] d = {50, 80, 100};
		int[] e = {96, 88, 66};
		int[] f = {100, 85, 90};
		sum(d, e, f);
		
	}
	// ����� ���
	public static void print(int[] a) {
		for (int i : a) {
			System.out.print(i + "\t");
		}
	}
	// ���������� �迭 ����
	public static void shuffle(int[] a) {
		for (int i=0; i<10000; i+=1) {
			int ranNum = ((int)(Math.random()*a.length));
			int temp = a[0];
			a[0] = a[ranNum];
			a[ranNum] = temp;
		}
	}
	// �������� �ϱ�
	public static void bubble(int[] a) {
		// 0 ~ a.length-1���� �ݺ�
		for (int i=0; i<a.length-1; i+=1) {
			// j��°�� length-1��°�� ��Ұ� ũ�� ���� �ƴϸ� ��ȯ
			for (int j=0; j<a.length-1-i; j+=1) {
				// a[j+1]�� a[j]���� Ŭ��� ��ȯ
				if (a[j]<a[j+1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}
	// �޼ҵ带 �̿��ؼ� ����ϱ�
	public static void math(int b, int c) {
		int num = b+c;
		System.out.println(num + " <-- 2������ ����");
	}
	// �л��� �� ���� ���
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
