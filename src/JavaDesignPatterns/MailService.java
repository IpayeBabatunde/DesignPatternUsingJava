package JavaDesignPatterns;

public class MailService {
    public void sendEmail() {
        connect();
        authenticate();
        disConnect();

    }
    public void connect(){
        System.out.println("Connect");
    }
    public void disConnect (){
        System.out.println("Disconnect");
    }
    public void authenticate (){
        System.out.println("Authenticate");
    }
}
