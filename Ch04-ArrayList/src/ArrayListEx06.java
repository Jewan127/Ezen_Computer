import java.util.Scanner;

public class ArrayListEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 /*
	 	1. ����ڿ��� ���� ����� �Է� �޴´�.
	 	2. �Է��� ������ ũ�⸸ŭ�� �ʹ迭�� �����Ѵ�.
	 	3. �迭�� ���ʷ� 0~2������ ���� �����ϰ� �Է��Ѵ�.
	 	4. �迭�� ���� ���� ȭ�鿡 ���� ����Ѵ�.
	 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ũ�� �Է�: ");
		int map = sc.nextInt();
		
		int [] num = new int[map];
		
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*3);
				if(num[i] == 0) {
					System.out.print("#");
				} else if(num[i] == 1) {
					System.out.print("0");
				} else if(num[i] == 2) {
					System.out.print("X");
				}
			}		
	}
}