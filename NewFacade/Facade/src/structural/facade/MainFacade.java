package structural.facade;

public class MainFacade {
    public MainFacade() {
    }

    public structural.facade.login getlogin() {
        String user1 = "tutu";
        String pass1 = "1111";
        if (user1.equals("tutu") && pass1.equals("1111")) {
            System.out.println("Buyer Logged IN");
        } else if (user1.equals("mimi") && pass1.equals("2222")) {
            System.out.println("Buyer Logged in");
        } else {
            System.out.println("Buyer's Wrong Credentials");
        }

        String user2 = "pepe";
        String pass2 = "3333";
        if (user2.equals("pepe") && pass2.equals("3333")) {
            System.out.println("sellers Logged IN");
        } else {
            System.out.println("sellers wrong credentials");
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
}
