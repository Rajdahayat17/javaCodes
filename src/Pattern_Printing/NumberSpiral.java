package Pattern_Printing;

import java.util.Scanner;

public class NumberSpiral {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {

                int a = i;
                int b = j;

                if (i > n) a = 2 * n - i;
                if (j > n) b = 2 * n - j;

                System.out.print(Math.min(a, b) + " ");
            }
            System.out.println();
        }
    }
}

/*
📌 Formula Section

Rows    = 2*n - 1
Columns = 2*n - 1

if(i > n) a = 2*n - i
if(j > n) b = 2*n - j

Print = min(a,b)

--------------------------------------------------

📊 Full Table (n = 4)

//| Row (i) | a Value | j=1 | j=2 | j=3 | j=4 | j=5 | j=6 | j=7 | Output Row            |
//| ------- | ------- | --- | --- | --- | --- | --- | --- | --- | --------------------- |
//| 1       | 1       | 1   | 1   | 1   | 1   | 1   | 1   | 1   | 1 1 1 1 1 1 1        |
//| 2       | 2       | 1   | 2   | 2   | 2   | 2   | 2   | 1   | 1 2 2 2 2 2 1        |
//| 3       | 3       | 1   | 2   | 3   | 3   | 3   | 2   | 1   | 1 2 3 3 3 2 1        |
//| 4       | 4       | 1   | 2   | 3   | 4   | 3   | 2   | 1   | 1 2 3 4 3 2 1        |
//| 5       | 3       | 1   | 2   | 3   | 3   | 3   | 2   | 1   | 1 2 3 3 3 2 1        |
//| 6       | 2       | 1   | 2   | 2   | 2   | 2   | 2   | 1   | 1 2 2 2 2 2 1        |
//| 7       | 1       | 1   | 1   | 1   | 1   | 1   | 1   | 1   | 1 1 1 1 1 1 1        |

--------------------------------------------------

✅ i → a Table

//| i | Condition (i>4) | a Value |
//|---|----------------|--------|
//| 1 | No             | 1      |
//| 2 | No             | 2      |
//| 3 | No             | 3      |
//| 4 | No             | 4      |
//| 5 | Yes            | 8-5=3  |
//| 6 | Yes            | 8-6=2  |
//| 7 | Yes            | 8-7=1  |

--------------------------------------------------

✅ j → b Table

//| j | Condition (j>4) | b Value |
//|---|----------------|--------|
//| 1 | No             | 1      |
//| 2 | No             | 2      |
//| 3 | No             | 3      |
//| 4 | No             | 4      |
//| 5 | Yes            | 8-5=3  |
//| 6 | Yes            | 8-6=2  |
//| 7 | Yes            | 8-7=1  |

--------------------------------------------------

🔥 Final Output

1 1 1 1 1 1 1
1 2 2 2 2 2 1
1 2 3 3 3 2 1
1 2 3 4 3 2 1
1 2 3 3 3 2 1
1 2 2 2 2 2 1
1 1 1 1 1 1 1

--------------------------------------------------

⏱ Time Complexity = O(n²)
💾 Space Complexity = O(1)

--------------------------------------------------

📌 Pattern Type:
Concentric Number Pattern
Mirror Number Spiral
Square Number Design
*/