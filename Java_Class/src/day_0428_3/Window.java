package day_0428_3;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	Button.onClickListener listener = new Button.onClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("��ȭ�� �̴ϴ�.");			
		}
	};
	
	Window() {
		button1.setOnClickListener(listener);
		button2.setOnClickListener(new Button.onClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("�޽����� �����ϴ�.");
			}
		});
	}
}
