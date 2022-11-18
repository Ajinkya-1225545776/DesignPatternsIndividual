package structural.facade;

public class login extends MainFacade {
    public login() {
    }

    public login getlogin() {
        String user1 = "tutu";
        String pass1 = "1111";
        if (user1.equals("tutu") && pass1.equals("1111")) {
            System.out.println("tutu Logged IN");
        } else if (user1.equals("mimi") && pass1.equals("2222")) {
            System.out.println("Mimi Logged in");
        } else {
            System.out.println("wrong credentials");
        }

        String user2 = "pepe";
        String pass2 = "3333";
        if (user1.equals("pepe") && pass1.equals("3333")) {
            System.out.println("Sellers Logged IN");
        } else {
            System.out.println("Sellers wrong credentials");
        }

        return null;
    }
}
