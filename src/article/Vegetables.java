package article;

public class Vegetables extends Article {
    public String unitOfMeasure;
    public double pricePerUnitOfMeasure;

    public Vegetables(String name, String unitOfMeasure, double pricePerUnitOfMeasure) {
        super.name = name;
        this.unitOfMeasure = unitOfMeasure;
        this.pricePerUnitOfMeasure = pricePerUnitOfMeasure;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    @Override
    public String toString() {
        return name + " [" + pricePerUnitOfMeasure + "/" + unitOfMeasure + "]";
    }

    @Override
    public double price(double quantity) {
        double totalPrice = 0;
        totalPrice += this.pricePerUnitOfMeasure * quantity;
        return totalPrice;
    }
}
