import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner month = new Scanner(System.in);
        System.out.println("What is your birth month 1-12?");
        int birthMonth = month.nextInt();

        if (birthMonth > 0 && birthMonth < 13)
        {
            System.out.println("Your birth month is: " + birthMonth);
        }
        else
        {
            System.out.println("You entered an incorrect month value: " + birthMonth);

        }

    }
}