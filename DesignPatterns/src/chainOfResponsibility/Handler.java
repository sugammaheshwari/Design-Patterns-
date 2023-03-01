package chainOfResponsibility;

public abstract class Handler {
    private Handler next;
    public Handler(Handler next) {
        this.next = next;
    }
    public void handleRequest(HttpRequest request){
        if(handle(request))
            next.handleRequest(request);
    }
    public abstract boolean handle(HttpRequest request);
}
