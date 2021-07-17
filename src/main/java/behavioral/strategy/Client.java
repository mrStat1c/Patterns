package behavioral.strategy;

public class Client {

    public static void main(String[] args) {

        String data = "Ashen men are always looking for coals.";
        Encoder encoder = new Encoder();

        encoder.setEncodeStrategy(new EncodeBase64Strategy());
        System.out.println("base64 encoded: " + encoder.encode(data));

        encoder.setEncodeStrategy(new EncodeChaosStrategy());
        System.out.println("chaos encoded: " + encoder.encode(data));
    }
}
