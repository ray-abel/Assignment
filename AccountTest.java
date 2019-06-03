import java.util.Scanner;//importing the scanner class
public class AccountTest{ 

    //main menthod starts here
public static void main(String[] args){ 

    //new object created 
Account account1 = new Account("john base",100.00);  
Account account2 = new Account("peter ray", -70.0);

// display initial balance 
System.out.printf("%s balance : $%.2f\n",account1.getName(),account1.getBalance());
System.out.printf("%s second balance : $%.2f\n",account2.getName(),account2.getBalance());

//create a scanner to get imput from user
Scanner input = new Scanner(System.in);

System.out.println("Enter deposits amount for account 1");//prompt
double depositsAmount =input.nextDouble();
account1.deposits(depositsAmount);//add to account1 balance 

//Display output
System.out.printf("%s add to balance:$%.2f\n",account1.getName(),account1.getBalance());
System.out.printf("%s add to balance:$%.2f\n", account2.getName(),account2.getBalance());

System.out.println("Enter deposits amount for account 2");//prompt
depositsAmount =input.nextDouble();
account2.deposits(depositsAmount);//add to account1 balance 

//Display output
System.out.printf("%s add to balance:$%.2f\n",account1.getName(),account1.getBalance());
System.out.printf("%s add to balance:$%.2f\n", account2.getName(),account2.getBalance());

System.out.println("Enter amount to withdraw");
double withdrawAmount = input.nextDouble();
account1.withdrawal(withdrawAmount);

//display withdrawal amount
System.out.printf("%s balance:$%.2f\n",account1.getName(),account1.getBalance());

System.out.println("Enter amount to withdraw");
withdrawAmount = input.nextDouble();
account2.withdrawal(withdrawAmount);

System.out.printf("%s balance:$%.2f\n", account2.getName(),account2.getBalance());
}//end main
}//end class AccountTest