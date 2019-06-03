/****************************************************
 * RAY O ABEL
 * 
 * A program that allows you to open an account and deposite money 
 * 
 ******************************************************/

public class Account{
        
    private String name;
    private double balance;
    public Account(String name,double balance ){
        this.name=name;
        if(balance > 0.0){
         this.balance = balance;
        }
    }
public void deposits(double deposits){
    if(deposits >0.0 ){
        balance+=deposits;
    }
}
public void withdrawal(double withdrawal){

    if (withdrawal > balance){
        System.out.println("Insuffient balance available");
    }else{
        balance-=withdrawal;
    }
}

 public double getBalance(){
     return balance;
 } public void setName(String name){
     this.name= name;
 }
 public String getName(){
     return name;
 }
}