package javaKamp2022ThirdDayHomeworkThree.core.logging;

public class MailLogger implements Logger{

	@Override
	public void log(String data) {		
		System.out.println("Mail gonderildi: " + data);
	}

}
