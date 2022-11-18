public class Product implements Producd {
    private int productnos;
    private static String productname;

    public Product(int productnos, String productname) {
        this.productnos = productnos;
        Product.productname = productname;
    }

    public int getprodno() {
        return this.productnos;
    }

    public static String getprodname() {
        return productname;
    }

    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }
}