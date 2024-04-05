package Constructors;

public class Bank {
//		Bank(){                                                   //non-parameterzied constructor
//		System.out.println("i have created a Constructor");
//		}
	
	
	private int accoundID;
	private String accholdername;
    private double balance;
    
    
		public int getAccoundID() {
		return accoundID;
	}
	public void setAccoundID(int accoundID) {
		this.accoundID = accoundID;
	}
	public String getAccholdername() {
		return accholdername;
	}
	public void setAccholdername(String accholdername) {
		this.accholdername = accholdername;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}


