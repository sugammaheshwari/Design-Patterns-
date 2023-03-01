package chainOfResponsibility;
public class Main {
    public static void main(String[] args)
    {
        HttpRequest httpRequest = new HttpRequest("Sugamm","Yolo@1234");

        Compressor compressor = new Compressor(null);
        Logger logger = new Logger(compressor);
        Authenticator authenticator = new Authenticator(logger);

        WebServer server = new WebServer(authenticator);
        server.handleHttpRequest(httpRequest);
    }
}
