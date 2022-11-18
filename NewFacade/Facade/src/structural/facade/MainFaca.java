package structural.facade;

public class MainFaca {
    public MainFaca() {
    }

    public structural.facade.login getlogin() {
        String user1 = "tutu";
        String pass1 = "1111";
        if (user1.equals("tutu") && pass1.equals("1111")) {
            System.out.println("Tutu Logged IN");
        } else if (user1.equals("mimi") && pass1.equals("2222")) {
            System.out.println("Mimi Logged in");
        } else {
            System.out.println("wrong credentials");
        }

        String user2 = "pepe";
        String pass2 = "3333";
        if (user2.equals("pepe") && pass2.equals("3333")) {
            System.out.println("Sellers Logged IN");
        } else {
            System.out.println("Sellers wrong credentials");
        }

        return null;
    }

    public Reminder getreminder() {
        System.out.println("Reminder for Buyer for the upcoming overdue in trading window");
        return null;
    }

    public ProductMenu getproductmenu() {
        System.out.println("Shows Product Menu");
        return null;
    }

    public TradingMenu gettradingmenu() {
        System.out.println("Shows Trading Menu");
        return null;
    }

    public OfferingMenu getofferingmenu() {
        System.out.println("Shows Offering Menu");
        return null;
    }
}
