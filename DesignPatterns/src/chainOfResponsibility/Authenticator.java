package chainOfResponsibility;

public class Authenticator extends Handler{
    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean handle(HttpRequest request) {
        if(request.getUserName().equals("Sugam") && request.getPassword().equals("Yolo@1234"))
        {
            System.out.println("Authentication Successful!!");
            return true;
        }
        System.out.println("Authentication Failed!!");
        return false;
    }
}
