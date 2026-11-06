class BankAccount
{
    private String accountNumber = "329602010884521";
    private double balance = 0;
    public void deposit(double amount)
    {
       if(amount>0)
       {
          balance = amount + balance;
       }
    }
    public void withdraw(double wamount)
    {
       if(wamount > 0)
       {
          balance = balance - wamount;
       }
    }
    public double getremaining()
    {
       return balance;
    }
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.deposit(500);
        b.withdraw(200);
        System.out.println(b.getremaining());
    }
}