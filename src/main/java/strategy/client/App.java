package strategy.client;

import strategy.api.CompressionContext;
import strategy.api.CompressionStrategy;
import strategy.api.LZHCompressionStrategy;
import strategy.api.THSCompressionStrategy;

public class App {
    public static void main(String[] args) {
        String data = "Donnée à compresser";
        CompressionContext cc = new CompressionContext(new THSCompressionStrategy());

        String compressedData = cc.compress(data);
        System.out.println(compressedData);

        CompressionStrategy strategy = new LZHCompressionStrategy();
        cc.setCompressionStrategy(strategy);
        System.out.println(cc.compress(compressedData));
    }
}
