package inheritance.bakery;

public class Cake {
    private double price;
    private String flavor;

    public Cake() {
        this("vanilla");
    }
    public Cake(String flavor) {
        setFlavor(flavor);
        setPrice(9.99);
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }
}
