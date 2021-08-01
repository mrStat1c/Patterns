package behavioral.chainOfResponsibility;

import behavioral.chainOfResponsibility.requestHandlers.AbstractRequestHandler;
import behavioral.chainOfResponsibility.requestHandlers.NoErrorRequestHandler;
import behavioral.chainOfResponsibility.requestHandlers.PositiveCodeRequestHandler;
import behavioral.chainOfResponsibility.requestHandlers.VipRequestHandler;

import java.util.Collections;

public class Client {

    public static void main(String[] args) {

        Request request = new Request();
        request.setName("RV13Y");
        request.setMessage("Hello, world!");
        request.setErrors(Collections.singletonList("404 Not found"));
        request.setCode(25);
        request.setVip(false);

        AbstractRequestHandler firstRequestHandler = new VipRequestHandler();
        firstRequestHandler
                .linkNextHandler(new NoErrorRequestHandler())
                .linkNextHandler(new PositiveCodeRequestHandler());

        firstRequestHandler.handle(request);
    }
}
