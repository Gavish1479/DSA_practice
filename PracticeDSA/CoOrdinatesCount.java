public class CoOrdinatesCount {
    public static void main(String[] args) {
        int[] a={0,0};
        String s = "DURRDLLL";
        for (char ch:s.toCharArray()){
            switch (ch){
                case 'L':
                    a[0]=a[0]-1;
                    break;
                case 'R':
                    a[0]=a[0]+1;
                    break;
                case 'U':
                    a[1]=a[1]+1;
                    break;
                case 'D':
                    a[1]=a[1]-1;
                    break;

            }
        }
        for (int b:a){
            System.out.println(b);
        }
    }
}
