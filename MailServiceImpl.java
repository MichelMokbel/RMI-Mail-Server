import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class MailServiceImpl extends UnicastRemoteObject implements MailService {
    protected MailServiceImpl() throws RemoteException {
        super();
    }

     @Override
    public void sendEmail(String recipient, String message) throws RemoteException {
        // Logic to send email
    }

    @Override
    public String receiveEmail(String account) throws RemoteException {
        // Logic to retrieve email
        return "Email content";
    }

    @Override
    public boolean deleteEmail(int emailId) throws RemoteException {
        // Logic to delete email
        return true;
    }
}

