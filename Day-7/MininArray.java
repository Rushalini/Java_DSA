public class MininArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        int min=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<arr[min]){
                min=i;
            }
        }
        System.out.println("Minimum element in the array is: " + arr[min]);
    }
}
