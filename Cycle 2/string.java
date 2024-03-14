import java.util.Scanner;
public class string{
	public static void main(String[] args) {
		System.out.println("Name: Ajay T M\nRollno: 23mca007\nTitle: String\nDate: 14-03-2024\n");
		System.out.println("Enter The String:");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		System.out.println("Length of String:"+str1.length());
		System.out.println("Character at First position: "+str1.charAt(1));
		System.out.println("String Contains 'ly' sequence :"+str1.contains("ly"));
		System.out.println("String ends with e : "+str1.endsWith("e"));
		System.out.println("Replace 'ly' with 'ing' : "+str1.replaceAll("ly","ing"));
		System.out.println("LOWERCASE : "+str1.toLowerCase());
		System.out.println("UPPERCASE : "+str1.toUpperCase());
}
}
