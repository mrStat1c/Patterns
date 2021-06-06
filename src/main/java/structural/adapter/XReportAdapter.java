package structural.adapter;

public class XReportAdapter {

    public void doWork(X12_Report report){
        new X15_Report(report.getMsg()).createReport();
    }
}