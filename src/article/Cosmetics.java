package article;

public class Cosmetics extends Article {
    private double pricePerPiece;

    public Cosmetics(String name, double pricePerPiece) {
        super.name = name;
        this.pricePerPiece = pricePerPiece;
    }

    @Override
    public String toString() {
        return name + " [" + pricePerPiece + "]";
    }

    @Override
    public double price(double quantity) {
        double totalPrice = 0;
        totalPrice += this.pricePerPiece * quantity;
        return totalPrice;
    }
}
