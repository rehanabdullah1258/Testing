package lab4;
public class BankAccount {
    private   String owner;
    private  int password;
    private int balance;
    public BankAccount(String owner, int password, int balance) {
        this.setOwner(owner);
        this.balance = balance;
        this.setPassword(password); }
    public String deposit(int amount) {
    	if(owner ==null ){ 
            return null;}
    	else if (owner =="ahmed" && password ==123){
        balance += amount;
       }else return "Notsuccessful"; 
    return "successful";}
    public boolean withdraw(int amount) {
    	if (owner =="ahmed"&& password ==123) {
    		 if(500 <= amount  && amount <= 5000) {
        if (amount <= balance) 
        	{ balance -= amount;
            return true;} }}
        return false;}
    public int getBalance() {
        return balance;}
	public String getOwner() {
		return owner;}
	public void setOwner(String owner) {
		this.owner = owner;}
	public boolean setPassword(int password) {
		if(99 <= password  && password <= 99999999) {
			this.password = password;
		return true;}
		else
		return false;}
}

