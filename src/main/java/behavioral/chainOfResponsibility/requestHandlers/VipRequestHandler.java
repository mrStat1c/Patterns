package behavioral.chainOfResponsibility.requestHandlers;

import behavioral.chainOfResponsibility.Request;

public class VipRequestHandler extends AbstractRequestHandler {

    @Override
    public void handle(Request request) {
        if (request.isVip()) {
            System.out.println("Request processed by VipRequestHandler...");
        } else {
            System.out.println("Request not processed by VipRequestHandler and send to next handler...");
            this.nextRequestHandler.handle(request);
        }
    }
}
