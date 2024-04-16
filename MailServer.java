import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MailServer {
    public static void main(String[] args) {
        try {
            MailService mailService = new MailServiceImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind("MailService", mailService);
            System.out.println("Mail Service is ready.");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
