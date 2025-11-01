class Bank{
double amount;
public int  Bank(int amount){
    this.amount=amount;
    return amount;
}
public void withdraw(double withdrawalAmount){
if(withdrawalAmount>amount){
    System.out.println("insufficient balance");
}
else{
    amount=amount-withdrawalAmount;
    System.out.println("withdrawal successful"+amount);
    
}
}

public void deposit(double depositAmount){
    amount=amount+depositAmount;
    System.out.println("deposit successful"+amount);

}
}

public class inhert_que {
    public static void main(String[] args) {
        Bank b=new Bank();
        b.Bank(10000);
        b.withdraw(15000);
        b.deposit(5000);
        
    }
}