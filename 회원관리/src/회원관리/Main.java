package ȸ������;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ȸ�������� a������ = new ȸ��������();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("������ ���̵� �Է����ּ��� : ");
		String id = scan.next();
		System.out.println("����� ��й�ȣ�� �Է����ּ��� : ");
		String pw = scan.next();
		System.out.println("�̸��� �Է����ּ���: ");
		String name = scan.next();
		
		ȸ�� ȸ��1 = new ȸ��(id, pw, name);
		a������.ȸ������(ȸ��1);
		// ��� : ȸ�������� ��ϵǾ����ϴ�.
		System.out.println("===");
		a������.��üȸ������();
		// ��� : ȫ�浿 ȸ�� ���� ���

//		ȸ�� ȸ��2 = new ȸ��("hong123", "h4321", "ȫ���");
//
//		a������.ȸ������(ȸ��2);
//		// ��� : �̹� �����ϴ� ���̵��Դϴ�.
//		System.out.println("===");
//		ȸ��2 = new ȸ��("hong321", "h4321", "ȫ���");
//		a������.ȸ������(ȸ��2);
//		// ��� : ȸ�������� ��ϵǾ����ϴ�.
//		System.out.println("===");
//		a������.��üȸ������();
//		// ��� : ȫ�浿, ȫ��� ȸ�� ���� ���
//
//		a������.�α���("sdf", "asdf");
//		// ��� : �߸��� ȸ�������Դϴ�.
//		a������.�α���("hong321", "h1234");
//		// ��� : �߸��� ȸ�������Դϴ�.
//		a������.�α���("hong123", "h1234");
//		// ��� : ȫ�浿��! �ȳ��ϼ���!
//		a������.�α���("hong321", "h4321");
//		// ��� : ȫ���! �ȳ��ϼ���!
//
//		a������.��й�ȣã��("hong123", "ȫ���");
//		// ��� : ȸ�������� ��ġ���� �ʽ��ϴ�.
//		a������.��й�ȣã��("hong123", "ȫ�浿");
//		// ��� : ȫ�浿���� ��й�ȣ�� h1234�Դϴ�.
//
//		// ȸ���� ���̵�� ��й�ȣ�� ����й�ȣ ����
//		a������.��й�ȣ����("hong123", "1234", "hh1234");
//		// ��� : ȸ�������� ��ġ���� �ʽ��ϴ�.
//		a������.��й�ȣ����("hong123", "h1234", "hh1234");
//		// ��� : ��й�ȣ�� hh1234�� ����Ǿ����ϴ�.

	}

}

class ȸ�� {
	String �̸�;
	String ��й�ȣ;
	String ���̵�;

	ȸ��(String a, String b, String c) {
		���̵� = a;
		��й�ȣ = b;
		�̸� = c;
	}
}

class ȸ�������� {

	ȸ��[] ȸ���� = new ȸ��[10];
	int size = 0;
	
	void ��й�ȣã��(String ���̵�, String �̸�) {
		int a = 0;
		for (int i = 0; i < size; i++) {
			ȸ�� bȸ�� = ȸ����[i];
			if (���̵�.equals(bȸ��.���̵�)) {
				if (�̸�.equals(bȸ��.�̸�)) {
					System.out.println(bȸ��.�̸� + "���� ��й�ȣ�� " + bȸ��.��й�ȣ);
				} else {
					System.out.println("�߸��� ȸ�������Դϴ�.");
				}
				a = 1;
				break;
			}
		}

		if (a == 0) {
			System.out.println("�߸��� ȸ�������Դϴ�.");
		}
	}
	
	void ��й�ȣ����(String ���̵�, String ��й�ȣ, String ����й�ȣ) {
		int a = 0;
		for (int i = 0; i < size; i++) {
			ȸ�� bȸ�� = ȸ����[i];
			if (���̵�.equals(bȸ��.���̵�)) {
				if (��й�ȣ.equals(bȸ��.��й�ȣ)) {
					bȸ��.��й�ȣ = ����й�ȣ;
					System.out.println("��й�ȣ�� " + ����й�ȣ + "�� ����Ǿ����ϴ�.");
				} else {
					System.out.println("�߸��� ȸ�������Դϴ�.");
				}
				a = 1;
				break;
			}
		}

		if (a == 0) {
			System.out.println("�߸��� ȸ�������Դϴ�.");
		}
	}

	void �α���(String ���̵�, String ��й�ȣ) {
		int a = 0;
		for (int i = 0; i < size; i++) {
			ȸ�� bȸ�� = ȸ����[i];
			if (���̵�.equals(bȸ��.���̵�)) {
				if (��й�ȣ.equals(bȸ��.��й�ȣ)) {
					System.out.println(bȸ��.�̸� + "�� �ȳ��ϼ���!!");
				} else {
					System.out.println("�߸��� ȸ�������Դϴ�.");
				}
				a = 1;
				break;
			}
		}

		if (a == 0) {
			System.out.println("�߸��� ȸ�������Դϴ�.");
		}
	}

	void ȸ������(ȸ�� aȸ��) {

		// 1. aȸ�����Լ� ���̵����� ��������
		String ����Ҿ��̵� = aȸ��.���̵�;

		// 2. ����ҿ� ����� ȸ������ ���̵� �ϴ� ��������
		int a = 0;
		for (int i = 0; i < size; i++) {
			ȸ�� bȸ�� = ȸ����[i];
			if (����Ҿ��̵�.equals(bȸ��.���̵�)) {
				a = 1;
				break;
			}
		}

		// 3. ���ؼ� ������ ������ �ߺ�ó��
		if (a == 1) {
			System.out.println("�ߺ��� ���̵��Դϴ�.");
		} else {
			// 4. ������ ��� ó��
			ȸ����[size] = aȸ��;
			size++;
		}

	}

	void ��üȸ������() {
		for (int i = 0; i < size; i++) {
			ȸ�� aȸ�� = ȸ����[i];
			System.out.println(aȸ��.���̵�);
			System.out.println(aȸ��.��й�ȣ);
			System.out.println(aȸ��.�̸�);
			System.out.println("=====================");
		}
	}
}
