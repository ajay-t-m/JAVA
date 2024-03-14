import java.util.Scanner;
import java.util.Arrays;
public class sortstr{
    public static void main(String[] args){
	System.out.println("Name: Ajay T M\nRollno: 23mca007\nTitle: Sort String\nDate: 26-02-2024\n");
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of strings:\n");
        n = s.nextInt();
        String strings[] = new String[n];
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter all the Strings:");
        for(int i = 0; i < n; i++)
        {
            strings[i] = s1.nextLine();
        }
        System.out.println("\nArray: " + Arrays.toString(strings));
	Arrays.sort(strings);
	System.out.println("Sorted Array: " + Arrays.toString(strings));
    }
}
