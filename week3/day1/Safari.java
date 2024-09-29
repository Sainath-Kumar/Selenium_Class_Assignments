package week3.day1;

public class Safari extends Browser {

	
		
	void readerMode() 
	{
		 System.out.println("Reader Mode");

	}
	
	void fullScreenMode()
	
	{
	
		 System.out.println("Fullscreen Mode");

	}
	public static void main(String[] args) {
		Safari c = new Safari();
		c.openURL();
		c.readerMode();
	}
}