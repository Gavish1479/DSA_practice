public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
//Find the median of two sorted arrays of different sizes.
//Example:
//arr1[] = {2, 3, 15, 18}
//arr2[] = {10, 12, 14, 16, 18, 20}
//Return 11 as the median
        int arr1[]={2,3,15,18};
        int arr2[]={10,12,14,16,18,20};
        int x=arr1.length;
        int y=arr2.length;
        int i=0;
        int j =0;
        int k =0;
        int arr3[] = new int[x+y];
        while (i < x && j < y){
            if (arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                i++;
                k++;
            }
            else {
                arr3[k]=arr2[j];
                j++;
                k++;
            }
        }
        while (i < x) {
            arr3[k++] = arr1[i++];
        }

        while (j < y) {
            arr3[k] = arr2[j];
            k++;
            j++;
        }
        for (int ab:arr3){
            System.out.println(ab);
        }
        // Find and print the median
        int totalLength=arr3.length;
        double median;
       if (totalLength%2==0 ){
            median=(arr3[totalLength/2 - 1]+arr3[totalLength/2])/2.0;
       }else {
           median=arr3[totalLength/2];
       }
        System.out.println(median);
    }
}
