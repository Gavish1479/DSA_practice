public class LongestSameCharSubstring {
    public static void main(String[] args) {
        findLongestSameCharSubstring();
    }

    private static void findLongestSameCharSubstring() {
        int maxLength = 0;
        String str = "abcabcbb";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String subStr = str.substring(i, j);
                if (subStr.contains(String.valueOf(subStr.charAt(0)))) {
                    maxLength = Math.max(maxLength, subStr.length());
                }
            }
        }
        System.out.println(maxLength);


    }
}
