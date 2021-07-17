package behavioral.strategy;

public class EncodeChaosStrategy implements EncodeStrategy {
    @Override
    public String encode(String data) {
        return "_SUPER HOT!_" + data + "_SUPER HOT!_";
    }
}
