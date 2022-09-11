package triangal;
import java.util.Scanner;

public class trian {
    static boolean triangular(int num)
    {
        if (num < 0)
            return false;
        int sum = 0;
        for (int n = 1; sum <= num; n++)
        {
            sum = sum + n;
            if (sum == num)
                return true;
        }
        return false;
    }
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = in.nextInt();
        if (triangular(n))
            System.out.print("Число треугольное");
        else
            System.out.print("Число не является треугольным");
    }
}
 