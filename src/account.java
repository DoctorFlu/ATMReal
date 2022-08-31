import java.util.HashMap;
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
	return "Your acount has been created! IT's ID is: " + accountList.get(accountNumber) + " and your current balance is: " + accountList.get(balance);
}

public String closeAccount(int accountID) {
	if (accountList.get(accountID) == 0.0) {
		accountList.remove(accountID);
		return "Your account has been closed!";
	} else {
		return "Your account couldn't be closed! Make sure your balance is 0.0";
	}
}
}
