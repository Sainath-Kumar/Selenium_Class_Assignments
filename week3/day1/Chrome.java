package week3.day1;

public class Chrome extends Browser {

	
	void openIncognito()
	
	 {
		 System.out.println("InCognito Mode");
	 }
	
	void  clearCache()
	 {
		 System.out.println("Clear Cache");
	 }
public static void main(String[] args) {
	
	Chrome a = new Chrome();
	a.navigateBack();
	a.openURL();
	a.closeBrowser();
	a.openIncognito();
}	
	
	
	
	
	
}
