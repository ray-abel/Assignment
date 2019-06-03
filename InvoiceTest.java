public class InvoiceTest{
    public static void main(String [] args){


       Invoice account1 = new Invoice("100", "bag", 2, 500.00);
       Invoice account2 = new Invoice("101", "jack", 1, -1.45);

       System.out.println(account1.getInvoice());
       System.out.println(account2.getInvoice());
       System.out.println(account1.getNumber() + " " + account1.getDescription() + " " + account1.getPQuantity() + " " + account1.getPrice());
       System.out.println(account2.getNumber() + " " + account2.getDescription() + " " + account2.getPQuantity() + " " + account2.getPrice());
    }
}