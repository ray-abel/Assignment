public class Invoice{
    private String number;
    private String description;
    private int quantity;
    private double price;

    public Invoice(String number, String description, int quantity, double price){
        this.number = number;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }    
    public void setNumber(String number){
        this.number = number;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public String getNumber(){
        return number;
    }
    public String getDescription(){
        return description;
    }
    public int getPQuantity(){
        return quantity;
    }
    public double getPrice(){
        return price;
    }
    public double getInvoice(){
        
       
        if(quantity < 0){
            quantity = 0;
        }  
        if(price < 0){
            price = 0.0;
        }
        double amount = quantity * price;
            return amount;
        
    }
  
}
