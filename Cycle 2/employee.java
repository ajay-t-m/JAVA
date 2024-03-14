import java.util.Scanner;
public class employee{
	int eno;
	String ename;
	double salary;
	public void getdetails(){
		System.out.println("\nEnter the employees details:");
		Scanner sc=new Scanner(System.in);
		System.out.println("Employee no:");
		eno=sc.nextInt();
		System.out.println("Name:");
		sc.nextLine();
		ename=sc.nextLine();
		System.out.println("Salary:");
		salary=sc.nextInt();
	}
	void display(){
		System.out.println("\nEmp No: " + eno);
		System.out.println("Emp Name: " + ename);
		System.out.println("Salary: " + salary);
	}
	public static void main(String[] args){
		System.out.println("Name: Ajay T M\nRollno: 23mca007\nTitle: Employee\nDate: 14-03-2024\n");
		System.out.println("Enter the no of employees:");
		Scanner sc1=new Scanner(System.in);
		int num=sc1.nextInt();
		employee a[]=new employee[num];
		for(int i=0;i<num;i++){
			a[i]=new employee();
			a[i].getdetails();
	}
	System.out.println("Information of all employees: ");
	for(int i=0;i<num;i++){
		a[i].display();
	}
	boolean state=false;
	System.out.println("\nEnter the employee no to get details: ");
	int num2=sc1.nextInt();
	for(int i=0;i<num;i++){
		if(a[i].eno==num2){
			System.out.println("\nEmployee details:");
			a[i].display();
		}
	}
}}
