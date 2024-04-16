import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MailClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost");
            MailService stub = (MailService) registry.lookup("MailService");
            stub.sendEmail("example@example.com", "Hello, this is a test email!");
            System.out.println("Email sent successfully.");
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
