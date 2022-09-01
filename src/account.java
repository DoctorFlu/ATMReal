import java.util.*;
public class account {
HashMap<Integer, Double> accountList;

public account() {
	accountList = new HashMap<Integer, Double>();
}
public String openAccount(int accountNumber) {
	accountList.put(accountNumber,0.0);
	return "Your account has been created! It's ID is: " + accountList.get(accountNumber) + " and your balance is: " + accountList.get(0.0);
}
public String openAccount(int accountNumber, double balance) {
	accountList.put(accountNumber, balance);
	return "Your acount has been created! It's ID is: " + accountList.get(accountNumber) + " and your current balance is: " + accountList.get(balance);
}

public String closeAccount(int accountID) {
	if (accountList.get(accountID) == 0.0) {
		accountList.remove(accountID);
		return "Your account has been closed!";
	} else {
		return "Your account couldn't be closed! Make sure your balance is 0.0";
	}
}

public double checkBalance(int accountID) {
	return accountList.get(accountID);
}

public boolean depositMoney(int accountID, double deposit) {
	if(Math.abs(deposit) == deposit) {
		accountList.put(accountID, accountList.get(accountID) + deposit);
		return true;
	} else {
		return false;
	}
	
}
public boolean withdrawMoney(int accountID, double withdrawl) {
	if(Math.abs(withdrawl) == withdrawl) {
		accountList.put(accountID, accountList.get(accountID) - withdrawl);
		return true;
	} else {
		return false;
	}
}
}
