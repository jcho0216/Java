import java.util.ArrayList;
import java.util.Scanner;

public class JavaBoard {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] postTitle = new String[10];
		String[] postContents = new String[10];
		ArrayList<String> list = new ArrayList<String>();
		
		int index = 0;
		int[] ids = new int[10];
	
		
		while(true) {
			System.out.print("명령어를 입력해주세요: ");
			String command = scan.nextLine();
			
			if(command.equals("exit")) {
				System.out.print("프로그램을 종료합니다.");
				break;
			}
			
			if(command.equals("add")) {
			
				System.out.print("게시물 제목을 입력해주세요: ");
				postTitle[index] = scan.nextLine();
				
				System.out.print("게시물 내용을 입력해주세요: ");
				postContents[index] = scan.nextLine();
				
				System.out.print("게시물이 등록되었습니다~\n");
				
				ids[index] = id;
				
				index++;
				
			}
			
			if(command.equals("list")) {
				System.out.println("====================");

				for(int i = 0; i < index; i++) {
					System.out.println("번호: " + (i + 1));
					System.out.println("제목: " + postTitle[i]);
					System.out.println("====================");
					
				}
			}
		
			
		}
	}

}


