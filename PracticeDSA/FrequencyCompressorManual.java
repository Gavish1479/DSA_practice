import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyCompressorManual {

    public static String compressFrequency(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        Map<Character, Integer> freqMap = new LinkedHashMap<>();

        // Step 1: Manually count character frequencies
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is already in the map
            if (freqMap.containsKey(ch)) {
                // Get current count and add 1
                int currentCount = freqMap.get(ch);
                freqMap.put(ch, currentCount + 1);
            } else {
                // Add character with count 1
                freqMap.put(ch, 1);
            }
        }

        // Step 2: Build the output string manually
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            result.append(entry.getKey());
            result.append(entry.getValue());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "abababcdc";
        String output = compressFrequency(input);
        System.out.println(output);  // Output: a3b3c2d1
    }
}

