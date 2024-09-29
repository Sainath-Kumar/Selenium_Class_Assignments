package week3.day1;

public class Edge extends Chrome {
	
	
	
	void takeSnap() 
	{
		 System.out.println("Take Snap");

	}
	void clearCookies()
	{
		 System.out.println("Clear Cookies");
	}
		 public void openURL()
		 {
			 System.out.println("Google.com");
		 }


public static void main(String[] args) {
	Edge b = new Edge();
	b.clearCache();
	b.closeBrowser();
	b.takeSnap();
	b.openURL();
}
}