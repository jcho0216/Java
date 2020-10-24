package 회원관리;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		회원관리자 a관리자 = new 회원관리자();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("가입할 아이디를 입력해주세요 : ");
		String id = scan.next();
		System.out.println("사용할 비밀번호를 입력해주세요 : ");
		String pw = scan.next();
		System.out.println("이름을 입력해주세요: ");
		String name = scan.next();
		
		회원 회원1 = new 회원(id, pw, name);
		a관리자.회원저장(회원1);
		// 출력 : 회원정보가 등록되었습니다.
		System.out.println("===");
		a관리자.전체회원보기();
		// 출력 : 홍길동 회원 정보 출력

//		회원 회원2 = new 회원("hong123", "h4321", "홍길순");
//
//		a관리자.회원저장(회원2);
//		// 출력 : 이미 존재하는 아이디입니다.
//		System.out.println("===");
//		회원2 = new 회원("hong321", "h4321", "홍길순");
//		a관리자.회원저장(회원2);
//		// 출력 : 회원정보가 등록되었습니다.
//		System.out.println("===");
//		a관리자.전체회원보기();
//		// 출력 : 홍길동, 홍길순 회원 정보 출력
//
//		a관리자.로그인("sdf", "asdf");
//		// 출력 : 잘못된 회원정보입니다.
//		a관리자.로그인("hong321", "h1234");
//		// 출력 : 잘못된 회원정보입니다.
//		a관리자.로그인("hong123", "h1234");
//		// 출력 : 홍길동님! 안녕하세요!
//		a관리자.로그인("hong321", "h4321");
//		// 출력 : 홍길님! 안녕하세요!
//
//		a관리자.비밀번호찾기("hong123", "홍길당");
//		// 출력 : 회원정보가 일치하지 않습니다.
//		a관리자.비밀번호찾기("hong123", "홍길동");
//		// 출력 : 홍길동님의 비밀번호는 h1234입니다.
//
//		// 회원의 아이디와 비밀번호로 새비밀번호 변경
//		a관리자.비밀번호변경("hong123", "1234", "hh1234");
//		// 출력 : 회원정보가 일치하지 않습니다.
//		a관리자.비밀번호변경("hong123", "h1234", "hh1234");
//		// 출력 : 비밀번호가 hh1234로 변경되었습니다.

	}

}

class 회원 {
	String 이름;
	String 비밀번호;
	String 아이디;

	회원(String a, String b, String c) {
		아이디 = a;
		비밀번호 = b;
		이름 = c;
	}
}

class 회원관리자 {

	회원[] 회원들 = new 회원[10];
	int size = 0;
	
	void 비밀번호찾기(String 아이디, String 이름) {
		int a = 0;
		for (int i = 0; i < size; i++) {
			회원 b회원 = 회원들[i];
			if (아이디.equals(b회원.아이디)) {
				if (이름.equals(b회원.이름)) {
					System.out.println(b회원.이름 + "님의 비밀번호는 " + b회원.비밀번호);
				} else {
					System.out.println("잘못된 회원정보입니다.");
				}
				a = 1;
				break;
			}
		}

		if (a == 0) {
			System.out.println("잘못된 회원정보입니다.");
		}
	}
	
	void 비밀번호변경(String 아이디, String 비밀번호, String 새비밀번호) {
		int a = 0;
		for (int i = 0; i < size; i++) {
			회원 b회원 = 회원들[i];
			if (아이디.equals(b회원.아이디)) {
				if (비밀번호.equals(b회원.비밀번호)) {
					b회원.비밀번호 = 새비밀번호;
					System.out.println("비밀번호가 " + 새비밀번호 + "로 변경되었습니다.");
				} else {
					System.out.println("잘못된 회원정보입니다.");
				}
				a = 1;
				break;
			}
		}

		if (a == 0) {
			System.out.println("잘못된 회원정보입니다.");
		}
	}

	void 로그인(String 아이디, String 비밀번호) {
		int a = 0;
		for (int i = 0; i < size; i++) {
			회원 b회원 = 회원들[i];
			if (아이디.equals(b회원.아이디)) {
				if (비밀번호.equals(b회원.비밀번호)) {
					System.out.println(b회원.이름 + "님 안녕하세요!!");
				} else {
					System.out.println("잘못된 회원정보입니다.");
				}
				a = 1;
				break;
			}
		}

		if (a == 0) {
			System.out.println("잘못된 회원정보입니다.");
		}
	}

	void 회원저장(회원 a회원) {

		// 1. a회원에게서 아이디정보 가져오기
		String 등록할아이디 = a회원.아이디;

		// 2. 저장소에 저장된 회원들의 아이디를 싹다 가져오기
		int a = 0;
		for (int i = 0; i < size; i++) {
			회원 b회원 = 회원들[i];
			if (등록할아이디.equals(b회원.아이디)) {
				a = 1;
				break;
			}
		}

		// 3. 비교해서 같은게 있으면 중복처리
		if (a == 1) {
			System.out.println("중복된 아이디입니다.");
		} else {
			// 4. 없으면 등록 처리
			회원들[size] = a회원;
			size++;
		}

	}

	void 전체회원보기() {
		for (int i = 0; i < size; i++) {
			회원 a회원 = 회원들[i];
			System.out.println(a회원.아이디);
			System.out.println(a회원.비밀번호);
			System.out.println(a회원.이름);
			System.out.println("=====================");
		}
	}
}
