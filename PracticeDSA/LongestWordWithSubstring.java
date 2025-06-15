public class LongestWordWithSubstring  {
    public static int findLongestWordLength(String[ ] dict, String toSearch){
        if (dict == null || dict.length == 0 || toSearch == null || toSearch.isEmpty()) {
            return 0;
    }
        int maxLength = 0;
        String toLOwerCase= toSearch.toLowerCase();
        for (String str:dict){
            if (str.toLowerCase().contains(toLOwerCase)){
                maxLength=Math.max(maxLength,str.length());
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String[] dict = {"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"};
        String toSearch = "ODG";
        System.out.println(findLongestWordLength(dict, toSearch));
    }
}