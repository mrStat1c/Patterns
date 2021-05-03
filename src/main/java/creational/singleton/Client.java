package creational.singleton;

public class Client {

    public static void main(String[] args) {

        GlobalDataSource globalDataSource = GlobalDataSource.getInstance();
        globalDataSource.setSomething("something");
    }
}
