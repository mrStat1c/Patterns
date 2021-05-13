package creational.builder;

public class Client {

    public static void main(String[] args) {

        VeryComplexObject veryComplexObjectWithoutCoords = new VeryComplexObjectBuilderImpl()
                .setName("Very Complex Object")
                .setSmart(false)
                .setIndex(1)
                .build();

        VeryComplexObject veryComplexObject = new VeryComplexObjectBuilderImpl()
                .setName("Very Complex Object")
                .setSmart(false)
                .setIndex(1)
                .setCoordX(153)
                .setCoordY(-15)
                .build();


        VeryComplexObject veryComplexChaosObject = new VeryComplexObjectChaosBuilderImpl()
                .setName("Very Complex Object")
                .setSmart(false)
                .setIndex(1)
                .setCoordX(153)
                .setCoordY(-15)
                .build();

        System.out.println("VeryComplexObjectWithoutCoords: " + veryComplexObjectWithoutCoords);
        System.out.println("VeryComplexObject: " + veryComplexObject);
        System.out.println("VeryComplexChaosObject: " + veryComplexChaosObject);
    }

}