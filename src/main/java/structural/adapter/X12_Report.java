package structural.adapter;

import lombok.Getter;

public class X12_Report {

    @Getter
    private String msg;

    public X12_Report(String msg) {
        this.msg = msg;
    }

    public void doWork(){
        System.out.println("Msg = " + this.msg);
    }
}
