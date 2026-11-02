import java.util.Scanner;

public class findAllLeaders{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr = new int[]{sc.nextInt()};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println(max);
    }
}
//
//Q 3) give an a times n 2d matrix represeting an image rotate the image 90 degrees clockwise (in-place)
//Q 5) an element is a leader if it is greate than all elemets to its right the rightmist element is always a leder.
//
//
//
//Merga Overlapping Interval
//
//Boats to save people
//
//Rotate image (rotate 2d matrix 90 degrees clockwise)
//
//Circle Elimination
//
//find All leaders in an Array

