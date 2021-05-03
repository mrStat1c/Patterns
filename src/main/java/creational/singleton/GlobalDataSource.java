package creational.singleton;


/**
 * Singleton
 * Если код многопоточный, нужно синхронизировать потоки (см. https://refactoring.guru/ru/design-patterns/singleton/java/example#example-2)
 */
public class GlobalDataSource {

    private static GlobalDataSource dataSourceInstance;
    private static String something;

    private GlobalDataSource() {
    }

    public static GlobalDataSource getInstance() {

        if (dataSourceInstance == null) {
            dataSourceInstance = new GlobalDataSource();
        }
        return dataSourceInstance;
    }

    public void setSomething(String something) {
        GlobalDataSource.something = something;
    }
}