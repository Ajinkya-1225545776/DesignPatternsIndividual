package structural.facade;

public class HelloApplication {
    public HelloApplication() {
    }

    public static void main(String[] args) {
        MainFaca mainf = new MainFaca();
        login l = mainf.getlogin();
        Reminder R = mainf.getreminder();
        ProductMenu Pm = mainf.getproductmenu();
        TradingMenu Tm = mainf.gettradingmenu();
        OfferingMenu Om = mainf.getofferingmenu();
    }
}