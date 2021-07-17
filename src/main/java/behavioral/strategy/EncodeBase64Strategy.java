package behavioral.strategy;

import java.util.Base64;

public class EncodeBase64Strategy implements EncodeStrategy {

    @Override
    public String encode(String data) {
        return Base64.getEncoder().encodeToString(data.getBytes());
    }
}
