package behavioral.strategy;

import lombok.Setter;

public class Encoder {

    @Setter
    private EncodeStrategy encodeStrategy;

    public String encode(String data) {
        return encodeStrategy.encode(data);
    }
}
