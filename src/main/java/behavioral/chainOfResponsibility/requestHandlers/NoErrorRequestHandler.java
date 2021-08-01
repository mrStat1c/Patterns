package behavioral.chainOfResponsibility.requestHandlers;

import behavioral.chainOfResponsibility.Request;

public class NoErrorRequestHandler extends AbstractRequestHandler {

    @Override
    public void handle(Request request) {
        if (request.getErrors().isEmpty()) {
            System.out.println("Request processed by NoErrorRequestHandler...");
        } else {
            System.out.println("Request not processed by NoErrorRequestHandler and send to next handler...");
            this.nextRequestHandler.handle(request);
        }
    }
}
