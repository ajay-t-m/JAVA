import java.util.Scanner;

public class Matrix{
public static void main(String[] args){
System.out.println("Name:Ajay T M\nRollno:23mca007\nTitle:Matrix Addition\nDate:13-02-2024\n");
Scanner scanner=new Scanner(System.in);

System.out.print("Enter the number of rows:");
int row=scanner.nextInt();
System.out.print("Enter the number of columns:");
int col=scanner.nextInt();

int[][] m1=new int[row][col];
System.out.println("\nEnter the elements of matrix1:");
for(int i=0;i<row;i++){
for(int j=0;j<col;j++){
m1[i][j]=scanner.nextInt();
}}

int[][] m2=new int[row][col];
System.out.println("\nEnter the elements of matrix2:");
for(int i=0;i<row;i++){
for(int j=0;j<row;j++){
m2[i][j]=scanner.nextInt();
}}

int[][] result=new int[row][col];
for(int i=0;i<row;i++){
for(int j=0;j<row;j++){
result[i][j]=m1[i][j]+m2[i][j];
}}

System.out.println("\nResults:");
for(int i=0;i<row;i++){
for(int j=0;j<row;j++){
System.out.print(result[i][j]+" ");
}
System.out.println();
}
scanner.close();
}}
