
public class BankDemo {
	public static void main(String[] args) {
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount("John", "Calipari", 238659777);
		
		account1.setAccountNumber(12345);
		account2.setAccountNumber(54321);
		
		PhoneNumber phone1 = new PhoneNumber(6874730);
		PhoneNumber phone2 = new PhoneNumber("800-GOFEDEX");
		
		account1.setPhoneNumber(phone1);
		account2.setPhoneNumber(phone2);
		
		account1.deposit(100);
		account2.deposit(200);
		
		System.out.println("The balance of account1 is: " + account1.getBalance());
		System.out.println("The balance of account2 is: " + account2.getBalance());
		
		account1.withdraw(100);
		account2.withdraw(201);
		
		System.out.println("account1 information: " + account1);
		System.out.println("account2 information: " + account2);
		
		System.out.println("The above two accounts are the same? " + account1.equals(account2));
		
	}

}
