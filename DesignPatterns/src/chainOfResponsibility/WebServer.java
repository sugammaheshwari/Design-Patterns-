package chainOfResponsibility;
public class WebServer {
    private Handler handler;
    public WebServer(Handler handler) {
        this.handler = handler;
    }
    public void handleHttpRequest(HttpRequest request){
        handler.handleRequest(request);
    }
}