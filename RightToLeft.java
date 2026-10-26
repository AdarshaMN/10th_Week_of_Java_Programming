package TenthWeek;
import java.util.Scanner;
public class RightToLeft {
    
    //Traversal from right to left
    int countRightToLeft(int[] number)
    {
        int count = 0;
        for(int index = number.length-1; index >= 0; index--)
        {
            count += number[index];
        }
        return count;
    }

    //Count Even Numbers From left to Right
    int countEvenNumbers(int[] numbers)
    {
        int countEven = 0;
        for(int index = numbers.length-1; index >= 0; index--)
        {
            if(numbers[index] % 2 == 0) {
                countEven++;
            }
        }
        return countEven;
    }

    //Find 1st -ve number from right to left traversal
    int findFirstNegitiveNum(int[] numbers) 
    {
        for(int index = numbers.length-1; index >= 0; index--)
        {
            if(numbers[index] < 0)
            {
                return numbers[index];
            }
        }
        return -1;
    }

    //Find Last +ve number from right to left traversal
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of Array: ");

        int n = sc.nextInt();

        System.out.println("Enter The " + n + " Elements");

        int num[] = new int[n];
        for(int index = 0; index < n; index++)
        {
            num[index] = sc.nextInt();
        }
        //Object Created Here
        RightToLeft rightToLeft = new RightToLeft();

        System.out.println(rightToLeft.countRightToLeft(num));
        sc.close();
    }
}
