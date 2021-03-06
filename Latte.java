public class Latte extends Coffee{
    private double price;

    public Latte(){
        super("Latte", 10.00, "small");
    }

    public Latte(String size){
        super("Latte", size);
        this.price = setPrice(price, size);
    }

    public Latte(double price, String size){
        super("Latte", price, size);
    }

    public double setPrice(double price, String size){
        if(size == "small" ) {
            price = 10.00;
        }
        else if(size == "medium"){
            price = 15.00;
        }
        else if(size == "large"){
            price = 20.00;
        }
        return price;
    }

    public double getPrice(){
        return price;
    }

    public void toOrder(){
        System.out.println("You ordered a " + getSize() + " cup of " + getName() + ", you have to pay " + price + " dollars.");
    }
}
