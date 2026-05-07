package Arrays;

public class SumOfArray {
    public static void main(String[] args) {
        int arr[]={5,6,8,6};
        int sum=0; // ise 0 se define karna hai
        for (int i=0;i< arr.length;i++){
            sum +=arr[i];
        }
        System.out.println(sum);
    }
}
