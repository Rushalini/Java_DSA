public class ThirdMin {
    public static void main(String[] args) {
        int arr[]={1,2,3,-4,5,-6,7,8,9};
        int first=arr[0];
        int second=Byte.MAX_VALUE;
        int third=Byte.MAX_VALUE;
        int fpos=0;
        int spos=0;
        int tpos=0;
        for(int i=0;i<arr.length;i++){
            if(first>arr[i]){
                third=second;
                second=first;
                first=arr[i];
                fpos=i;
            }
            else if(second>arr[i] && arr[i]!=first&&fpos!=i){
                third=second;
                second=arr[i];
                spos=i;
            }
            else if(third>arr[i] && arr[i]>=second && tpos!=spos){
                third=arr[i];
                tpos=i;
            }
        }
        System.out.println("First Minimum: "+first);
        System.out.println("Second Minimum: "+second);
        System.out.println("Third Minimum: "+third);
    }
    
}
