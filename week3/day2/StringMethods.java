package week3.day2;

public class StringMethods {

	public static void main(String[] args) {
	
		String Value = "Selenium Java";
		String replace = Value.replace('e', 'E');
				System.out.println("Replace Function = "+ replace);
		
				String replaceAll = Value.replaceAll("[a-z]", "0");
				System.out.println("ReplaceAll Function = " + replaceAll);
				
		String amt = "5645";
		int integer = Integer.parseInt(amt);
		System.out.println("ParseInt Function = "+ integer);

		//String split = Value.split(" ");
		//System.out.println(split);
		
	}

}
