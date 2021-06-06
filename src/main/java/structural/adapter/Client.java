package structural.adapter;

public class Client {



    public static void main(String[] args) {

//      нужно вызывать X15_Report.createReport(), но клиенту доступен только X12_Report.doWork()
        X12_Report x12_report = new X12_Report("SUPER HOT!");
        XReportAdapter adapter = new XReportAdapter();
        adapter.doWork(x12_report);

        
    }
}
