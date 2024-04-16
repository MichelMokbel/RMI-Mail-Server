import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MailService extends Remote {
    void sendEmail(String recipient, String message) throws RemoteException;
    String receiveEmail(String account) throws RemoteException;
    boolean deleteEmail(int emailId) throws RemoteException;
}
