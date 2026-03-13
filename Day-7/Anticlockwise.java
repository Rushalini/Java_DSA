public class Anticlockwise {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,6,7,8,9};
        
        int temp = arr[0];   // store first element
        
        for(int i = 0; i < arr.length-1; i++){
            arr[i] = arr[i+1];   // shift left
        }
        
        arr[arr.length-1] = temp;   // put first element at last
        
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}