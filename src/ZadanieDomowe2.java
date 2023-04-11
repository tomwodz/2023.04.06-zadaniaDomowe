import java.util.Scanner;

/*Logic-2 > noTeenSum
        prev  |  next  |  chance

        Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in the range 13..19 inclusive -- then that value counts as 0, except 15 and 16 do not count as a teens. Write a separate helper "public int fixTeen(int n) {"that takes in an int value and returns that value fixed for the teen rule. In this way, you avoid repeating the teen code 3 times (i.e. "decomposition"). Define the helper below and at the same indent level as the main noTeenSum().

        noTeenSum(1, 2, 3) → 6
        noTeenSum(2, 13, 1) → 3
        noTeenSum(2, 1, 14) → 3*/
public class ZadanieDomowe2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 3 liczby całkowite:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(toTeenSum(fixTeen(a),fixTeen(b),fixTeen(c)));

    }
    public static int fixTeen(int n) {
        int fix = n;
        if (n >= 13 && n <= 19 && n != 15 && n != 16) {
            fix = 0;
        }
        return fix;
    }

    public static int toTeenSum(int a, int b, int c){
        int toTeenSum = a + b + c;
        return toTeenSum;
    }

}
