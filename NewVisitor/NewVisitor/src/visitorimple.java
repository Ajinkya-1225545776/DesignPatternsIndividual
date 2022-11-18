public class visitorimple implements Visitor {
    public visitorimple() {
    }

    public int visit(Product product) {
        int id1 = Trading.getTraderid();
        System.out.println("Product Id is " + id1 + "and its name is " + Product.getprodname());
        return id1;
    }

    public int visit(Trading trading) {
        int id = Trading.getTraderid();
        System.out.println("Trader Id is " + id + "and his name is " + Trading.getTradername());
        return id;
    }
}
