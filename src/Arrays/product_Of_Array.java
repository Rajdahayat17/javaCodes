package Arrays;

public class product_Of_Array {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int product=1;  // ise 1 se define karna hai
        for (int i=0;i< arr.length;i++){
            product *=arr[i];
        }
        System.out.println(product);
    }
}
