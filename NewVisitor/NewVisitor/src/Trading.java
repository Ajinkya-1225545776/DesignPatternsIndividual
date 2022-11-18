public class Trading implements Producd {
    private static int Traderid;
    private static String Tradername;

    public Trading(int Traderid, String Tradername) {
        Trading.Traderid = Traderid;
        Trading.Tradername = Tradername;
    }

    public static int getTraderid() {
        return Traderid;
    }

    public static String getTradername() {
        return Tradername;
    }

    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
