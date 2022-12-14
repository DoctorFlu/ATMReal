import java.util.*;
public class account {
HashMap<Integer, Double> accountList;

public account() {
	accountList = new HashMap<Integer, Double>();
}
public void openAccount(int accountNumber) {
	accountList.put(accountNumber,0.0);
}
public void openAccount(int accountNumber, double balance) {
	accountList.put(accountNumber, balance);
}

public void closeAccount(int accountID) {
	if (accountList.get(accountID) == 0.0) {
		accountList.remove(accountID);
	} 
}

public double checkBalance(int accountID) {
	return (double) accountList.get(accountID);
}

public boolean depositMoney(int accountID, double deposit) {
	if(Math.abs(deposit) == deposit && deposit < 10000) {
		accountList.put(accountID, accountList.get(accountID) + deposit);
		return true;
	} else {
		return false;
	}
	
}
public boolean withdrawMoney(int accountID, double withdrawl) {
	double currentMoney = accountList.get(accountID);
	System.out.println(currentMoney);
	if(Math.abs(withdrawl) == withdrawl && accountList.get(accountID) >= withdrawl) {
		double newMoney = 0.1 * Math.floor((currentMoney - withdrawl) * 10.0);
		accountList.put(accountID, newMoney);
		return true;
	} else {
		return false;
	}
}
}
