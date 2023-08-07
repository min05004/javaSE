package section12.access3;

public interface BluthoothMIC extends Microphone, Speaker {
	//다중상속 가능. Microphone, Speaker
	public abstract void connect();

}
