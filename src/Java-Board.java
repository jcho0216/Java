import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
			System.out.print("명령어를 입력해주세요: ");
			String command = scan.nextLine();
			
			if(command.equals("exit")) {
				break;
			}
			
			if(command.equals("add")) {
				System.out.print("게시물 제목을 입력해주세요: ");
				String postTitle = scan.nextLine();
				
				System.out.print("게시물 내용을 입력해주세요: ");
				String postContents = scan.nextLine();
				
				System.out.print("게시물이 등록되었습니다~\n");
				
			}
			
			if(command.equals("list")) {
				System.out.print("번호: ");
				System.out.print("제목1: ");
			}
		
			
			
		}
	}

}
