import java.util.Scanner;

;
public class newone {


        static void rotateArr(int arr[], int d) {

            int n = arr.length;

            d = d % n;

            reverse(arr, 0, d - 1);
            reverse(arr, d, n - 1);
            reverse(arr, 0, n - 1);
        }
        static void reverse(int[] arr, int i, int j) {
            while (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        static void printArray(int[] arr) {

            for (int ele : arr) {
                System.out.print(ele + " ");
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] arr = {1, 2, 3, 4, 5};
            int d = 2;
            rotateArr(arr, d);
            System.out.println("Rotated Array:");
            printArray(arr);
        }
    }
