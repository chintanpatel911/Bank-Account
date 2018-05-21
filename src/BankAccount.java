/* Name : Chintan PAtel
 * CSU ID : 2473177
 * Assigment 9: Bank Account
 */
public class BankAccount {
	private String firstname;
	private String lastname;
	private int ssn;
	private int accountNumber;
	private double balance;
	private PhoneNumber phonenumber;
	
	BankAccount(){
		firstname = "John";
		lastname = "Smith";
		ssn = 0;
		accountNumber = 0;
		balance = 0;
		phonenumber = null; 
	}
	
	BankAccount(String firstname, String lastname, int ssn){
		this.firstname = firstname;
		this.lastname = lastname;
		this.ssn = ssn;
		accountNumber = 0;
		balance = 0;
		phonenumber = null;
	}
	
	public String getName(){
		return  firstname +" " + lastname;	
	}
	public double getBalance(){
		return balance;
	}
	public PhoneNumber getPhoneNumber(){
		return phonenumber;
	}
	public void setAccountNumber(int accountnumber){
		accountNumber = accountnumber;
	}
	public void setPhoneNumber(PhoneNumber pn){
		phonenumber = pn; 
	}
	public boolean equals(BankAccount ba){
		return (firstname==ba.firstname && lastname==ba.lastname && ssn==ba.ssn && accountNumber == ba.accountNumber && balance == ba.balance && phonenumber == ba.phonenumber);
	}
	
	public void deposit (double amount){
		balance = amount + balance ; 
	}
	public int withdraw(double withdraw){
		if (withdraw < balance ){
			balance = balance - withdraw;
			return 0;
		}else{
			return -1;
		}
	}
	public String toString(){
		return firstname + " " + lastname + "\n" + "Balance: " + balance +"\n" +"ssn: " + ssn +"\n" + "accountNumber: " + accountNumber + "\n" +"phonenumber: "+ phonenumber;
	
	}


}
