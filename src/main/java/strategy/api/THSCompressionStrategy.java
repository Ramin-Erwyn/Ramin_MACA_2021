package strategy.api;

public class THSCompressionStrategy implements CompressionStrategy {
    @Override
    public String compress(String data) {
        return data + "THSCompressionStrategy";
    }
}
