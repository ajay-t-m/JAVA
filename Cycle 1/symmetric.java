import java.util.Scanner;

public class symmetric{
public static void main(String[] args){
System.out.println("Name:Ajay T M\nRollno:23mca007\nTitle:Matrix Symmetric\nDate:14-02-2024\n");
Scanner input=new Scanner(System.in);
System.out.print("Enter the number of rows:");
int row=input.nextInt();
System.out.print("Enter the number of columns:");
int col=input.nextInt();

int[][] matrix=new int[row][col];
System.out.println("Enter the number of elements:");
for(int i=0;i<row;i++){
for(int j=0;j<col;j++){
matrix[i][j]=input.nextInt();
}}

System.out.println("\nMatrix:");
for(int i=0;i<row;i++){
for(int j=0;j<row;j++){
System.out.print(matrix[i][j]+" ");
}
System.out.println();
}

System.out.println("\nTranspose:");
for(int i=0;i<row;i++){
for(int j=0;j<row;j++){
System.out.print(matrix[j][i]+" ");
}
System.out.println();
}

boolean issym=true;
for(int i=0;i<row;i++){
for(int j=0;j<col;j++){
if(matrix[i][j]!=matrix[j][i]){
issym=false;
break;
}}
if(!issym){
break;
}}
if(issym){
System.out.println("\nThe matrix is symmteric");
}else{
System.out.println("\nThe matrix is not symmteric");
}}}
