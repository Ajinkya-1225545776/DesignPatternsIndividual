public class Buyer extends Person {

    private String Meat;
    private String Produce;

    public Buyer(String MeatProduct,String ProduceProduct){
        this.Meat=MeatProduct;
        this.Produce=ProduceProduct;

    }

    @Override
    public String getline() {
        return "Buyer has Meat product as "+this.Meat+" and Produce product as "+this.Produce;
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "Meat='" + Meat + '\'' +
                ", Produce='" + Produce + '\'' +
                '}';
    }
}
