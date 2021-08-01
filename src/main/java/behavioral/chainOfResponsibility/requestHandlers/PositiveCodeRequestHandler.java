package behavioral.chainOfResponsibility.requestHandlers;

import behavioral.chainOfResponsibility.Request;

public class PositiveCodeRequestHandler extends AbstractRequestHandler {

    @Override
    public void handle(Request request) {
        if (request.getCode() == 15 || request.getCode() == 25) {
            System.out.println("Request processed by PositiveCodeRequestHandler...");
        } else {
            System.out.println("Request not processed by PositiveCodeRequestHandler and send to next handler...");
            this.nextRequestHandler.handle(request);
        }
    }
}
