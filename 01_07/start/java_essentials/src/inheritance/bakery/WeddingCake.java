package inheritance.bakery;

public class WeddingCake extends Cake{
    int tiers;

    public WeddingCake() {
        super("almond");
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
