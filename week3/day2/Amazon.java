package week3.day2;

public class Amazon extends CanaraBank {

	public void cashOnDelivery()
	{
		
		System.out.println("COD : Pay while Delivery");
		
	}
	
	public void upiPayments()
{
		
		System.out.println("UPI : Use QR to PAY");
		
	}
	public void cardPayments()
{
		
		System.out.println("Card Payment : Credit/Debit");
		
	}
	public void internetBanking()
{
		
		System.out.println("Bank Payment : Internet Banking");
		
	}
	
	public static void main(String[] args) {
		
		Amazon A =new Amazon();
		A.cardPayments();
		A.cashOnDelivery();
		A.upiPayments();
		A.internetBanking();
		A.recordPaymentDetails();
		
	}
	
}
