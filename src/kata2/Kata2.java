package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
    
        Integer[] data = {1, -10, 25, 898, 0, -456, 2, 11, 98, 345, 2, -24, -7890, 7, 99};
        Histogram histo = new Histogram(data);
        Map<Integer, Integer> histogr = histo.getHistogram();
        for (Map.Entry<Integer, Integer> entry : histogr.entrySet()) {
           System.out.println(entry.getKey() + "==> " + entry.getValue());
        }
        
    }
    
    
    
}
