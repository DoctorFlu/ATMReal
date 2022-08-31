public class account {
private int accountID;
private double balance;
private boolean isOpen;

public account(int accountID, double balance) {
	this.accountID = accountID;
	this.balance = balance;
	this.isOpen = true;
}
public static String openAccount(int accountNumber) {
	account account = new account(accountNumber, 0);
	return "Your account has been created! It's called " + account.accountID;
}

public static String openAccount(int accountNumber, double balance) {
	account account = new account(accountNumber, balance);
	return "Your account has been created! It's called " + account.accountID + " and has a balance of " + account.balance;
}

public static String closeAccount(int accountID) {
	if (account.balance == 0) {
		
	}
}
public int getAccountID() {
	return accountID;
}
public void setAccountID(int accountID) {
	this.accountID = accountID;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public boolean isOpen() {
	return isOpen;
}
public void setOpen(boolean isOpen) {
	this.isOpen = isOpen;
}
}

