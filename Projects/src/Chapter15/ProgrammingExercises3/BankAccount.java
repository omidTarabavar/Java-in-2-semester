package Chapter15.ProgrammingExercises3;

import java.util.*;

public class BankAccount implements Comparable<BankAccount>
{

	// the attributes
	private String accountNumber;
	private String accountName;
	protected double balance;

	// the methods

	// the constructor
	public BankAccount(String numberIn, String nameIn)
	{
		accountNumber = numberIn;
		accountName = nameIn;
		balance = 0;
	}

	// methods to read the attributes
	public String getAccountName()
	{
		return accountName;
	}

	public String getAccountNumber()
{
return accountNumber;
}

	public double getBalance()
{
return balance;
}

	// methods to deposit and withdraw money
	public void deposit(double amountIn)
{
balance = balance + amountIn;
}
	public boolean withdraw(double amountIn) {
		if(amountIn > balance)
		{
			return false; // no withdrawal was made
		}
		else
		{
			balance = balance - amountIn;
			return true; // money was withdrawn successfully
		}
  	}
	@Override
	public String toString(){
		return "( "+accountName+", "+accountNumber+", "+balance+" )";
	}

	public static void main(String[] args) {
		BankAccount[] accountList= new BankAccount[5];
		accountList[2] = new BankAccount("001","Omid");
		accountList[3] = new BankAccount("002","Mohammad");
		accountList[0] = new BankAccount("003","Ahmad");
		accountList[1] = new BankAccount("004","Ali");
		accountList[4] = new BankAccount("005","Amir");
		System.out.println(Arrays.toString(accountList));
		List<BankAccount> myList =Arrays.asList(accountList);
		Collections.sort(myList);
		System.out.println("\nSort with Collections.sort: "+myList);
		myList.sort(Comparator.naturalOrder());
		System.out.println("\nSort with List.sort: "+myList);
	}

	@Override
	public int compareTo(BankAccount o) {
		return accountNumber.compareTo(o.accountNumber);
	}
}

