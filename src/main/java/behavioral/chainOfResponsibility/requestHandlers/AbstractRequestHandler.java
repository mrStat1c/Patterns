package behavioral.chainOfResponsibility.requestHandlers;

import behavioral.chainOfResponsibility.Request;

public class AbstractRequestHandler {

    protected AbstractRequestHandler nextRequestHandler;

    public AbstractRequestHandler linkNextHandler(AbstractRequestHandler nextRequestHandler) {
        this.nextRequestHandler = nextRequestHandler;
        return nextRequestHandler;
    }

    public void handle(Request request) {
        this.nextRequestHandler.handle(request);
    }
}
