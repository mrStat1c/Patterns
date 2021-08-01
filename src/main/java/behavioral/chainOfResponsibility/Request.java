package behavioral.chainOfResponsibility;

import lombok.Data;

import java.util.List;

@Data
public class Request {

    private String name;
    private boolean vip;
    private List<String> errors;
    private int code;
    private String message;

}
