package structural.adapter;

import lombok.Getter;

public class X15_Report {

    @Getter
    private String msg;

    public X15_Report(String msg) {
        this.msg = msg;
    }

    public void createReport(){
        System.out.println("Advanced report msg = " + this.msg);
    }
}
