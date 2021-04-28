package day_0428_3;

public class Button {
	interface onClickListener {
		void onClick();
	}
	
	onClickListener listener;
	 
	void setOnClickListener(onClickListener listener) {
		this.listener= listener;
	}
	
	void touch() {
		listener.onClick();
	}
}
