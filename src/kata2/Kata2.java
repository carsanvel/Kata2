package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
    
        int[] data = {1, -10, 25, 898, 0, -456, 2, 11, 98, 345, 2, -24, -7890, 7, 99};
        HashMap<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        for (int i = 0; i < data.length; i++) {
            if(histogram.containsKey(data[i])) {
                histogram.put(data[i], histogram.get(data[i]) + 1);
            } else {
                histogram.put(data[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
           System.out.println(entry.getKey() + "==> " + entry.getValue());
        }
        
    }
    
    
    
}
