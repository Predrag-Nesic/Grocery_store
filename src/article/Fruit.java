package article;

public class Fruit extends Article {
    private String unitOfMeasure;
    private double pricePerUnitOfMeasure;
    private String type;

    public Fruit(String name, String unitOfMeasure, double pricePerUnitOfMeasure, String type) {
        super.name = name;
        this.unitOfMeasure = unitOfMeasure;
        this.pricePerUnitOfMeasure = pricePerUnitOfMeasure;
        this.type = type;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    @Override
    public String toString() {
        return name + " - " + type + " [" + pricePerUnitOfMeasure + "/" + unitOfMeasure + "]";
    }

    @Override
    public double price(double quantity) {
        double totalPrice = 0;
        totalPrice += this.pricePerUnitOfMeasure * quantity;
        return totalPrice;
    }
}
