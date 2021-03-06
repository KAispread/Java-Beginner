package package16.anonymous;

public class AnonymousSample {

	public static void main(String[] args) {
		AnonymousSample sample = new AnonymousSample();
		sample.setButtonListener();
	}
	
	public void setButtonListener() {
		MagicButton button = new MagicButton();
		MagicButtonListener listener = new MagicButtonListener();
		button.setListener(listener);
		button.onClickProcess();
	}
	public void setButtonListenerAnonymous() {
		MagicButton button = new MagicButton();
		button.setListener(new EventListener() {
			public void onClick() {
				System.out.println("Magic Button is Clicked!!");
			}
		});
		button.onClickProcess();
	}
}
