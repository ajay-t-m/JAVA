import java.util.Scanner;

public class arrsearch{
public static void main(String[] args){
System.out.println("Name: Ajay T M\nRollno: 23mca007\nTitle: Array Search\nDate: 26-02-2024\n");
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the size of array:");
int size=scanner.nextInt();
int[] array= new int[size];
System.out.print("Enter the elemnts:");
for(int i=0;i<size;i++){
array[i]=scanner.nextInt();
}
System.out.print("Enter the element to search:");
int ele=scanner.nextInt();

boolean found=false;
for(int i=0;i<size;i++){
if(array[i]==ele){
found=true;
break;
}}

if (found){
System.out.println("Element "+ele+" found in array");
}else{
System.out.println("Element "+ele+" not found in array");
}
scanner.close();
}}
