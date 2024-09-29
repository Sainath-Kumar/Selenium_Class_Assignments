package week3.day1;

public class DriverOverloadingconcept {

	
	  public void loadUrl (String url,boolean status)
	  {
		  System.out.println("URL : " +url+ '\n'+ " "+"Status : " + status);
	  }
	  
	  public void loadUrl(String url)
	  {
		  System.out.println(url);
		  
	  }
	  
	  public static void main(String[] args) {
		  DriverOverloadingconcept D =new DriverOverloadingconcept();
		D.loadUrl("XYZ.com");
		System.out.println("\n");
		
		D.loadUrl("Facebook.com",true);
	}
	
}
