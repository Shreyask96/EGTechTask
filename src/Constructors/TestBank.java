package Constructors;

public class TestBank {
	public static void main(String[] args) {
		
		Bank bank1=new Bank();
		int id=bank1.getAccoundID();
	//	System.out.println(id);
		String name=bank1.getAccholdername();
		double balance=bank1.getBalance();
		
		bank1.setAccoundID(123);
		int id1=bank1.getAccoundID();
		System.out.println(id1);
		
		bank1.setAccholdername("Rahul");
		String name1=bank1.getAccholdername();
		System.out.println(name1);
		
		bank1.setBalance(90999);
		double balance1=bank1.getBalance();
		System.out.println(balance1);
		
		Bank bank=new Bank();
		int id2=bank.getAccoundID();
		System.out.println(id2);
		String name2=bank.getAccholdername();
		double balance2=bank.getBalance();
		
		
		bank.setAccoundID(124);
		int id3=bank.getAccoundID();
		System.out.println(id3);
		
	}

}
