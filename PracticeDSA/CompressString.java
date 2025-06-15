public class CompressString {

    public static String compress(String string){

        if (string==null && string==""){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i < string.length() ; i++) {
            if (string.charAt(i)==string.charAt(i-1)){
                count++;

            }
            else {

                sb.append(string.charAt(i-1));
                sb.append(count);
                count=1;
            }
        }
        sb.append(string.charAt(string.length()-1));
        sb.append(count);
        return sb.toString();

    }

    public static void main(String[] args) {
        System.out.println(compress("aabbb"));
        System.out.println(compress("aaaa"));
        System.out.println(compress("a"));
    }
}
