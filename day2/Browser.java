package week1.day2;

public class Browser {

	
		 public void launchBrowser(String browserName) {
		
		 System.out.println(browserName);
		 }
		public String browserName() {
			return "CHROME";
		}
		
		public void loadUrl()
		{
			System.out.println("Application url loaded successfully");
		}
		 
		 
		public static void main(String[] args) {
			Browser B=new Browser();
			B.launchBrowser("Browser launched successfully");
			B.loadUrl();
			String browserName = B.browserName();
			System.out.println(browserName);

	}
}

