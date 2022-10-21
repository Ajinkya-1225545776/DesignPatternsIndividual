public class Seller extends Person {
    private String Meat;
    private String Produce;

    public Seller(String MeatProduct,String ProduceProduct){
        this.Meat=MeatProduct;
        this.Produce=ProduceProduct;

    }

    @Override
    public String getline() {
        return "Seller has Meat product as "+this.Meat+" and Produce product as "+this.Produce;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "Meat='" + Meat + '\'' +
                ", Produce='" + Produce + '\'' +
                '}';
    }


}
