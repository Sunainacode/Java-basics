class Account {
	int accountNo, balance;
	Account(){
		accountNo=0;
		balance=0;
	}
	synchronized void deposit(int amt){
		balance = balance + amt;
		System.out.println( amt + " is deposited");
		displayBalance();
        }
        synchronized void withdraw(int amt){
        	  balance = balance - amt;
		  System.out.println( amt + " is withdrawn");
		  displayBalance();
        }
	void displayBalance(){
		System.out.println("The remaining balance is = "+balance);
	}
}
class TransactionD implements Runnable{
	int amt;
	Account a;
	TransactionD(Account a, int amt){
		this.a = a;
		this.amt = amt;
	}
	
	public void run(){
		a.deposit(amt);
	}
}

class TransactionW implements Runnable{
	int amt;
	Account a;
	
	TransactionW(Account a, int amt) {
		this.a = a;
		this.amt = amt;
	}
	
	public void run(){
		a.withdraw(amt);
	}
}
class Transact extends Thread implements Runnable{
	public static void main(String[] args){
		Account ABC=new Account();
		ABC.balance=1000;
		ABC.accountNo=111;
		TransactionD t1;
		TransactionW t2;
		t1=new TransactionD(ABC,500);
		t2=new TransactionW(ABC,900);
		t1.run();
		t2.run();
	}
}