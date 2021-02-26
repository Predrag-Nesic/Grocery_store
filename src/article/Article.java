package article;

public abstract class Article {
    protected String name;

    public String getName() {
        return name;
    }

    public abstract double price(double quantity);
}

